package com.maolin;

import com.maolin.ability.Ability;
import com.maolin.ability.AbilityFilter;
import com.maolin.ability.SlaveAbilityFilter;
import com.maolin.ability.VlanAbilityFilter;
import org.junit.Test;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineFactory;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * java ScriptEngine 使用
 * https://www.cnblogs.com/zhangtan/p/8110210.html
 * Java SE 6 新特性对脚本语言的支持
 * https://www.ibm.com/developerworks/cn/java/j-lo-jse66/
 * ScriptEngine 进阶技巧（JDK 6.0）
 * http://www.thinksite.cn/show-39-7354-1.html
 * JAVA使用脚本引擎执行JS
 * https://www.cnblogs.com/maydow/p/4781823.html
 *
 * @author zhangmaolin
 * @date 2018-09-10 10:24
 * @since 0.0.1
 */
public class JavaScriptTest {
    /**
     * 第一步：打印js引擎的基本信息
     * jdk6 和 jdk8 打印的结果不一样
     * 【jdk8】
     * Name: Oracle Nashorn
     * Version: 1.8.0_171
     * Language name: ECMAScript
     * Language version: ECMA - 262 Edition 5.1
     * Extensions: [js]
     * Mime types: [application/javascript, application/ecmascript, text/javascript, text/ecmascript]
     * Names: [nashorn, Nashorn, js, JS, JavaScript, javascript, ECMAScript, ecmascript]
     */
    @Test
    public void testBaseInfo() {
        ScriptEngineManager manager = new ScriptEngineManager();
        // 得到所有的脚本引擎工厂
        List<ScriptEngineFactory> factories = manager.getEngineFactories();
        // 这是Java SE 5 和Java SE 6的新For语句语法
        for (ScriptEngineFactory factory : factories) {
            // 打印脚本信息
            System.out.printf("Name: %s%n" +
                            "Version: %s%n" +
                            "Language name: %s%n" +
                            "Language version: %s%n" +
                            "Extensions: %s%n" +
                            "Mime types: %s%n" +
                            "Names: %s%n",
                    factory.getEngineName(),
                    factory.getEngineVersion(),
                    factory.getLanguageName(),
                    factory.getLanguageVersion(),
                    factory.getExtensions(),
                    factory.getMimeTypes(),
                    factory.getNames());
            // 得到当前的脚本引擎
            ScriptEngine engine = factory.getScriptEngine();
        }
    }

    /**
     * 第二步：获取js引擎
     */
    @Test
    public void testGetEngine() {
        ScriptEngineManager manager = new ScriptEngineManager();
        //根据扩展名得到脚本引擎
        ScriptEngine engineByExtension = manager.getEngineByExtension("js");
        //根据Mime类型得到脚本引擎
        ScriptEngine engineByMimeType = manager.getEngineByMimeType("text/javascript");
        //根据名称得到脚本引擎
        ScriptEngine engineByName = manager.getEngineByName("javascript");
    }

    /**
     * 第三步：使用js引擎
     */
    @Test
    public void testUseEngine() {
        ScriptEngineManager manager = new ScriptEngineManager();
        //根据名称得到脚本引擎
        ScriptEngine engine = manager.getEngineByName("javascript");
        try {
            // 开始运行脚本，并返回当前的小时
            // 这个例子最值得注意的是执行的2句脚本，最后一句是date.getHours()。
            // 并未将这个值赋给一个javascript变量。这时，eval方法就将这样的值返回。
            // 这有些类似C语言的(…)运算符。如(c=a+b, c + d),这个表达式的返回值是a+b+d。
            Double hour = (Double) engine.eval("var date = new Date();" + "date.getHours();");
            String msg;
            // 将小时转换为问候信息
            if (hour < 12) {
                msg = "上午好";
            } else if (hour < 18) {
                msg = "下午好";
            } else if (hour < 23) {
                msg = "晚上好";
            } else {
                msg = "晚安";
            }
            System.out.printf("小时=%s: %s%n", hour, msg);
        } catch (ScriptException e) {
            System.err.println(e);
        }
    }


    /**
     * java6内置JS引擎初接触
     * https://blog.csdn.net/sdyy321/article/details/6959199
     */
    @Test
    public void testScript() {
        String basedir = System.getProperty("user.dir");
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(new File(basedir + "/src/main/resources/script.txt")));

            StringBuilder builder = new StringBuilder();
            String read;
            while ((read = reader.readLine()) != null) {
                builder.append(read).append("\n");
            }
            System.out.println(builder.toString());
            List<Ability> abilities = new ArrayList<Ability>();
            String scriptWithoutJs = processScript(builder, abilities);

            boolean hasVlan = false;
            boolean hasSlave = false;

            AbilityFilter filter = new AbilityFilter();
            VlanAbilityFilter vlanFilter = new VlanAbilityFilter(filter, hasVlan);
            SlaveAbilityFilter slaveFilter = new SlaveAbilityFilter(vlanFilter, hasSlave);

            List<Ability> theOne = slaveFilter.getAbility(abilities);

            System.out.println(theOne.size());
            Ability ability = theOne.get(0);
            System.out.println(ability.toString());

            //脚本替换
            String format = MessageFormat.format(scriptWithoutJs, ability.getScript());
            System.out.println(format);


        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    private Pattern pattern = Pattern.compile("<javascript>([\\s\\S]*)</javascript>");

    /**
     * 处理脚本，并返回无js的脚本
     *
     * @param builder
     * @param list
     * @return
     * @throws ScriptException
     */
    private String processScript(StringBuilder builder, List<Ability> list) throws ScriptException {
        ScriptEngineManager manager = new ScriptEngineManager();
        //根据名称得到脚本引擎
        ScriptEngine engine = manager.getEngineByName("javascript");
        String str = builder.toString();
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            String group = matcher.group(1);
            engine.eval(group);
            Map<String, String> abilityMap = (Map<String, String>) engine.get("ability");

            for (Map.Entry<String, String> entry : abilityMap.entrySet()) {
                Ability ability = new Ability();
                String key = entry.getKey();
                processKey(key, ability);
                String value = entry.getValue();
                ability.setScript(value);
                list.add(ability);
            }

            return matcher.replaceAll("");
        }
        throw new RuntimeException("错误的脚本，请检查脚本是否正确。");
    }

    /**
     * 处理关键字符串
     *
     * @param key
     * @param ability
     */
    private void processKey(String key, Ability ability) {
        String[] keys = key.split("_");
        for (int i = 0; i < keys.length; i++) {
            if ("VLAN".equals(keys[i])) {
                ability.setVlan(true);
                continue;
            }
            if ("NOVLAN".equals(keys[i])) {
                ability.setVlan(false);
                continue;
            }
            if ("SLAVE".equals(keys[i])) {
                ability.setSlave(true);
                continue;
            }
            if ("NOSLAVE".equals(keys[i])) {
                ability.setSlave(false);
            }
        }
    }

}
