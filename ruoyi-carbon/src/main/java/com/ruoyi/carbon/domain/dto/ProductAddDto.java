package com.ruoyi.carbon.domain.dto;

import java.io.Serializable;

public class ProductAddDto implements Serializable {

    private String product;

    private String modelName;

    private String remark;

    private Long mid;

    @Override
    public String toString() {
        return "ProductAddDto{" +
                "product='" + product + '\'' +
                ", modelName='" + modelName + '\'' +
                ", remark='" + remark + '\'' +
                ", mid=" + mid +
                '}';
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

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Long getMid() {
        return mid;
    }

    public void setMid(Long mid) {
        this.mid = mid;
    }
}
