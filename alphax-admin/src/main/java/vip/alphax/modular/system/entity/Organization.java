package vip.alphax.modular.system.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import com.baomidou.mybatisplus.annotation.*;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @auther Alpha丶X
 * @create 2019-03-08 16:19:26
 * @describe 部门管理实体类
 */
@TableName("sys_organization")
@ApiModel(value="Organization对象", description="部门管理")
public class Organization implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "organization_id", type = IdType.UUID)
    private String organizationId;

    @ApiModelProperty(value = "上级部门ID，一级部门为0")
    @TableField("pid")
    private String pid;

    @ApiModelProperty(value = "部门名称")
    @TableField("name")
    private String name;

    @ApiModelProperty(value = "排序")
    @TableField("seq")
    private Integer seq;

    @ApiModelProperty(value = "已删除  0：禁用  1: 正常")
    @TableField("flag")
    private Integer flag;


    public String getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSeq() {
        return seq;
    }

    public void setSeq(Integer seq) {
        this.seq = seq;
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    @Override
    public String toString() {
        return "Organization{" +
        "organizationId=" + organizationId +
        ", pid=" + pid +
        ", name=" + name +
        ", seq=" + seq +
        ", flag=" + flag +
        "}";
    }
}
