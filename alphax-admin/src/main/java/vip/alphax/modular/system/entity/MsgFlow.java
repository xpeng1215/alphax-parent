package vip.alphax.modular.system.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * @auther Alpha丶X
 * @create 2019-01-01 23:15:04
 * @describe 推送记录实体类
 */
@TableName("msg_flow")
public class MsgFlow implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 用户id
     */
    private String userId;

    /**
     * 项目编号
     */
    private String projectId;

    /**
     * 医院院区id
     */
    private String hospitalId;

    /**
     * 发送者
     */
    private String sender;

    /**
     * 接受者
     */
    private String recipient;

    /**
     * 推送方式 0 短信，1 公众号推送， 2 支付宝服务窗
     */
    private String msgType;

    /**
     * 发送内容
     */
    private String content;

    /**
     * 发送结果
     */
    private String resultDesc;

    /**
     * 发送状态 0成功 1失败
     */
    private String msgStatus;

    private LocalDateTime createTime;

    private LocalDateTime updateTime;

    /**
     * 1医生，2患者
     */
    private String type;

    /**
     * 删除状态,0未删除，1已删除
     */
    private String deletionState;

    /**
     * 预留字段1
     */
    private String temp1;

    /**
     * 预留字段2
     */
    private String temp2;

    /**
     * 预留字段3
     */
    private String temp3;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public String getHospitalId() {
        return hospitalId;
    }

    public void setHospitalId(String hospitalId) {
        this.hospitalId = hospitalId;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getRecipient() {
        return recipient;
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }

    public String getMsgType() {
        return msgType;
    }

    public void setMsgType(String msgType) {
        this.msgType = msgType;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getResultDesc() {
        return resultDesc;
    }

    public void setResultDesc(String resultDesc) {
        this.resultDesc = resultDesc;
    }

    public String getMsgStatus() {
        return msgStatus;
    }

    public void setMsgStatus(String msgStatus) {
        this.msgStatus = msgStatus;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public LocalDateTime getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(LocalDateTime updateTime) {
        this.updateTime = updateTime;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDeletionState() {
        return deletionState;
    }

    public void setDeletionState(String deletionState) {
        this.deletionState = deletionState;
    }

    public String getTemp1() {
        return temp1;
    }

    public void setTemp1(String temp1) {
        this.temp1 = temp1;
    }

    public String getTemp2() {
        return temp2;
    }

    public void setTemp2(String temp2) {
        this.temp2 = temp2;
    }

    public String getTemp3() {
        return temp3;
    }

    public void setTemp3(String temp3) {
        this.temp3 = temp3;
    }

    @Override
    public String toString() {
        return "MsgFlow{" +
        "id=" + id +
        ", userId=" + userId +
        ", projectId=" + projectId +
        ", hospitalId=" + hospitalId +
        ", sender=" + sender +
        ", recipient=" + recipient +
        ", msgType=" + msgType +
        ", content=" + content +
        ", resultDesc=" + resultDesc +
        ", msgStatus=" + msgStatus +
        ", createTime=" + createTime +
        ", updateTime=" + updateTime +
        ", type=" + type +
        ", deletionState=" + deletionState +
        ", temp1=" + temp1 +
        ", temp2=" + temp2 +
        ", temp3=" + temp3 +
        "}";
    }
}
