package com.catt.resteasy.test.vpwsvpls;

import java.util.List;

/**
 * @author zhangmaolin
 * @date 2018-09-07 17:16
 * @since 0.0.1
 */
public class VpwsVplsParam {

    private String id;
    private String name;
    private VpwsBean vpwsBean;
    private VplsBean vplsBean;
    private List<VpwsVplsBindBean> vpwsVplsBindBeans;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public VpwsBean getVpwsBean() {
        return vpwsBean;
    }

    public void setVpwsBean(VpwsBean vpwsBean) {
        this.vpwsBean = vpwsBean;
    }

    public VplsBean getVplsBean() {
        return vplsBean;
    }

    public void setVplsBean(VplsBean vplsBean) {
        this.vplsBean = vplsBean;
    }

    public List<VpwsVplsBindBean> getVpwsVplsBindBeans() {
        return vpwsVplsBindBeans;
    }

    public void setVpwsVplsBindBeans(List<VpwsVplsBindBean> vpwsVplsBindBeans) {
        this.vpwsVplsBindBeans = vpwsVplsBindBeans;
    }
}
