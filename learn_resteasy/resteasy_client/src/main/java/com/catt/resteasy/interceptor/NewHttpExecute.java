package com.catt.resteasy.interceptor;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpRequestBase;
import org.jboss.resteasy.client.ClientRequest;
import org.jboss.resteasy.client.ClientResponse;
import org.jboss.resteasy.client.core.BaseClientResponse;
import org.jboss.resteasy.client.core.SelfExpandingBufferredInputStream;
import org.jboss.resteasy.client.core.executors.ApacheHttpClient4Executor;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author zhangmaolin
 * @date 2018-09-11 18:23
 * @since 0.0.1
 */
public class NewHttpExecute extends ApacheHttpClient4Executor {

    @Override
    public ClientResponse execute(ClientRequest request) throws Exception {
        String uri = request.getUri();
        final HttpRequestBase httpMethod = createHttpMethod(uri, request.getHttpMethod());
        try {
            loadHttpMethod(request, httpMethod);

            final HttpResponse res = httpClient.execute(httpMethod, httpContext);
            HttpEntity entity = res.getEntity();

            BaseClientResponse response = new BaseClientResponse(new BaseClientResponse.BaseClientResponseStreamFactory() {
                InputStream stream;

                @Override
                public InputStream getInputStream() throws IOException {
                    if (stream == null) {
                        HttpEntity entity = res.getEntity();
                        if (entity == null) {
                            return null;
                        }
                        stream = new SelfExpandingBufferredInputStream(entity.getContent());
                    }
                    return stream;
                }

                @Override
                public void performReleaseConnection() {
                    // Apache Client 4 is stupid, You have to get the InputStream and close it if there is an entity
                    // otherwise the connection is never released. There is, of course, no close() method on response
                    // to make this easier.
                    try {
                        if (stream != null) {
                            stream.close();
                        } else {
                            InputStream is = getInputStream();
                            if (is != null) {
                                is.close();
                            }
                        }
                    } catch (Exception ignore) {
                    }
                }
            }, this);
            response.setAttributes(request.getAttributes());
            response.setStatus(res.getStatusLine().getStatusCode());
            response.setHeaders(extractHeaders(res));
            response.setProviderFactory(request.getProviderFactory());
            return response;
        } finally {
            cleanUpAfterExecute(httpMethod);
        }
    }
    private HttpRequestBase createHttpMethod(String url, String restVerb)
    {
        if ("GET".equals(restVerb))
        {
            return new HttpGet(url);
        }
        else if ("POST".equals(restVerb))
        {
            return new HttpPost(url);
        }
        else
        {
            final String verb = restVerb;
            return new HttpPost(url)
            {
                @Override
                public String getMethod()
                {
                    return verb;
                }
            };
        }
    }
}
