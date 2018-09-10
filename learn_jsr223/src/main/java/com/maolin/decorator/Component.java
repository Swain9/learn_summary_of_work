package com.maolin.decorator;

import java.util.List;

/**
 * 能力列表获取接口
 *
 * @author zhangmaolin
 * @date 2018-09-10 09:20
 * @since 0.0.1
 */
public interface Component {


    /**
     * 过滤能力
     *
     * @param list 能力列表
     * @return 过滤后的能力列表
     */
    public List<AbilityType> getAbility(List<AbilityType> list);

}
