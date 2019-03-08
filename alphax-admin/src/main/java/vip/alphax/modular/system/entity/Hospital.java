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
 * @create 2019-03-08 16:18:50
 * @describe 实体类
 */
@TableName("sys_hospital")
@ApiModel(value="Hospital对象", description="")
public class Hospital implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "主键")
    @TableId(value = "hospital_id", type = IdType.UUID)
    private String hospitalId;

    @TableField("project_id")
    private String projectId;

    @ApiModelProperty(value = "院区id")
    @TableField("branch_id")
    private String branchId;

    @ApiModelProperty(value = "医院ID")
    @TableField("huatuo_hospital_id")
    private Integer huatuoHospitalId;

    @ApiModelProperty(value = "医院名称")
    @TableField("name")
    private String name;

    @ApiModelProperty(value = "医院名称缩写")
    @TableField("abbr_name")
    private String abbrName;

    @ApiModelProperty(value = "医院图标")
    @TableField("icon")
    private String icon;

    @ApiModelProperty(value = "省份")
    @TableField("province")
    private String province;

    @ApiModelProperty(value = "城市")
    @TableField("city")
    private String city;

    @ApiModelProperty(value = "经度")
    @TableField("longitude")
    private String longitude;

    @ApiModelProperty(value = "纬度")
    @TableField("latitude")
    private String latitude;

    @ApiModelProperty(value = "医院详情URL")
    @TableField("detail_url")
    private String detailUrl;

    @ApiModelProperty(value = "医院详情轮播图")
    @TableField("detail_icon")
    private String detailIcon;

    @ApiModelProperty(value = "医院等级")
    @TableField("hospital_level")
    private String hospitalLevel;

    @ApiModelProperty(value = "性质")
    @TableField("property")
    private String property;

    @ApiModelProperty(value = "0 不是，1 是")
    @TableField("is_pt")
    private String isPt;

    @ApiModelProperty(value = "创建者")
    @TableField("createdby")
    private String createdby;

    @ApiModelProperty(value = "创建时间")
    @TableField("createdon")
    private Date createdon;

    @ApiModelProperty(value = "修改者")
    @TableField("modifiedby")
    private String modifiedby;

    @ApiModelProperty(value = "最后修改时间")
    @TableField("modifiedon")
    private Date modifiedon;

    @ApiModelProperty(value = "删除状态,0未删除，1已删除")
    @TableField("deletion_state")
    private String deletionState;

    @ApiModelProperty(value = "排序，越大越排前")
    @TableField("seq")
    private Integer seq;

    @ApiModelProperty(value = "备注")
    @TableField("description")
    private String description;


    public String getHospitalId() {
        return hospitalId;
    }

    public void setHospitalId(String hospitalId) {
        this.hospitalId = hospitalId;
    }

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public String getBranchId() {
        return branchId;
    }

    public void setBranchId(String branchId) {
        this.branchId = branchId;
    }

    public Integer getHuatuoHospitalId() {
        return huatuoHospitalId;
    }

    public void setHuatuoHospitalId(Integer huatuoHospitalId) {
        this.huatuoHospitalId = huatuoHospitalId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAbbrName() {
        return abbrName;
    }

    public void setAbbrName(String abbrName) {
        this.abbrName = abbrName;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getDetailUrl() {
        return detailUrl;
    }

    public void setDetailUrl(String detailUrl) {
        this.detailUrl = detailUrl;
    }

    public String getDetailIcon() {
        return detailIcon;
    }

    public void setDetailIcon(String detailIcon) {
        this.detailIcon = detailIcon;
    }

    public String getHospitalLevel() {
        return hospitalLevel;
    }

    public void setHospitalLevel(String hospitalLevel) {
        this.hospitalLevel = hospitalLevel;
    }

    public String getProperty() {
        return property;
    }

    public void setProperty(String property) {
        this.property = property;
    }

    public String getIsPt() {
        return isPt;
    }

    public void setIsPt(String isPt) {
        this.isPt = isPt;
    }

    public String getCreatedby() {
        return createdby;
    }

    public void setCreatedby(String createdby) {
        this.createdby = createdby;
    }

    public Date getCreatedon() {
        return createdon;
    }

    public void setCreatedon(Date createdon) {
        this.createdon = createdon;
    }

    public String getModifiedby() {
        return modifiedby;
    }

    public void setModifiedby(String modifiedby) {
        this.modifiedby = modifiedby;
    }

    public Date getModifiedon() {
        return modifiedon;
    }

    public void setModifiedon(Date modifiedon) {
        this.modifiedon = modifiedon;
    }

    public String getDeletionState() {
        return deletionState;
    }

    public void setDeletionState(String deletionState) {
        this.deletionState = deletionState;
    }

    public Integer getSeq() {
        return seq;
    }

    public void setSeq(Integer seq) {
        this.seq = seq;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Hospital{" +
        "hospitalId=" + hospitalId +
        ", projectId=" + projectId +
        ", branchId=" + branchId +
        ", huatuoHospitalId=" + huatuoHospitalId +
        ", name=" + name +
        ", abbrName=" + abbrName +
        ", icon=" + icon +
        ", province=" + province +
        ", city=" + city +
        ", longitude=" + longitude +
        ", latitude=" + latitude +
        ", detailUrl=" + detailUrl +
        ", detailIcon=" + detailIcon +
        ", hospitalLevel=" + hospitalLevel +
        ", property=" + property +
        ", isPt=" + isPt +
        ", createdby=" + createdby +
        ", createdon=" + createdon +
        ", modifiedby=" + modifiedby +
        ", modifiedon=" + modifiedon +
        ", deletionState=" + deletionState +
        ", seq=" + seq +
        ", description=" + description +
        "}";
    }
}
