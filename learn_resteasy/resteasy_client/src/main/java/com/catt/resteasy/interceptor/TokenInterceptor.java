package com.catt.resteasy.interceptor;

import org.jboss.resteasy.client.ClientRequest;
import org.jboss.resteasy.client.ClientResponse;
import org.jboss.resteasy.core.ServerResponse;
import org.jboss.resteasy.spi.interception.ClientExecutionContext;
import org.jboss.resteasy.spi.interception.ClientExecutionInterceptor;
import org.jboss.resteasy.spi.interception.PostProcessInterceptor;

import javax.ws.rs.core.MultivaluedMap;
import java.util.ArrayList;
import java.util.List;

/**
 * @author zhangmaolin
 * @version 0.0.1
 * @since 2018-08-29 13:59
 */
public class TokenInterceptor implements ClientExecutionInterceptor  {

    private ThreadLocal<String> token = new InheritableThreadLocal<String>();

    @Override
    public ClientResponse execute(ClientExecutionContext clientExecutionContext) throws Exception {
        ClientRequest request = clientExecutionContext.getRequest();
        MultivaluedMap<String, String> headers = request.getHeaders();
        List<String> tokenList = new ArrayList<String>();
        tokenList.add("nihao");
        headers.put("token", tokenList);
        ClientResponse response = clientExecutionContext.proceed();

        return response;

    }
}
