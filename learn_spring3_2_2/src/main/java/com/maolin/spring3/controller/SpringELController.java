package com.maolin.spring3.controller;

import com.maolin.spring3.pojo.SpringELBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author zhangmaolin
 * @date 2018-09-30 16:27
 * @since 0.0.1
 */
@Controller
public class SpringELController {

    @Autowired
    private SpringELBean springELBean;

    @RequestMapping("/test1")
    public void test(){
        System.out.println(springELBean.toString());
    }

}
