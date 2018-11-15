package com.catt.resteasy;

import com.catt.resteasy.bo.IrregularBean;
import com.catt.resteasy.util.JsonUtil;
import org.junit.Test;

/**
 * <PRE>
 * 这里填写类注释
 * </PRE>
 *
 * @author zhangmaolin
 * @version 1.0.0
 * @since 2018-11-15 16:58
 */
public class UtilTest {

    @Test
    public void testIrregular(){
        IrregularBean irregularBean = new IrregularBean();

        irregularBean.setUserAge("20");
        irregularBean.setUserName("你好");

        String json = JsonUtil.objToJson(irregularBean);

        IrregularBean bean = JsonUtil.jsonToObj(json, IrregularBean.class);
        System.out.println(bean);
    }
}
