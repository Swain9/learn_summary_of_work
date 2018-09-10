package com.maolin.ability;

import java.io.Serializable;

/**
 * @author zhangmaolin
 * @date 2018-09-10 12:26
 * @since 0.0.1
 */
public class Ability implements Serializable {
    private boolean vlan;
    private boolean slave;
    private String script;

    public boolean isVlan() {
        return vlan;
    }

    public void setVlan(boolean vlan) {
        this.vlan = vlan;
    }

    public boolean isSlave() {
        return slave;
    }

    public void setSlave(boolean slave) {
        this.slave = slave;
    }

    public String getScript() {
        return script;
    }

    public void setScript(String script) {
        this.script = script;
    }

    @Override
    public String toString() {
        return "Ability{" +
                "vlan=" + vlan +
                ", slave=" + slave +
                ", script='" + script + '\'' +
                '}';
    }
}
