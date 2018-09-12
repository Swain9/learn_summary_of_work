package com.catt.resteasy.test.vpwsvpls;

import java.io.Serializable;
import java.util.List;

/**
 * @author zhangmaolin
 * @date 2018-09-07 17:38
 * @since 0.0.1
 */
public class VpwsVplsResult implements Serializable {

    private List<ScriptExecResult> scriptExecResults;

    public List<ScriptExecResult> getScriptExecResults() {
        return scriptExecResults;
    }

    public void setScriptExecResults(List<ScriptExecResult> scriptExecResults) {
        this.scriptExecResults = scriptExecResults;
    }

    @Override
    public String toString() {
        return "VpwsVplsResult{" +
                "scriptExecResults=" + scriptExecResults +
                '}';
    }
}
