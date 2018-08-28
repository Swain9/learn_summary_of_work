package com.catt.resteasy.client;

import com.catt.resteasy.api.ApiService;
import com.catt.resteasy.api.IPranApiService;
import com.catt.resteasy.api.RestController;
import com.catt.resteasy.api.RestRequestSpringService;
import com.catt.resteasy.pojo.RestFormRequest;
import com.catt.resteasy.pojo.RestRequest;
import com.catt.resteasy.pojo.ResultBean;
import com.catt.resteasy.util.JsonUtil;
import org.jboss.resteasy.client.ClientExecutor;
import org.jboss.resteasy.client.ProxyFactory;
import org.jboss.resteasy.client.core.executors.ApacheHttpClient4Executor;

/**
 * @author zhangmaolin
 * @version 0.0.1
 * @since 2018-08-15 17:11
 */
public class ClientController {
    private static String url = "http://localhost:8080/";

    public static void main(String[] args) {
        //test1();
//        test2();
        //test3();
        ClientExecutor executor = new ApacheHttpClient4Executor();
        RestRequestSpringService service = ProxyFactory.create(RestRequestSpringService.class, url, executor);
        ResultBean resultBean = service.test2();
        System.out.println(resultBean.getData());

    }

    private static void test3() {
        ClientExecutor executor = new ApacheHttpClient4Executor();
        IPranApiService service = ProxyFactory.create(IPranApiService.class, url, executor);
        ResultBean nihao = service.token("nihao", "123");
        System.out.println(nihao.getData());
    }

    private static void test2() {
        ClientExecutor executor = new ApacheHttpClient4Executor();
        ApiService service = ProxyFactory.create(ApiService.class, url, executor);
        ResultBean nihao = service.token("nihao");
        System.out.println(nihao.getData().toString());
    }

    private static void test1() {
        ClientExecutor executor = new ApacheHttpClient4Executor();
        RestController controller = ProxyFactory.create(RestController.class, url, executor);
        ResultBean show1 = controller.show1("你好");
        System.out.println(JsonUtil.objToJson(show1));

        ResultBean show2 = controller.show2("他好");
        System.out.println(JsonUtil.objToJson(show2));

        RestRequest request = new RestRequest();
        request.setParam("我也好");
        ResultBean show3 = controller.show3(request);
        System.out.println(JsonUtil.objToJson(show3));

        RestFormRequest formRequest = new RestFormRequest();
        formRequest.setId("222");
        formRequest.setParam("测试");
        ResultBean show4 = controller.show4(formRequest);
        System.out.println(JsonUtil.objToJson(show4));
    }

}
