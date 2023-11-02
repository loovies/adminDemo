package com.ruoyi.carbon.domain;

import java.io.Serializable;
import java.time.LocalDateTime;

public class Material implements Serializable {

    private Long mid;

    private String materialNumber;

    private String materialName;

    private String model;

    private String specification;

    private String unit;

    private double unitPrice;

    private String type;

    private Long mcategoryId;

    private String remark;

    private LocalDateTime createTime;

    private LocalDateTime updateTime;

    private Integer isDeleteId;

    @Override
    public String toString() {
        return "Material{" +
                "mid=" + mid +
                ", materialNumber='" + materialNumber + '\'' +
                ", materialName='" + materialName + '\'' +
                ", model='" + model + '\'' +
                ", specification='" + specification + '\'' +
                ", unit='" + unit + '\'' +
                ", unitPrice=" + unitPrice +
                ", type='" + type + '\'' +
                ", mcategoryId=" + mcategoryId +
                ", remark='" + remark + '\'' +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                ", isDeleteId=" + isDeleteId +
                '}';
    }

    public Long getMid() {
        return mid;
    }

    public void setMid(Long mid) {
        this.mid = mid;
    }

    public String getMaterialNumber() {
        return materialNumber;
    }

    public void setMaterialNumber(String materialNumber) {
        this.materialNumber = materialNumber;
    }

    public String getMaterialName() {
        return materialName;
    }

    public void setMaterialName(String materialName) {
        this.materialName = materialName;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSpecification() {
        return specification;
    }

    public void setSpecification(String specification) {
        this.specification = specification;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Long getMcategoryId() {
        return mcategoryId;
    }

    public void setMcategoryId(Long mcategoryId) {
        this.mcategoryId = mcategoryId;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
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

    public Integer getIsDeleteId() {
        return isDeleteId;
    }

    public void setIsDeleteId(Integer isDeleteId) {
        this.isDeleteId = isDeleteId;
    }
}
