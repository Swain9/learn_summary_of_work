package com.catt.resteasy.test.vpwsvpls;

import java.io.Serializable;
import java.util.List;

/**
 * @author zhangmaolin
 * @date 2018-09-07 17:17
 * @since 0.0.1
 */
public class VplsBean implements Serializable {
    private List<VsiBean> vsiList;
    private List<VsiBindTpBean> vsiBindTpList;
    private List<VplsPes> vplsPesList;
    private List<VplsAcNes> vplsAcNesList;


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

    public List<VplsPes> getVplsPesList() {
        return vplsPesList;
    }

    public void setVplsPesList(List<VplsPes> vplsPesList) {
        this.vplsPesList = vplsPesList;
    }

    public List<VplsAcNes> getVplsAcNesList() {
        return vplsAcNesList;
    }

    public void setVplsAcNesList(List<VplsAcNes> vplsAcNesList) {
        this.vplsAcNesList = vplsAcNesList;
    }

    @Override
    public String toString() {
        return "VplsBean{" +
                "vsiList=" + vsiList +
                ", vsiBindTpList=" + vsiBindTpList +
                ", vplsPesList=" + vplsPesList +
                ", vplsAcNesList=" + vplsAcNesList +
                '}';
    }
}
