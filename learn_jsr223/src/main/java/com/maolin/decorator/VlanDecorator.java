package com.maolin.decorator;

import java.util.ArrayList;
import java.util.List;

/**
 * 过滤vlan的能力
 *
 * @author zhangmaolin
 * @date 2018-09-10 09:35
 * @since 0.0.1
 */
public class VlanDecorator implements Decorator {

    private boolean vlan;
    private Component component;

    public VlanDecorator(Component component, boolean vlan) {
        this.component = component;
        this.vlan = vlan;
    }

    /**
     * 过滤能力
     * 过滤vlan的能力
     *
     * @param list 能力列表
     * @return 过滤后的能力列表
     */
    @Override
    public List<AbilityType> getAbility(List<AbilityType> list) {
        List<AbilityType> newList = new ArrayList<AbilityType>();
        for (AbilityType type : list) {
            if (type.isVlan() == vlan) {
                newList.add(type);
            }
        }
        return component.getAbility(newList);
    }
}
