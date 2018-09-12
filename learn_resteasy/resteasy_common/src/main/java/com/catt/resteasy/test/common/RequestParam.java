package com.catt.resteasy.test.common;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;
import java.util.UUID;

/**
 * <PRE>
 *
 * </PRE>
 * <B>项	       目：</B>研发中心公共-综合网管
 * <B>技术支持：</B>广东凯通科技股份有限公司 (c)
 *
 * @author <B><a href="mailto:landingdong@gdcattsoft.com"> 蓝鼎栋 </a></B>
 * @version <B>V1.0 2018年8月22日</B>
 * @since <B>JDK1.6</B>
 */
public class RequestParam<T> implements Serializable {

    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = 1L;

    /**
     * id 本次请求的请求ID，一般是UUID，非必填
     */
    protected String id = UUID.randomUUID().toString().replace("-", "");

    /**
     * name 本次请求的名称，非必填
     */
    protected String name;

    /**
     * createTime 对象创建时间点
     */
    protected Date createTime = new Timestamp(System.currentTimeMillis());

    /**
     * description 请求描述，非必填
     */
    protected String describe;

    /**
     * isPreview 是不是预览模式，默认是预览模式
     */
    protected boolean preview = true;

    /**
     * isLoginTest 预览模式下，是否进行登陆设备测试，默认false
     */
    protected boolean loginTest = false;

    /**
     * timeout 执行每个命令的超时时间，默认30秒
     */
    protected long timeout = 30000;

    /**
     * bizId 业务ID
     */
    private String bizId;

    /**
     * neIdOrIp 设备的网元ID或者IP登录信息
     */
    private String neIdOrIp;

    /**
     * jumpNeIdOrIp 中转设备登录信息，设备登录的时，需要先登录到此设备，一般不用
     */
    private String jumpNeIdOrIp;

    /**
     * dataObj 对外扩展数据对象
     */
    protected T dataObj;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public boolean isPreview() {
        return preview;
    }

    public void setPreview(boolean preview) {
        this.preview = preview;
    }

    public boolean isLoginTest() {
        return loginTest;
    }

    public void setLoginTest(boolean loginTest) {
        this.loginTest = loginTest;
    }

    public long getTimeout() {
        return timeout;
    }

    public void setTimeout(long timeout) {
        this.timeout = timeout;
    }

    public String getNeIdOrIp() {
        return neIdOrIp;
    }

    public void setNeIdOrIp(String neIdOrIp) {
        this.neIdOrIp = neIdOrIp;
    }

    public String getJumpNeIdOrIp() {
        return jumpNeIdOrIp;
    }

    public void setJumpNeIdOrIp(String jumpNeIdOrIp) {
        this.jumpNeIdOrIp = jumpNeIdOrIp;
    }

    public T getDataObj() {
        return dataObj;
    }

    public void setDataObj(T dataObj) {
        this.dataObj = dataObj;
    }

    public String getBizId() {
        return bizId;
    }

    public void setBizId(String bizId) {
        this.bizId = bizId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return new StringBuffer().append("\r\n\r\n<<<IPRAN-CONFIG-SERVER请求参数:RequestParam\r\n[id=").append(id).append(", name=").append(name).append(", createTime=").append(createTime)
                .append(", describe=").append(describe).append(", \r\n预览模式preview=").append(preview).append(", loginTest=").append(loginTest)
                .append(", timeout=").append(timeout).append(", bizId=").append(bizId).append(", \r\n操作网元neIdOrIp=").append(neIdOrIp)
                .append(", \r\n中转网元jumpNeIdOrIp=").append(jumpNeIdOrIp).append(", \r\n扩展数据dataObj=").append(dataObj).append("]\r\nIPRAN-CONFIG-SERVER>>>").toString();
    }

    public String toBreif() {
        return new StringBuffer().append("\r\n\r\n<<<IPRAN-CONFIG-SERVER请求参数:RequestParam\r\n[id=").append(id).append(", name=").append(name).append(", createTime=").append(createTime)
                .append(", describe=").append(describe).append(", \r\n预览模式preview=").append(preview).append(", loginTest=").append(loginTest)
                .append(", timeout=").append(timeout).append(", bizId=").append(bizId).append(", \r\n操作网元neIdOrIp=").append(neIdOrIp)
                .append(", \r\n中转网元jumpNeIdOrIp=").append(jumpNeIdOrIp).append("]\r\nIPRAN-CONFIG-SERVER>>>").toString();
    }
}
