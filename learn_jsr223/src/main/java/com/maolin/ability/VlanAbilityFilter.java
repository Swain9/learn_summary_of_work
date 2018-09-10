package com.maolin.ability;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhangmaolin
 * @date 2018-09-10 13:58
 * @since 0.0.1
 */
public class VlanAbilityFilter extends AbilityFilter {
    private boolean vlan;
    private AbilityFilter filter;

    public VlanAbilityFilter(AbilityFilter filter, boolean vlan) {
        this.filter = filter;
        this.vlan = vlan;
    }

    @Override
    public List<Ability> getAbility(List<Ability> list) {

        List<Ability> newList = new ArrayList<Ability>();
        for (Ability type : list) {
            if (type.isVlan() == vlan) {
                newList.add(type);
            }
        }

        return filter.getAbility(newList);
    }
}
