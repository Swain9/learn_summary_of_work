package com.catt.resteasy.controller;

import com.catt.resteasy.bean.ParamRequest;
import com.catt.resteasy.bean.ResultResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

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
 * https://www.cnblogs.com/chen-lhx/p/5599806.html
 *
 * @author zhangmaolin
 * @version 0.0.1
 * @since 2018-08-15 10:31
 */
@Path("/test")
@Controller
public class TestController /*implements RestController*/ {
    /*@Override
    public ResultBean show() {
        ResultBean ok = ResultBean.ok("成功");
        return ok;
    }*/

    @RequestMapping(value = "/{url}")
    public String url(@PathVariable String url) {
        return url;
    }

    @RequestMapping(value = {"/", ""})
    public String index() {
        return url("index");
    }

    /**
     * 总结：post或表单形式的参数，需要使用@FormParam获取 key=value
     *
     * @param param
     * @return
     */
    @Path("show1")
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public ResultResponse show1(@FormParam("param") String param) {
        ResultResponse response = new ResultResponse();
        response.setSuccess("200");
        response.setObject(param);
        return response;
    }

    /**
     * 总结：get请求的方式，需要使用@QueryParam获取，url?key=value
     *
     * @param param
     * @return
     */
    @Path("/show2")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public ResultResponse show2(@QueryParam("param") String param) {
        ResultResponse response = new ResultResponse();
        response.setSuccess("200");
        response.setObject(param);
        return response;
    }

    /**
     * 接收json参数转javabean，客户端请求必须携带
     * Content-Type:application/json;charset=UTF-8
     * 且请求参数必须是 “标准json字符串”
     *
     * @param request
     * @return
     */
    @Path("/show3")
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public ResultResponse show3(ParamRequest request) {
        ResultResponse response = new ResultResponse();
        response.setSuccess("200");
        response.setObject(request.getParam());
        return response;
    }
}
