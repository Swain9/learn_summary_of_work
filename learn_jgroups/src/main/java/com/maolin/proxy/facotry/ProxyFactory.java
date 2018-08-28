package com.maolin.proxy.facotry;

import com.maolin.proxy.service.DemoService;
import com.maolin.proxy.service.impl.DemoServiceImpl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author zhangmaolin
 * @version 0.0.1
 * @since 2018-07-30 15:22
 */
public class ProxyFactory {


    public static DemoService getDemoService() {
        final DemoService demoService = new DemoServiceImpl();
        DemoService instance = (DemoService) Proxy.newProxyInstance(demoService.getClass().getClassLoader(), demoService.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                Object rtValue = null;
                //获取args，进行前置处理

                try {
                    rtValue = method.invoke(demoService, args);
                } catch (Exception e) {

                }
                //进行后置处理。

                return rtValue;
            }
        });
        return instance;
    }


}
