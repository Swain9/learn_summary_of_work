package com.catt.resteasy.api;

import com.catt.resteasy.bo.VplsRequest;
import com.catt.resteasy.bo.VplsResponse;
import com.catt.resteasy.pojo.RestFormRequest;
import com.catt.resteasy.pojo.RestRequest;
import com.catt.resteasy.pojo.ResultBean;
import org.jboss.resteasy.annotations.Form;

import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

/**
 * https://blog.csdn.net/github_35758702/article/details/52614282
 *
 * @author zhangmaolin
 * @version 0.0.1
 * @since 2018-08-15 10:05
 */
@Path("/rest")
public interface RestController {
    /**
     * post请求
     *
     * @return
     */
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/show1")
    ResultBean show1(@FormParam("param") String param);

    /**
     * get请求
     *
     * @return
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/show2")
    ResultBean show2(@QueryParam("param") String param);

    /**
     * post json请求
     *
     * @return
     */
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/show3")
    ResultBean show3(RestRequest request);

    /**
     * post 表单请求
     * @param request
     * @return
     */
    @POST
    @Path("show4")
    @Produces(MediaType.APPLICATION_JSON)
    ResultBean show4(@Form RestFormRequest request);

    /**
     * 全网型业务开通
     * @param request
     * @return
     */
    @POST
    @Path("createVPLS")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    VplsResponse createVPLS(VplsRequest request);
}
