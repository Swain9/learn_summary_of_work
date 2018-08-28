package com.catt.resteasy.bo;

import java.io.Serializable;
import java.util.List;

/**
 * @author zhangmaolin
 * @version 0.0.1
 * @since 2018-08-16 15:03
 */
public class VplsResponse implements Serializable {

    private String status;
    private String useTime;

    private List<ScriptBean> scriptList;
    private List<DetailBean> detailList;

    private List<VsiBean> vsiList;
    private List<VsiBindTpBean> vsiBindTpList;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getUseTime() {
        return useTime;
    }

    public void setUseTime(String useTime) {
        this.useTime = useTime;
    }

    public List<ScriptBean> getScriptList() {
        return scriptList;
    }

    public void setScriptList(List<ScriptBean> scriptList) {
        this.scriptList = scriptList;
    }

    public List<DetailBean> getDetailList() {
        return detailList;
    }

    public void setDetailList(List<DetailBean> detailList) {
        this.detailList = detailList;
    }

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
        return "VplsResponse{" +
                "status='" + status + '\'' +
                ", useTime='" + useTime + '\'' +
                ", scriptList=" + scriptList +
                ", detailList=" + detailList +
                ", vsiList=" + vsiList +
                ", vsiBindTpList=" + vsiBindTpList +
                '}';
    }
}
