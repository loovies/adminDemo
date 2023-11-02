package com.ruoyi.carbon.domain;

import java.io.Serializable;
import java.time.LocalDateTime;

public class ProductModelingDetail implements Serializable {

    private Long id;

    private Material material;

    private ProductModeling productModeling;

    private String remark;

    private LocalDateTime createTime;

    private LocalDateTime updateTime;

    private Integer isDeleteId;

    @Override
    public String toString() {
        return "ProductModelingDetail{" +
                "id=" + id +
                ", material=" + material +
                ", productModeling=" + productModeling +
                ", remark='" + remark + '\'' +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                ", isDeleteId=" + isDeleteId +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    public ProductModeling getProductModeling() {
        return productModeling;
    }

    public void setProductModeling(ProductModeling productModeling) {
        this.productModeling = productModeling;
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
