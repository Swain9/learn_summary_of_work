package com.catt.resteasy.bo;

import java.io.Serializable;
import java.util.List;

/**
 * @author zhangmaolin
 * @version 0.0.1
 * @since 2018-08-16 14:28
 */
public class VplsRequest implements Serializable {
    private List<VsiBean> vsiList;
    private List<VsiBindTpBean> vsiBindTpList;

    public List<VsiBean> getVsiList() {
        return vsiList;
    }

    public void setVsiList(List<VsiBean> vsiList) {
        this.vsiList = vsiList;
    }

    public List<VsiBindTpBean> getVsiBindTpList() {
        return vsiBindTpList;
    }

    public void setVsiBindTpList(List<VsiBindTpBean> vsiBindTpList) {
        this.vsiBindTpList = vsiBindTpList;
    }

    @Override
    public String toString() {
        return "VplsRequest{" +
                "vsiList=" + vsiList +
                ", vsiBindTpList=" + vsiBindTpList +
                '}';
    }
}
