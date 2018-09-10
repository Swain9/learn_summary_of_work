package com.maolin.decorator;

/**
 * @author zhangmaolin
 * @date 2018-09-10 09:21
 * @since 0.0.1
 */
public class AbilityType {

    /**
     * 有无vlan
     */
    private boolean vlan;
    /**
     * 有无主备
     */
    private boolean slave;

    /**
     * true：动态
     * false：静态
     */
    private boolean dynamic;

    /**
     * a端
     * true：动态
     * false：静态
     */
    private boolean aPort;
    /**
     * z端
     * true：动态
     * false：静态
     */
    private boolean zPort;

    /**
     * 能力类型
     */
    private AbilityEnum abilityEnum;

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

    public boolean isDynamic() {
        return dynamic;
    }

    public void setDynamic(boolean dynamic) {
        this.dynamic = dynamic;
    }

    public boolean isaPort() {
        return aPort;
    }

    public void setaPort(boolean aPort) {
        this.aPort = aPort;
    }

    public boolean iszPort() {
        return zPort;
    }

    public void setzPort(boolean zPort) {
        this.zPort = zPort;
    }

    public AbilityEnum getAbilityEnum() {
        return abilityEnum;
    }

    public void setAbilityEnum(AbilityEnum abilityEnum) {
        this.abilityEnum = abilityEnum;
    }
}
