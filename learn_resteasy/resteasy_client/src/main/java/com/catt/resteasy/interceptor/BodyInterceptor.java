package com.catt.resteasy.interceptor;

import org.jboss.resteasy.spi.interception.MessageBodyReaderContext;
import org.jboss.resteasy.spi.interception.MessageBodyReaderInterceptor;

import javax.ws.rs.WebApplicationException;
import java.io.IOException;
import java.io.InputStream;

/**
 * @author zhangmaolin
 * @date 2018-09-11 16:21
 * @since 0.0.1
 */
public class BodyInterceptor implements MessageBodyReaderInterceptor {
    /**
     * @param context
     * @return the object read
     * @throws IOException
     * @throws WebApplicationException
     */
    @Override
    public Object read(MessageBodyReaderContext context) throws IOException, WebApplicationException {
        InputStream inputStream = context.getInputStream();



        Object proceed = context.proceed();
        return proceed;
    }
}
