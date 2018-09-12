package com.catt.resteasy.api;

import com.catt.resteasy.pojo.ResultBean;
import com.catt.resteasy.test.ResponseList;
import com.catt.resteasy.test.common.RequestParam;
import com.catt.resteasy.test.common.ResponseResult;
import com.catt.resteasy.test.vpwsvpls.VpwsVplsParam;
import com.catt.resteasy.test.vpwsvpls.VpwsVplsResult;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

/**
 * @author zhangmaolin
 * @version 0.0.1
 * @since 2018-08-28 17:29
 */
@Path("/api")
public interface RestRequestSpringService {

    /**
     * 测试springmvc
     *
     * @return
     */
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Path("test2")
    public ResultBean test2();

    /**
     * 复杂泛型测试
     *
     * @return
     */
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Path("test3")
    public ResponseList<List<ResponseList<Object>>> test3();

    /**
     * 测试 vpwsvpls
     *
     * @param requestParam
     * @return
     */
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    @Path("createVpwsVplsVpnBiz")
    public ResponseResult<VpwsVplsResult> createVpwsVplsVpnBiz(RequestParam<VpwsVplsParam> requestParam);
}
