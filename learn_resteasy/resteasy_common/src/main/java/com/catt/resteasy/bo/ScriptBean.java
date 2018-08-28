package com.catt.resteasy.bo;

import java.io.Serializable;

/**
 * @author zhangmaolin
 * @version 0.0.1
 * @since 2018-08-16 15:07
 */
public class ScriptBean implements Serializable {

    private String neId;
    private String script;

    public String getNeId() {
        return neId;
    }

    public void setNeId(String neId) {
        this.neId = neId;
    }

    public String getScript() {
        return script;
    }

    public void setScript(String script) {
        this.script = script;
    }

    @Override
    public String toString() {
        return "ScriptBean{" +
                "neId='" + neId + '\'' +
                ", script='" + script + '\'' +
                '}';
    }
}
