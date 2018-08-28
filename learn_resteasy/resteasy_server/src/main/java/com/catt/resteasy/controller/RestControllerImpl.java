package com.catt.resteasy.controller;

import com.catt.resteasy.api.RestController;
import com.catt.resteasy.bo.VplsRequest;
import com.catt.resteasy.bo.VplsResponse;
import com.catt.resteasy.pojo.RestFormRequest;
import com.catt.resteasy.pojo.RestRequest;
import com.catt.resteasy.pojo.ResultBean;
import org.springframework.stereotype.Controller;

/**
 * @author zhangmaolin
 * @version 0.0.1
 * @since 2018-08-15 16:52
 */
@Controller
public class RestControllerImpl implements RestController {
    /**
     * post请求
     *
     * @return
     */
    @Override
    public ResultBean show1(String param) {
        return ResultBean.ok(param);
    }

    /**
     * get请求
     *
     * @return
     */
    @Override
    public ResultBean show2(String param) {
        return ResultBean.ok(param);
    }

    /**
     * post json请求
     *
     * @return
     */
    @Override
    public ResultBean show3(RestRequest request) {
        return ResultBean.ok(request);
    }

    /**
     * post 表单请求
     *
     * @param request
     * @return
     */
    @Override
    public ResultBean show4(RestFormRequest request) {
        return ResultBean.ok(request);
    }

    @Override
    public VplsResponse createVPLS(VplsRequest request) {
        VplsResponse response = new VplsResponse();
        response.setVsiList(request.getVsiList());
        response.setVsiBindTpList(request.getVsiBindTpList());
        return response;
    }


}
