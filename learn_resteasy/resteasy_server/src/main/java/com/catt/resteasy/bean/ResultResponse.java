package com.catt.resteasy.bean;

/**
 * @author zhangmaolin
 * @version 0.0.1
 * @since 2018-08-15 13:11
 */
public class ResultResponse {
    private String success;
    private Object object;

    public String getSuccess() {
        return success;
    }

    public void setSuccess(String success) {
        this.success = success;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }
}
