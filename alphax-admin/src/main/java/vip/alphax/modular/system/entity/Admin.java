package vip.alphax.modular.system.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import com.baomidou.mybatisplus.annotation.*;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @auther Alpha丶X
 * @create 2019-03-08 16:13:47
 * @describe 实体类
 */
@TableName("sys_admin")
@ApiModel(value="Admin对象", description="")
public class Admin implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "admin_id", type = IdType.UUID)
    private String adminId;

    @ApiModelProperty(value = "登录名")
    @TableField("login_name")
    private String loginName;

    @ApiModelProperty(value = "登陆密码")
    @TableField("login_password")
    private String loginPassword;

    @ApiModelProperty(value = "真实姓名")
    @TableField("real_name")
    private String realName;

    @TableField("organization_id")
    private String organizationId;

    @ApiModelProperty(value = "密钥")
    @TableField("security_key")
    private String securityKey;

    @ApiModelProperty(value = "登陆次数")
    @TableField("login_times")
    private Integer loginTimes;

    @ApiModelProperty(value = "失败登陆次数")
    @TableField("login_error_times")
    private Integer loginErrorTimes;

    @ApiModelProperty(value = "最后登陆时间")
    @TableField("last_login_time")
    private Date lastLoginTime;

    @ApiModelProperty(value = "最后登陆ip")
    @TableField("last_login_ip")
    private String lastLoginIp;

    @ApiModelProperty(value = "创建时间")
    @TableField("create_time")
    private Date createTime;

    @ApiModelProperty(value = "1为超级管理员0为非超级管理员")
    @TableField("is_super")
    private String isSuper;

    @ApiModelProperty(value = "0未删除，1已删除，默认0")
    @TableField("delete_state")
    @TableLogic
    private String deleteState;


    public String getAdminId() {
        return adminId;
    }

    public void setAdminId(String adminId) {
        this.adminId = adminId;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getLoginPassword() {
        return loginPassword;
    }

    public void setLoginPassword(String loginPassword) {
        this.loginPassword = loginPassword;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
    }

    public String getSecurityKey() {
        return securityKey;
    }

    public void setSecurityKey(String securityKey) {
        this.securityKey = securityKey;
    }

    public Integer getLoginTimes() {
        return loginTimes;
    }

    public void setLoginTimes(Integer loginTimes) {
        this.loginTimes = loginTimes;
    }

    public Integer getLoginErrorTimes() {
        return loginErrorTimes;
    }

    public void setLoginErrorTimes(Integer loginErrorTimes) {
        this.loginErrorTimes = loginErrorTimes;
    }

    public Date getLastLoginTime() {
        return lastLoginTime;
    }

    public void setLastLoginTime(Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    public String getLastLoginIp() {
        return lastLoginIp;
    }

    public void setLastLoginIp(String lastLoginIp) {
        this.lastLoginIp = lastLoginIp;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getIsSuper() {
        return isSuper;
    }

    public void setIsSuper(String isSuper) {
        this.isSuper = isSuper;
    }

    public String getDeleteState() {
        return deleteState;
    }

    public void setDeleteState(String deleteState) {
        this.deleteState = deleteState;
    }

    @Override
    public String toString() {
        return "Admin{" +
        "adminId=" + adminId +
        ", loginName=" + loginName +
        ", loginPassword=" + loginPassword +
        ", realName=" + realName +
        ", organizationId=" + organizationId +
        ", securityKey=" + securityKey +
        ", loginTimes=" + loginTimes +
        ", loginErrorTimes=" + loginErrorTimes +
        ", lastLoginTime=" + lastLoginTime +
        ", lastLoginIp=" + lastLoginIp +
        ", createTime=" + createTime +
        ", isSuper=" + isSuper +
        ", deleteState=" + deleteState +
        "}";
    }
}
