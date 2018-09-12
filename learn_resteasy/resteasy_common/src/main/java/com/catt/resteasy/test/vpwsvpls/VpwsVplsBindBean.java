package com.catt.resteasy.test.vpwsvpls;

import java.io.Serializable;

/**
 * @author zhangmaolin
 * @date 2018-09-07 17:19
 * @since 0.0.1
 */
public class VpwsVplsBindBean implements Serializable {

    private String aNeId;
    private String zNeId;
    private String aPeType;
    private String zPeType;

    public String getaNeId() {
        return aNeId;
    }

    public void setaNeId(String aNeId) {
        this.aNeId = aNeId;
    }

    public String getzNeId() {
        return zNeId;
    }

    public void setzNeId(String zNeId) {
        this.zNeId = zNeId;
    }

    public String getaPeType() {
        return aPeType;
    }

    public void setaPeType(String aPeType) {
        this.aPeType = aPeType;
    }

    public String getzPeType() {
        return zPeType;
    }

    public void setzPeType(String zPeType) {
        this.zPeType = zPeType;
    }

    @Override
    public String toString() {
        return "VpwsVplsBindBean{" +
                "aNeId='" + aNeId + '\'' +
                ", zNeId='" + zNeId + '\'' +
                ", aPeType='" + aPeType + '\'' +
                ", zPeType='" + zPeType + '\'' +
                '}';
    }
}
