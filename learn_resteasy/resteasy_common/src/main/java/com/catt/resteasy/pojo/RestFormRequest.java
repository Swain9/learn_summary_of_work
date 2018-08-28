package com.catt.resteasy.pojo;

import javax.ws.rs.FormParam;

/**
 * @author zhangmaolin
 * @version 0.0.1
 * @since 2018-08-15 16:55
 */
public class RestFormRequest {
    @FormParam("id")
    private String id;
    @FormParam("param")
    private String param;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getParam() {
        return param;
    }

    public void setParam(String param) {
        this.param = param;
    }
}
