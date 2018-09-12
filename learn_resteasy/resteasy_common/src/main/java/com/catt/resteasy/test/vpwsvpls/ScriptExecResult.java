package com.catt.resteasy.test.vpwsvpls;

/**
 * <PRE>
 * 
 * </PRE>
 * <B>项	       目：</B>研发中心公共-综合网管
 * <B>技术支持：</B>凯通科技股份有限公司 (c)
 * @version   <B>V1.0 2018年9月5日</B>
 * @author    <B><a href="mailto:landingdong@gdcattsoft.com"> 蓝鼎栋 </a></B>
 * @since     <B>JDK1.6</B>
 */
public class ScriptExecResult {

	private String status;

	private String neId;

	private String script;

	private String detail;

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

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

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	@Override
	public String toString() {
		return "ScriptExecResult [status=" + status + ", neId=" + neId + ", script=" + script + ", detail=" + detail + "]";
	}

}
