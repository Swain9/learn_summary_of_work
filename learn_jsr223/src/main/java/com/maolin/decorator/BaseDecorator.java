package com.maolin.decorator;

import java.util.List;

/**
 * 基础过滤类，不做过滤
 *
 * @author zhangmaolin
 * @date 2018-09-10 09:35
 * @since 0.0.1
 */
public class BaseDecorator implements Component {
    /**
     * 过滤能力
     * 对最终结果做校验处理
     *
     * @param list 能力列表
     * @return 过滤后的能力列表
     */
    @Override
    public List<AbilityType> getAbility(List<AbilityType> list) {
        if (list != null && list.size() == 1) {
            return list;
        }
        throw new RuntimeException("结果为null或返回结果不唯一");
    }
}
