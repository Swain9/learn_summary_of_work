package com.catt.resteasy.test.common;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;
import java.util.Map;

/**
 * <PRE>
 * 
 * </PRE>
 * <B>项	       目：</B>研发中心公共-综合网管
 * <B>技术支持：</B>广东凯通科技股份有限公司 (c)
 * @version   <B>V1.0 2018年8月23日</B>
 * @author    <B><a href="mailto:landingdong@gdcattsoft.com"> 蓝鼎栋 </a></B>
 * @since     <B>JDK1.6</B>
 */
public class ResponseResult <T> implements Serializable {

	/** serialVersionUID  */
	private static final long serialVersionUID = 1L;
	
	/** id 跟request的id一样 */
	protected String id;
	
	/** name 响应名称 */
	protected String name;
	
	/** status 总状态boolean字段,true:成功，false:失败 */
	protected boolean status;

	/** code 状态码 */
	protected int code;
	
	/** useTime 消耗的的时间，单位毫秒 */
	protected long useTime;
	
	/** createTime 对象创建时间点 */
	protected Date createTime = new Timestamp(System.currentTimeMillis());

	/** bizId 业务Id */
	protected String bizId;
	
	/** neIdOrIp 设备ID或者IP */
	protected String neIdOrIp;
	
	/** describe 描述 */
	protected String describe;
	
	/** script 脚本 */
	protected String script;
	
	/** scriptParamMap 替换脚本用的kv */
	private Map<String, Object> scriptParamMap;
	
	/** detail 细节描述 */
	protected String detail;
	
	/** dataObj 对外扩展数据对象 */
	protected T dataObj;

	/** log 日志信息 */
	private String log;
	
	/**
	 * 是否所有成功
	 * @author <B><a href="mailto:landingdong@gdcattsoft.com"> 蓝鼎栋 </a></B>
	 * @return true成功、false失败
	 */
	public boolean succeed() {
		return status;
	}
	
	/**
	 * 获取总状态
	 * @author <B><a href="mailto:landingdong@gdcattsoft.com"> 蓝鼎栋 </a></B>
	 * @return true成功、false失败
	 */
	public boolean getStatus() {
		return status;
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public String getDescribe() {
		return describe;
	}

	public void setDescribe(String describe) {
		this.describe = describe;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public long getUseTime() {
		return useTime;
	}

	public void setUseTime(long useTime) {
		this.useTime = useTime;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public String getScript() {
		return script;
	}

	public void setScript(String script) {
		this.script = script;
	}

	public T getDataObj() {
		return dataObj;
	}

	public void setDataObj(T dataObj) {
		this.dataObj = dataObj;
	}

	public Map<String, Object> getScriptParamMap() {
		return scriptParamMap;
	}

	public void setScriptParamMap(Map<String, Object> scriptParamMap) {
		this.scriptParamMap = scriptParamMap;
	}

	public String getBizId() {
		return bizId;
	}

	public void setBizId(String bizId) {
		this.bizId = bizId;
	}

	public String getNeIdOrIp() {
		return neIdOrIp;
	}

	public void setNeIdOrIp(String neIdOrIp) {
		this.neIdOrIp = neIdOrIp;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getLog() {
		return log;
	}

	public void setLog(String log) {
		this.log = log;
	}

	@Override
	public String toString() {
		return new StringBuffer().append("\r\n\r\n<<<IPRAN-CONFIG-SERVER响应参数:ResponseResult\r\n[id=").append(id).append(", name=").append(name).append(", status=").append(status).append(", code=").append(code).append(", useTime=").append(useTime).append(", createTime=").append(createTime
		       ).append(", bizId=").append(bizId).append(", neIdOrIp=").append(neIdOrIp).append(", describe=").append(describe).append(", \r\n脚本script=").append(script).append(", \r\n脚本参数scriptParamMap="
		       ).append(scriptParamMap).append(", \r\n详情detail=").append(detail).append(", \r\n扩展数据dataObj=").append(dataObj).append("]\r\nIPRAN-CONFIG-SERVER>>>").toString();
	}
	
	public String toBreif() {
		return new StringBuffer().append("\r\n\r\n<<<IPRAN-CONFIG-SERVER响应参数:ResponseResult\r\n[id=").append(id).append(", name=").append(name).append(", status=").append(status).append(", code=").append(code).append(", useTime=").append(useTime).append(", createTime=").append(createTime
			       ).append(", bizId=").append(bizId).append(", neIdOrIp=").append(neIdOrIp).append(", describe=").append(describe).append(", \r\n脚本script=").append(script).append("]\r\nIPRAN-CONFIG-SERVER>>>").toString();
	}

}
