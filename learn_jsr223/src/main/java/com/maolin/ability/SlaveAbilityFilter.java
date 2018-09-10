package com.maolin.ability;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhangmaolin
 * @date 2018-09-10 14:01
 * @since 0.0.1
 */
public class SlaveAbilityFilter extends AbilityFilter {
    private AbilityFilter filter;
    private boolean slave;

    public SlaveAbilityFilter(AbilityFilter filter, boolean slave) {
        this.filter = filter;
        this.slave = slave;
    }

    @Override
    public List<Ability> getAbility(List<Ability> list) {
        List<Ability> newList = new ArrayList<Ability>();
        for (Ability type : list) {
            if (type.isSlave() == slave) {
                newList.add(type);
            }
        }
        return filter.getAbility(newList);
    }
}
