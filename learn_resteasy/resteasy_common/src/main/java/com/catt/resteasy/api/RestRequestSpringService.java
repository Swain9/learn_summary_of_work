package com.catt.resteasy.api;

import com.catt.resteasy.pojo.ResultBean;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * @author zhangmaolin
 * @version 0.0.1
 * @since 2018-08-28 17:29
 */
@Path("/api")
public interface RestRequestSpringService {

    /**
     * 测试springmvc
     * @return
     */
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Path("test2")
    public ResultBean test2();

}
