package com.catt.resteasy.test.vpwsvpls;

import java.io.Serializable;

/**
 * @author zhangmaolin
 * @version 0.0.1
 * @since 2018-08-22 15:34
 */
public class PathBean implements Serializable {

    private String aNeId;
    private String aTpName;
    private String zNeId;
    private String zTpName;
    private String aPwName;
    private String zPwName;

    public String getaNeId() {
        return aNeId;
    }

    public void setaNeId(String aNeId) {
        this.aNeId = aNeId;
    }

    public String getaTpName() {
        return aTpName;
    }

    public void setaTpName(String aTpName) {
        this.aTpName = aTpName;
    }

    public String getzNeId() {
        return zNeId;
    }

    public void setzNeId(String zNeId) {
        this.zNeId = zNeId;
    }

    public String getzTpName() {
        return zTpName;
    }

    public void setzTpName(String zTpName) {
        this.zTpName = zTpName;
    }

    public String getaPwName() {
        return aPwName;
    }

    public void setaPwName(String aPwName) {
        this.aPwName = aPwName;
    }

    public String getzPwName() {
        return zPwName;
    }

    public void setzPwName(String zPwName) {
        this.zPwName = zPwName;
    }

    @Override
    public String toString() {
        return "PathBean{" +
                "aNeId='" + aNeId + '\'' +
                ", aTpName='" + aTpName + '\'' +
                ", zNeId='" + zNeId + '\'' +
                ", zTpName='" + zTpName + '\'' +
                ", aPwName='" + aPwName + '\'' +
                ", zPwName='" + zPwName + '\'' +
                '}';
    }
}
