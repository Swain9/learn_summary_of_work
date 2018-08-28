package com.catt.resteasy.controller;

import com.catt.resteasy.api.ApiService;
import com.catt.resteasy.pojo.ResultBean;
import org.springframework.stereotype.Controller;

/**
 * @author zhangmaolin
 * @version 0.0.1
 * @since 2018-08-28 15:15
 */
@Controller
public class ApiController implements ApiService {
    /**
     * get请求
     *
     * @param token
     * @return
     */
    @Override
    public ResultBean token(String token) {
        return ResultBean.ok(token);
    }
}
