package com.catt.resteasy.exception;

import com.catt.resteasy.pojo.ResultBean;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author zhangmaolin
 * @version 0.0.1
 * @since 2018-08-28 13:51
 */
@ControllerAdvice
public class GlobalExceptionHandle {
    /**
     * 自定义异常处理
     *
     * @param e RtException
     * @return ResultBean
     */
    @ExceptionHandler(RtException.class)
    @ResponseBody
    public ResultBean handleRtException(RtException e) {
        return ResultBean.error(e.getCode(), e.getMsg());
    }

}
