package com.catt.resteasy.test.vpwsvpls;

import java.io.Serializable;
import java.util.List;

/**
 * @author zhangmaolin
 * @date 2018-09-07 17:17
 * @since 0.0.1
 */
public class VpwsBean implements Serializable {
    private String workVcId;
    private String protectVcId;
    private List<TpQosBean> tpList;
    private List<PathBean> workPathList;
    private List<PathBean> protectPathList;

    public String getWorkVcId() {
        return workVcId;
    }

    public void setWorkVcId(String workVcId) {
        this.workVcId = workVcId;
    }

    public String getProtectVcId() {
        return protectVcId;
    }

    public void setProtectVcId(String protectVcId) {
        this.protectVcId = protectVcId;
    }

    public List<TpQosBean> getTpList() {
        return tpList;
    }

    public void setTpList(List<TpQosBean> tpList) {
        this.tpList = tpList;
    }

    public List<PathBean> getWorkPathList() {
        return workPathList;
    }

    public void setWorkPathList(List<PathBean> workPathList) {
        this.workPathList = workPathList;
    }

    public List<PathBean> getProtectPathList() {
        return protectPathList;
    }

    public void setProtectPathList(List<PathBean> protectPathList) {
        this.protectPathList = protectPathList;
    }

    @Override
    public String toString() {
        return "VpwsBean{" +
                "workVcId='" + workVcId + '\'' +
                ", protectVcId='" + protectVcId + '\'' +
                ", tpList=" + tpList +
                ", workPathList=" + workPathList +
                ", protectPathList=" + protectPathList +
                '}';
    }
}
