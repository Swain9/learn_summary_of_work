package com.catt.resteasy.client;

import com.catt.resteasy.api.ApiService;
import com.catt.resteasy.api.IPranApiService;
import com.catt.resteasy.api.RestController;
import com.catt.resteasy.api.RestRequestSpringService;
import com.catt.resteasy.interceptor.BodyInterceptor;
import com.catt.resteasy.interceptor.ExceptionInterceptor;
import com.catt.resteasy.interceptor.NewHttpExecute;
import com.catt.resteasy.interceptor.TokenInterceptor;
import com.catt.resteasy.pojo.JacksonBean;
import com.catt.resteasy.pojo.RestFormRequest;
import com.catt.resteasy.pojo.RestRequest;
import com.catt.resteasy.pojo.ResultBean;
import com.catt.resteasy.test.ResponseList;
import com.catt.resteasy.test.common.RequestParam;
import com.catt.resteasy.test.common.ResponseResult;
import com.catt.resteasy.test.vpwsvpls.VplsBean;
import com.catt.resteasy.test.vpwsvpls.VpwsBean;
import com.catt.resteasy.test.vpwsvpls.VpwsVplsBindBean;
import com.catt.resteasy.test.vpwsvpls.VpwsVplsParam;
import com.catt.resteasy.test.vpwsvpls.VpwsVplsResult;
import com.catt.resteasy.util.JsonUtil;
import org.apache.http.protocol.BasicHttpContext;
import org.apache.http.protocol.DefaultedHttpContext;
import org.apache.http.protocol.HttpContext;
import org.jboss.resteasy.client.ClientExecutor;
import org.jboss.resteasy.client.ProxyFactory;
import org.jboss.resteasy.client.core.ClientErrorInterceptor;
import org.jboss.resteasy.client.core.executors.ApacheHttpClient4Executor;
import org.jboss.resteasy.core.interception.InterceptorRegistry;
import org.jboss.resteasy.spi.ResteasyProviderFactory;
import org.jboss.resteasy.spi.interception.ClientExecutionInterceptor;
import org.jboss.resteasy.spi.interception.MessageBodyReaderInterceptor;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;

/**
 * @author zhangmaolin
 * @version 0.0.1
 * @since 2018-08-15 17:11
 */
public class ClientController {
    private static String url = "http://localhost:8180/";

