package com.catt.resteasy.exception;

/**
 * @author zhangmaolin
 * @version 0.0.1
 * @since 2018-08-28 13:50
 */
public class RtException extends RuntimeException {

    private String msg;
    private int code = 500;

    public RtException(String msg) {
        super(msg);
        this.msg = msg;
    }

    public RtException(String msg, Throwable e) {
        super(msg, e);
        this.msg = msg;
    }

    public RtException(String msg, int code) {
        super(msg);
        this.msg = msg;
        this.code = code;
    }

    public RtException(String msg, int code, Throwable e) {
        super(msg, e);
        this.msg = msg;
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

}
