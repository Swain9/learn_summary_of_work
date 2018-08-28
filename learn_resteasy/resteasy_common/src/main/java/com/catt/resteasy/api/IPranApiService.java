package com.catt.resteasy.api;

import com.catt.resteasy.annotation.Token;
import com.catt.resteasy.pojo.ResultBean;

import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

/**
 * @author zhangmaolin
 * @version 0.0.1
 * @since 2018-08-28 14:18
 */
@Path("/api")
public interface IPranApiService {

    /**
     * 用户登陆获取token
     *
     * @param username
     * @param password
     * @return
     */
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Path("token")
    public ResultBean token(@FormParam("username") String username, @FormParam("password") String password);

    /**
     * 测试
     * @return
     */
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Path("test")
    public ResultBean test();

}
