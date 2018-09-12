package com.catt.resteasy.test.vpwsvpls;

import java.io.Serializable;

/**
 * @author zhangmaolin
 * @version 0.0.1
 * @since 2018-08-16 14:30
 */
public class VsiBean implements Serializable {

    private String neId;
    private String vsiName;
    private String rd;
    private String rtIn;
    private String rtOut;

    public String getNeId() {
        return neId;
    }

    public void setNeId(String neId) {
        this.neId = neId;
    }

    public String getVsiName() {
        return vsiName;
    }

    public void setVsiName(String vsiName) {
        this.vsiName = vsiName;
    }

    public String getRd() {
        return rd;
    }

    public void setRd(String rd) {
        this.rd = rd;
    }

    public String getRtIn() {
        return rtIn;
    }

    public void setRtIn(String rtIn) {
        this.rtIn = rtIn;
    }

    public String getRtOut() {
        return rtOut;
    }

    public void setRtOut(String rtOut) {
        this.rtOut = rtOut;
    }

    @Override
    public String toString() {
        return "VsiBean{" +
                "neId='" + neId + '\'' +
                ", vsiName='" + vsiName + '\'' +
                ", rd='" + rd + '\'' +
                ", rtIn='" + rtIn + '\'' +
                ", rtOut='" + rtOut + '\'' +
                '}';
    }
}
