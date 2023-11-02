package com.ruoyi.carbon.domain.vo;

import java.io.Serializable;


public class ProductDetailVo implements Serializable {

    private Integer pid;

    private String modelName;

    private String product;

    private String model;

    private String specification;

    private String productUnit;

    @Override
    public String toString() {
        return "ProductDetailVo{" +
                "pid=" + pid +
                ", modelName='" + modelName + '\'' +
                ", product='" + product + '\'' +
                ", model='" + model + '\'' +
                ", specification='" + specification + '\'' +
                ", productUnit='" + productUnit + '\'' +
                '}';
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
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

    public String getProductUnit() {
        return productUnit;
    }

    public void setProductUnit(String productUnit) {
        this.productUnit = productUnit;
    }
}
