package com.catt.resteasy.controller;

import com.catt.resteasy.annotation.Token;
import com.catt.resteasy.pojo.ResultBean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author zhangmaolin
 * @version 0.0.1
 * @since 2018-08-28 17:22
 */
@Controller
@RequestMapping("/api")
public class TokenForSpringController {

    @Token
    @RequestMapping("/test2")
    @ResponseBody
    public ResultBean test2(){
        return ResultBean.ok();
    }

}
