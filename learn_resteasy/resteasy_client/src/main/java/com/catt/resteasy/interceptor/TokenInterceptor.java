package com.catt.resteasy.interceptor;

import com.catt.resteasy.test.common.ResponseResult;
import org.jboss.resteasy.client.ClientRequest;
import org.jboss.resteasy.client.ClientResponse;
import org.jboss.resteasy.client.core.BaseClientResponse;
import org.jboss.resteasy.client.core.executors.ApacheHttpClient4Executor;
import org.jboss.resteasy.core.ResourceMethod;
import org.jboss.resteasy.core.ServerResponse;
import org.jboss.resteasy.spi.Failure;
import org.jboss.resteasy.spi.HttpRequest;
import org.jboss.resteasy.spi.interception.ClientExecutionContext;
import org.jboss.resteasy.spi.interception.ClientExecutionInterceptor;
import org.jboss.resteasy.spi.interception.PostProcessInterceptor;
import org.jboss.resteasy.spi.interception.PreProcessInterceptor;

import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MultivaluedMap;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * @author zhangmaolin
 * @version 0.0.1
 * @since 2018-08-29 13:59
 */
public class TokenInterceptor implements ClientExecutionInterceptor {

    private ThreadLocal<String> token = new InheritableThreadLocal<String>();

    @Override
    public ClientResponse execute(ClientExecutionContext clientExecutionContext) throws Exception {
        ClientRequest request = clientExecutionContext.getRequest();
        MultivaluedMap<String, String> headers = request.getHeaders();
        List<String> tokenList = new ArrayList<String>();
        tokenList.add("nihao");
        headers.put("token", tokenList);
        BaseClientResponse response = (BaseClientResponse) clientExecutionContext.proceed();
        MultivaluedMap responseHeaders = response.getHeaders();
        Object first = responseHeaders.getFirst("Content-Type");
        if (first == null) {
            System.out.println("服务端返回值为null");
            responseHeaders.putSingle("Content-Type","application/json;charset=UTF-8");
            BaseClientResponse.BaseClientResponseStreamFactory streamFactory = response.getStreamFactory();
            streamFactory.performReleaseConnection();
        }
        //response.setReturnType(ResponseResult.class);
        System.out.println("=========================================================================================");

        return response;

    }

}
