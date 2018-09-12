package com.catt.resteasy.test.vpwsvpls;

import java.io.Serializable;

/**
 * @author zhangmaolin
 * @version 0.0.1
 * @since 2018-08-22 14:17
 */
public class TpQosBean implements Serializable {
    private String neId;
    private String tpName;
    private String vlan;
    private String rate;

    public String getNeId() {
        return neId;
    }

    public void setNeId(String neId) {
        this.neId = neId;
    }

    public String getTpName() {
        return tpName;
    }

    public void setTpName(String tpName) {
        this.tpName = tpName;
    }

    public String getVlan() {
        return vlan;
    }

    public void setVlan(String vlan) {
        this.vlan = vlan;
    }

    public String getRate() {
        return rate;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }

    @Override
    public String toString() {
        return "TpQosBean{" +
                "neId='" + neId + '\'' +
                ", tpName='" + tpName + '\'' +
                ", vlan='" + vlan + '\'' +
                ", rate='" + rate + '\'' +
                '}';
    }
}
