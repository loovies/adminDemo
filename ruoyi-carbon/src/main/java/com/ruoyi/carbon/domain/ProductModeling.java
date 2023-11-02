package com.ruoyi.carbon.domain;

import java.io.Serializable;
import java.time.LocalDateTime;

public class ProductModeling implements Serializable {

    private Long pid;

    private String product;

    private String modelName;

    private String productUnit;

    private String remark;

    private LocalDateTime createTime;

    private LocalDateTime updateTime;

    private Integer isDeleteId;

    @Override
    public String toString() {
        return "ProductModeling{" +
                "pid=" + pid +
                ", product='" + product + '\'' +
                ", modelName='" + modelName + '\'' +
                ", productUnit='" + productUnit + '\'' +
                ", remark='" + remark + '\'' +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                ", isDeleteId=" + isDeleteId +
                '}';
    }

    public Long getPid() {
        return pid;
    }

    public void setPid(Long pid) {
        this.pid = pid;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getProductUnit() {
        return productUnit;
    }

    public void setProductUnit(String productUnit) {
        this.productUnit = productUnit;
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
