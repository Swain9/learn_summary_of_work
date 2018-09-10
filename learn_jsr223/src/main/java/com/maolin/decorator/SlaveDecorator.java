package com.maolin.decorator;

import java.util.ArrayList;
import java.util.List;

/**
 * 过滤主备的能力
 *
 * @author zhangmaolin
 * @date 2018-09-10 09:46
 * @since 0.0.1
 */
public class SlaveDecorator implements Decorator {
    private boolean slave;
    private Component component;

    public SlaveDecorator(Component component, boolean slave) {
        this.component = component;
        this.slave = slave;
    }

    /**
     * 过滤能力
     * 过滤是否有主备
     *
     * @param list 能力列表
     * @return 过滤后的能力列表
     */
    @Override
    public List<AbilityType> getAbility(List<AbilityType> list) {
        List<AbilityType> newList = new ArrayList<AbilityType>();
        for (AbilityType type : list) {
            if (type.isSlave() == slave) {
                newList.add(type);
            }
        }
        return component.getAbility(newList);
    }
}
