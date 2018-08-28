package com.catt.resteasy.controller;

import com.catt.resteasy.api.IPranApiService;
import com.catt.resteasy.pojo.ResultBean;
import com.catt.resteasy.util.JwtUtils;
import com.catt.resteasy.util.Assert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.HashMap;
import java.util.Map;

/**
 * @author zhangmaolin
 * @version 0.0.1
 * @since 2018-08-28 10:42
 */
@Controller
public class IPranApiServiceController implements IPranApiService {

    @Autowired
    private JwtUtils jwtUtils;

    @Override
    public ResultBean token(String username, String password) {
        Assert.isBlank(username, "用户名不能为空");
        Assert.isBlank(password, "密码不能为空");

        //模拟用户登录
        String userId = username + password;

        //生成token
        String token = jwtUtils.generateToken(userId);

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("token", token);
        map.put("expire", jwtUtils.getExpire());

        return ResultBean.ok(map);
    }

    /**
     * 测试
     *
     * @return
     */
    @Override
    public ResultBean test() {
        return ResultBean.ok();
    }

}
