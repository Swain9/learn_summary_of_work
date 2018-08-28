package com.catt.resteasy.api;

import com.catt.resteasy.pojo.ResultBean;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

/**
 * @author zhangmaolin
 * @version 0.0.1
 * @since 2018-08-28 15:09
 */
@Path("/api")
public interface ApiService {

    /**
     * get请求
     *
     * @param token
     * @return
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/token")
    ResultBean token(@QueryParam("token") String token);
}
