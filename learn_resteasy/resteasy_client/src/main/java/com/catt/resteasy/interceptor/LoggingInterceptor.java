package com.catt.resteasy.interceptor;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.jboss.resteasy.annotations.interception.ClientInterceptor;
import org.jboss.resteasy.core.ResourceMethod;
import org.jboss.resteasy.core.ServerResponse;
import org.jboss.resteasy.spi.Failure;
import org.jboss.resteasy.spi.HttpRequest;
import org.jboss.resteasy.spi.interception.PreProcessInterceptor;

import javax.ws.rs.WebApplicationException;
import javax.ws.rs.ext.Provider;

/**
 * @author zhangmaolin
 * @date 2018-09-11 14:55
 * @since 0.0.1
 */
@Provider
@ClientInterceptor
public class LoggingInterceptor implements PreProcessInterceptor {
    private final Logger logger = LogManager.getLogger(LoggingInterceptor.class);
    /**
     * Preprocess resource method invocation
     *
     * @param request
     * @param method
     * @return null unless the interceptor is returning its own response
     */
    @Override
    public ServerResponse preProcess(HttpRequest request, ResourceMethod method) throws Failure, WebApplicationException {
        String methodName = request.getHttpMethod();
        logger.info("Receiving request from: " + request.getUri());
        logger.info("Attempt to invoke method \"" + methodName + "\"");
        if (methodName.equals("calculateAllBasicTrigonometricFunctions")) {
            logger.info("\tCalculate will be performed with parameters:");
            logger.info("\tAdjacent: "
                    + request.getFormParameters().get("adjacent"));
            logger.info("\tOpposite: "
                    + request.getFormParameters().get("opposite"));
            logger.info("\tHypotenusa: "
                    + request.getFormParameters().get("hypotenusa"));
        }
        if (methodName.equals("history")) {
            logger.info("Retrieving history...");
        }
        if (methodName.equals("clearAll")) {
            logger.info("User CLIENT is trying to clear the history...");
        }
        return null;
    }
}
