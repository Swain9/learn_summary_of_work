package com.catt.resteasy.pojo;

import org.codehaus.jackson.annotate.JsonProperty;

/**
 * @author zhangmaolin
 * @date 2018-09-28 17:57
 * @since 0.0.1
 */
public class JacksonBean {

    @JsonProperty(value = "USER_NAME")
    private String userName;
    @JsonProperty(value = "USER_AGE")
    private Integer userAge;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getUserAge() {
        return userAge;
    }

    public void setUserAge(Integer userAge) {
        this.userAge = userAge;
    }

    @Override
    public String toString() {
        return "JacksonBean{" +
                "userName='" + userName + '\'' +
                ", userAge=" + userAge +
                '}';
    }
}
