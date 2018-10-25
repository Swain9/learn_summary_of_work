package com.maolin.spring3.controller;

import com.maolin.spring3.pojo.SpringELBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

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
    //无解析器
    @RequestMapping("/show1")
    public String show1(){
        return "show1.jsp";
    }
    //有解析器
    @RequestMapping("/show2")
    public ModelAndView show2(){
        ModelAndView mav = new ModelAndView();
        mav.setViewName("nihao");
        return mav;
    }
    @RequestMapping("/show3")
    @ResponseBody
    public String show3(){
        return "你好";
    }

}
