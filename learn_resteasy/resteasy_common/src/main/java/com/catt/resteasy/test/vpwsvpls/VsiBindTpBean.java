package com.catt.resteasy.test.vpwsvpls;

import java.io.Serializable;

/**
 * @author zhangmaolin
 * @version 0.0.1
 * @since 2018-08-16 14:32
 */
public class VsiBindTpBean implements Serializable {

    private String neId;
    private String vsiName;
    private String tpName;
    private String ip;
    private String mask;
    private String vlan;
    private String description;

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

    public String getTpName() {
        return tpName;
    }

    public void setTpName(String tpName) {
        this.tpName = tpName;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getMask() {
        return mask;
    }

    public void setMask(String mask) {
        this.mask = mask;
    }

    public String getVlan() {
        return vlan;
    }

    public void setVlan(String vlan) {
        this.vlan = vlan;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "VsiBindTpBean{" +
                "neId='" + neId + '\'' +
                ", vsiName='" + vsiName + '\'' +
                ", tpName='" + tpName + '\'' +
                ", ip='" + ip + '\'' +
                ", mask='" + mask + '\'' +
                ", vlan='" + vlan + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
