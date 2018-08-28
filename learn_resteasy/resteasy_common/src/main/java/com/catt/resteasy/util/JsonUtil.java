package com.catt.resteasy.util;

import org.codehaus.jackson.map.ObjectMapper;

/**
 * @author zhangmaolin
 * @version 0.0.1
 * @since 2018-08-15 17:40
 */
public class JsonUtil {
    /**
     * read和write是线程安全的，所以可以定义为全局变量
     */
    private static ObjectMapper mapper = new ObjectMapper();

    public static String objToJson(Object obj) {
        try {
            String json = mapper.writeValueAsString(obj);
            return json;
        } catch (Exception e) {
            return null;
        }
    }

    public static <T> T jsonToObj(String json, Class<T> clazz) {
        if (json == null || "".equals(json.trim()) || clazz == null) {
            return null;
        }
        try {
            return mapper.readValue(json, clazz);
        } catch (Exception e) {
            return null;
        }
    }

}
