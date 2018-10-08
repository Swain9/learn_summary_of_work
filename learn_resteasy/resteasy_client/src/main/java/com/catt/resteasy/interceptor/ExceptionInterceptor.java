package com.catt.resteasy.interceptor;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.jboss.resteasy.client.ClientResponse;
import org.jboss.resteasy.client.core.ClientErrorInterceptor;

/**
 * @author zhangmaolin
 * @date 2018-09-19 09:19
 * @since 0.0.1
 */
public class ExceptionInterceptor implements ClientErrorInterceptor {
    private final Logger logger = LogManager.getLogger(LoggingInterceptor.class);

    /**
     * Attempt to handle the current {@link ClientResponse}. If this method
     * returns successfully, the next registered
     * {@link ClientErrorInterceptor} will attempt to handle the
     * {@link ClientResponse}. If this method throws an exception, no further
     * interceptors will be processed.
     *
     * @param response
     * @throws RuntimeException RestEasy will abort request processing if any exception is
     *                          thrown from this method.
     */
    @Override
    public void handle(ClientResponse<?> response) throws RuntimeException {
        System.out.println("=========================================================================================");
        //当调用错误的时候，可以使用这个拦截器进行拦截，以确保意外发生的情况下转入自己的处理模式
        if (response.getStatus() == 404) {
            logger.error("调用出现404错误......");
            throw new RuntimeException("Error Status 404 Not Found returned");
        } else if (response.getStatus() == 500) {
            logger.error("调用出现500错误......");
            throw new RuntimeException("Error Status 500 服务端出现异常");
        } else if (response.getStatus() != 200) {
            logger.error("调用出现" + response.getStatus() + "错误......");
            throw new RuntimeException("Error Status " + response.getStatus());
        }
    }
}
