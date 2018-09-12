package com.catt.resteasy;

import com.catt.resteasy.test.ResponseList;
import com.catt.resteasy.util.JsonUtil;
import org.codehaus.jackson.type.TypeReference;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhangmaolin
 * @date 2018-09-11 10:45
 * @since 0.0.1
 */
public class ResponseTest {

    @Test
    public void test() {
        ResponseList<List<ResponseList<Object>>> test = new ResponseList<List<ResponseList<Object>>>();
        List<ResponseList<Object>> list = new ArrayList<ResponseList<Object>>();
        ResponseList<Object> resp = new ResponseList<Object>();
        resp.setName("下层name");
        resp.setValue("下层value");
        resp.setDataObj("神奇");
        list.add(resp);
        test.setDataObj(list);
        test.setName("上层name");
        test.setValue("上层value");

        String s = JsonUtil.objToJson(test);
        System.out.println(s);

        //错误的解析方式
        //ResponseList<List<ResponseList<Object>>> test2 = JsonUtil.jsonToObj(s, ResponseList.class);
        //List<ResponseList<Object>> dataObj = test2.getDataObj();
        //for (ResponseList<Object> response : dataObj) {
        //    System.out.println(response.getName());
        //    System.out.println(response.getValue());
        //    System.out.println(response.getDataObj());
        //}
        ResponseList<List<ResponseList<Object>>> test2 = JsonUtil.jsonToObj(s, new TypeReference<ResponseList<List<ResponseList<Object>>>>() {

        });
        List<ResponseList<Object>> dataObj = test2.getDataObj();
        for (ResponseList<Object> response : dataObj) {
            System.out.println(response.getName());
            System.out.println(response.getValue());
            System.out.println(response.getDataObj());
        }
        System.out.println(test2);
    }
}
