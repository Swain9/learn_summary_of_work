package com.catt.resteasy.bo;

/**
 * <PRE>
 * 这里填写类注释
 * </PRE>
 *
 * @author zhangmaolin
 * @version 1.0.0
 * @since 2018-11-15 16:57
 */
public class IrregularBean {

    private String UserName;
    private String UserAge;

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public String getUserAge() {
        return UserAge;
    }

    public void setUserAge(String userAge) {
        UserAge = userAge;
    }

    @Override
    public String toString() {
        return "IrregularBean{" +
                "UserName='" + UserName + '\'' +
                ", UserAge='" + UserAge + '\'' +
                '}';
    }
}
