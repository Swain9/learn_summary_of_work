package com.maolin.ability;

import java.util.List;

/**
 * @author zhangmaolin
 * @date 2018-09-10 13:55
 * @since 0.0.1
 */
public class AbilityFilter {

    public List<Ability> getAbility(List<Ability> list) {
        if (list != null && list.size() == 1) {
            return list;
        }
        throw new RuntimeException("结果为null或返回结果不唯一");
    }

}