    public static void main(String[] args) {
        //test1();
        //test2();
        //test3();
        //test4();
        //测试多次调用
//        test5();
//        test5();
        //createVpwsVplsVpnBiz();
        //test6();

        ClientExecutor executor = new ApacheHttpClient4Executor();

        ResteasyProviderFactory factory = ResteasyProviderFactory.getInstance();

        InterceptorRegistry<ClientExecutionInterceptor> registry1 = factory.getClientExecutionInterceptorRegistry();
        registry1.register(new TokenInterceptor());

        InterceptorRegistry<MessageBodyReaderInterceptor> registry2 = factory.getClientMessageBodyReaderInterceptorRegistry();
        registry2.register(new BodyInterceptor());

        List<ClientErrorInterceptor> registry3 = factory.getClientErrorInterceptors();
        registry3.add(new ExceptionInterceptor());


        URI uri = URI.create(url);

        RestRequestSpringService service = ProxyFactory.create(RestRequestSpringService.class, uri, executor, factory);
        try {
            JacksonBean jacksonBean = new JacksonBean();
            jacksonBean.setUserName("bbbbbb");
            jacksonBean.setUserAge(11);
            String resultBean = service.test6(jacksonBean,"aaaaa");
            System.out.println(resultBean);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private static void test6() {
        ClientExecutor executor = new ApacheHttpClient4Executor();

        ResteasyProviderFactory factory = ResteasyProviderFactory.getInstance();

        InterceptorRegistry<ClientExecutionInterceptor> registry1 = factory.getClientExecutionInterceptorRegistry();
        registry1.register(new TokenInterceptor());

        InterceptorRegistry<MessageBodyReaderInterceptor> registry2 = factory.getClientMessageBodyReaderInterceptorRegistry();
        registry2.register(new BodyInterceptor());

        List<ClientErrorInterceptor> registry3 = factory.getClientErrorInterceptors();
        registry3.add(new ExceptionInterceptor());


        URI uri = URI.create(url);

        RestRequestSpringService service = ProxyFactory.create(RestRequestSpringService.class, uri, executor, factory);
        try {
            ResultBean resultBean = service.test4();
            System.out.println(resultBean);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void createVpwsVplsVpnBiz() {

        RequestParam<VpwsVplsParam> requestParam = new RequestParam<VpwsVplsParam>();
        requestParam.setPreview(true);
        requestParam.setBizId("11");
        VpwsVplsParam param = new VpwsVplsParam();
        /* 处理入参 开始*/

        param.setId("123"); //业务id
        param.setName("vpwsvplsvpn-biz-123"); //业务名称

        //vpws 参数可以参考 createL2vpn的参数
        String vpwsJson = "{\"workVcId\":\"200004\",\"protectVcId\":\"300001\",\"tpList\":[{\"neId\":\"4388259\",\"tpName\":\"GigabitEthernet1/0/0\",\"vlan\":\"100\",\"rate\":\"12M\"},{\"neId\":\"4388260\",\"tpName\":\"GigabitEthernet1/0/1\",\"vlan\":\"100\",\"rate\":\"12M\"}],\"workPathList\":[{\"aNeId\":\"4388259\",\"aTpName\":\"\",\"zNeId\":\"4378871\",\"zTpName\":\"\",\"aPwName\":\"1200001\",\"zPwName\":\"1200002\"},{\"aNeId\":\"4378871\",\"aTpName\":\"\",\"zNeId\":\"4388258\",\"zTpName\":\"\",\"aPwName\":\"1200003\",\"zPwName\":\"1200004\"},{\"aNeId\":\"4388258\",\"aTpName\":\"\",\"zNeId\":\"4388260\",\"zTpName\":\"\",\"aPwName\":\"1200005\",\"zPwName\":\"1200006\"}],\"protectPathList\":[{\"aNeId\":\"4388259\",\"aTpName\":\"\",\"zNeId\":\"4392259\",\"zTpName\":\"\",\"aPwName\":\"2200001\",\"zPwName\":\"2200002\"},{\"aNeId\":\"4392259\",\"aTpName\":\"\",\"zNeId\":\"4392260\",\"zTpName\":\"\",\"aPwName\":\"2200003\",\"zPwName\":\"2200004\"},{\"aNeId\":\"4392260\",\"aTpName\":\"\",\"zNeId\":\"4388260\",\"zTpName\":\"\",\"aPwName\":\"2200005\",\"zPwName\":\"2200006\"}]}";
        VpwsBean vpwsBean = JsonUtil.jsonToObj(vpwsJson, VpwsBean.class);
        param.setVpwsBean(vpwsBean);

        //vpls 参数可以参数 createVpls 的参数
        String vplsJson = "{\"vsiList\":[{\"neId\":\"3851190\",\"vsiName\":\"vplsad1\",\"rd\":\"10.10.1.1:1\",\"rtIn\":\"100:1\",\"rtOut\":\"100:1\"},{\"neId\":\"3851184\",\"vsiName\":\"vplsad1\",\"rd\":\"10.10.1.1:1\",\"rtIn\":\"100:1\",\"rtOut\":\"100:1\"}],\"vsiBindTpList\":[{\"neId\":\"3851190\",\"vsiName\":\"vplsad1\",\"tpName\":\"GigabitEthernet0/0/0\",\"ip\":\"\",\"mask\":\"\",\"vlan\":\"\",\"description\":\"\"},{\"neId\":\"3851184\",\"vsiName\":\"vplsad1\",\"tpName\":\"GigabitEthernet0/0/0\",\"ip\":\"\",\"mask\":\"\",\"vlan\":\"\",\"description\":\"\"}]}";

        VplsBean vplsBean = JsonUtil.jsonToObj(vplsJson, VplsBean.class);
        param.setVplsBean(vplsBean);

        //vpws和vpls绑定参数
        List<VpwsVplsBindBean> vpwsVplsBindBeans = new ArrayList<VpwsVplsBindBean>();
        VpwsVplsBindBean vpwsVplsBindBean = new VpwsVplsBindBean();
        vpwsVplsBindBeans.add(vpwsVplsBindBean);

        vpwsVplsBindBean.setaNeId("111");
        vpwsVplsBindBean.setzNeId("999");
        vpwsVplsBindBean.setaPeType("UPE");
        vpwsVplsBindBean.setzPeType("SPE");
        param.setVpwsVplsBindBeans(vpwsVplsBindBeans);


        /* 处理入参 结束*/
        requestParam.setDataObj(param);

        /* 处理 请求对象 */
//        ClientExecutor executor = new ApacheHttpClient4Executor();
        ClientExecutor executor = new NewHttpExecute();
        /*HttpContext httpContext = new BasicHttpContext();

        ((ApacheHttpClient4Executor) executor).setHttpContext();*/

        ResteasyProviderFactory factory = ResteasyProviderFactory.getInstance();

        InterceptorRegistry<ClientExecutionInterceptor> registry = factory.getClientExecutionInterceptorRegistry();
        registry.register(new TokenInterceptor());

        InterceptorRegistry<MessageBodyReaderInterceptor> clientMessageBodyReaderInterceptorRegistry = factory.getClientMessageBodyReaderInterceptorRegistry();
        clientMessageBodyReaderInterceptorRegistry.register(new BodyInterceptor());


        URI uri = URI.create(url);

        RestRequestSpringService service = ProxyFactory.create(RestRequestSpringService.class, uri, executor, factory);
        try {
            ResponseResult<VpwsVplsResult> result = service.createVpwsVplsVpnBiz(requestParam);
            System.out.println(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void test5() {
        ClientExecutor executor = new ApacheHttpClient4Executor();

        ResteasyProviderFactory factory = ResteasyProviderFactory.getInstance();

        InterceptorRegistry<ClientExecutionInterceptor> registry = factory.getClientExecutionInterceptorRegistry();

        registry.register(new TokenInterceptor());
        //todo 异常拦截器
        factory.addClientErrorInterceptor(new ExceptionInterceptor());

        URI uri = URI.create(url);

//        RestRequestSpringService service = ProxyFactory.create(RestRequestSpringService.class, url, executor);
        RestRequestSpringService service = ProxyFactory.create(RestRequestSpringService.class, uri, executor, factory);
        ResponseList<List<ResponseList<Object>>> listResponseList = service.test3();
        System.out.println(listResponseList);
    }

    private static void test4() {
        ClientExecutor executor = new ApacheHttpClient4Executor();

        ResteasyProviderFactory factory = ResteasyProviderFactory.getInstance();

        InterceptorRegistry<ClientExecutionInterceptor> registry = factory.getClientExecutionInterceptorRegistry();

        registry.register(new TokenInterceptor());

        URI uri = URI.create(url);

//        RestRequestSpringService service = ProxyFactory.create(RestRequestSpringService.class, url, executor);
        RestRequestSpringService service = ProxyFactory.create(RestRequestSpringService.class, uri, executor, factory);
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
