package com.catt.resteasy.util;

import com.catt.resteasy.exception.RtException;
import org.apache.commons.lang3.StringUtils;

/**
 * @author zhangmaolin
 * @version 0.0.1
 * @since 2018-08-28 14:04
 */
public class Assert {
    public static void isBlank(String str, String message) {
        if (StringUtils.isBlank(str)) {
            throw new RtException(message);
        }
    }

    public static void isNull(Object object, String message) {
        if (object == null) {
            throw new RtException(message);
        }
    }
}
