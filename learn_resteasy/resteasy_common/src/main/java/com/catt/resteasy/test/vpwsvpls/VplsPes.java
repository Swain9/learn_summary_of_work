package com.catt.resteasy.test.vpwsvpls;

import java.io.Serializable;

/**
 * @author zhangmaolin
 * @date 2018-09-07 17:32
 * @since 0.0.1
 */
public class VplsPes implements Serializable {
    private String neId;
    private String peType;

    public String getNeId() {
        return neId;
    }

    public void setNeId(String neId) {
        this.neId = neId;
    }

    public String getPeType() {
        return peType;
    }

    public void setPeType(String peType) {
        this.peType = peType;
    }

    @Override
    public String toString() {
        return "VplsPes{" +
                "neId='" + neId + '\'' +
                ", peType='" + peType + '\'' +
                '}';
    }
}
