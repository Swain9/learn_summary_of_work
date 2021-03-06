package com.catt.resteasy.controller;

import com.catt.resteasy.annotation.Token;
import com.catt.resteasy.bean.ServerJacksonBean;
import com.catt.resteasy.pojo.JacksonBean;
import com.catt.resteasy.pojo.ResultBean;
import com.catt.resteasy.test.ResponseList;
import com.catt.resteasy.test.common.RequestParam;
import com.catt.resteasy.test.common.ResponseResult;
import com.catt.resteasy.test.vpwsvpls.VpwsVplsParam;
import com.catt.resteasy.test.vpwsvpls.VpwsVplsResult;
import com.catt.resteasy.util.JsonUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

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
    public ResultBean test2() {
        return ResultBean.ok();
    }

    /**
     * 复杂泛型测试
     *
     * @return
     */
    @RequestMapping("/test3")
    @ResponseBody
    public ResponseList<List<ResponseList<Object>>> test3() {
        ResponseList<List<ResponseList<Object>>> test = new ResponseList<List<ResponseList<Object>>>();
        List<ResponseList<Object>> list = new ArrayList<ResponseList<Object>>();
        ResponseList<Object> resp = new ResponseList<Object>();
        resp.setName("下层name");
        resp.setValue("下层value");
        resp.setDataObj("神奇");
        list.add(resp);
        test.setDataObj(list);
        test.setName("上层name");
        test.setValue("上层value");
        return test;
    }

    @RequestMapping("/createVpwsVplsVpnBiz")
    @ResponseBody
    public ResponseResult<VpwsVplsResult> createVpwsVplsVpnBiz(@RequestBody RequestParam<VpwsVplsParam> requestParam) {
        String bizId = requestParam.getBizId();

        if ("1".equals(bizId)) {
            ResponseResult<VpwsVplsResult> response = new ResponseResult<VpwsVplsResult>();
            return response;
        } else {
            //todo 如果返回null，那么response的时候就不会携带 Content-type 属性。
            return null;
        }

    }

    /**
     * 测试客户端异常拦截器
     *
     * @return
     */
    @RequestMapping("/test4")
    @ResponseBody
    public ResultBean test4(HttpServletResponse response) {
        response.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
        return ResultBean.error();
    }

    @RequestMapping("/test5")
    @ResponseBody
    public String test5(@RequestBody JacksonBean jacksonBean) {
        String json = JsonUtil.objToJson(jacksonBean);
        System.out.println(json);
        return json;
    }
    @RequestMapping("/test6")
    @ResponseBody
    public String test6(JacksonBean jacksonBean, String name) {
        String json = JsonUtil.objToJson(jacksonBean);
        System.out.println(json);
        System.out.println(name);
        return json;
    }
}
