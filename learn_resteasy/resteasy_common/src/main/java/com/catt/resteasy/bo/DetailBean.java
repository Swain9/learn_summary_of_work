package com.catt.resteasy.bo;

import java.io.Serializable;

/**
 * @author zhangmaolin
 * @version 0.0.1
 * @since 2018-08-16 15:08
 */
public class DetailBean implements Serializable {

    private String neId;
    private String detail;

    public String getNeId() {
        return neId;
    }

    public void setNeId(String neId) {
        this.neId = neId;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    @Override
    public String toString() {
        return "DetailBean{" +
                "neId='" + neId + '\'' +
                ", detail='" + detail + '\'' +
                '}';
    }
}
