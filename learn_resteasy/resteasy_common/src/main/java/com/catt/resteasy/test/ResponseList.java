package com.catt.resteasy.test;

/**
 * @author zhangmaolin
 * @date 2018-09-11 10:45
 * @since 0.0.1
 */
public class ResponseList<T> {
    private String name;
    private String value;
    private T dataObj;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public T getDataObj() {
        return dataObj;
    }

    public void setDataObj(T dataObj) {
        this.dataObj = dataObj;
    }
}
