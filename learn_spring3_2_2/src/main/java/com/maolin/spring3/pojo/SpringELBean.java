package com.maolin.spring3.pojo;

/**
 * @author zhangmaolin
 * @date 2018-09-30 16:29
 * @since 0.0.1
 */
public class SpringELBean {

    private String jarPath;
    private String userDir;
    private String osName;

    public String getJarPath() {
        return jarPath;
    }

    public void setJarPath(String jarPath) {
        this.jarPath = jarPath;
    }

    public String getOsName() {
        return osName;
    }

    public void setOsName(String osName) {
        this.osName = osName;
    }

    public String getUserDir() {
        return userDir;
    }

    public void setUserDir(String userDir) {
        this.userDir = userDir;
    }

    @Override
    public String toString() {
        return "SpringELBean{" +
                "jarPath='" + jarPath + '\'' +
                ", userDir='" + userDir + '\'' +
                ", osName='" + osName + '\'' +
                '}';
    }
}
