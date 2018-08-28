package com.catt.resteasy.pojo;

import javax.ws.rs.FormParam;

/**
 * @author zhangmaolin
 * @version 0.0.1
 * @since 2018-08-15 10:30
 */
public class RestRequest {

    @FormParam("param")
    private String param;

    public String getParam() {
        return param;
    }

    public void setParam(String param) {
        this.param = param;
    }
}
