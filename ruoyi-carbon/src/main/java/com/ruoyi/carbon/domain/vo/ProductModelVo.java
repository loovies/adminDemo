package com.ruoyi.carbon.domain.vo;

public class ProductModelVo {
    private Long pid;

    private String ModelName;

    private String product;

    @Override
    public String toString() {
        return "ProductModelVo{" +
                "pid=" + pid +
                ", ModelName='" + ModelName + '\'' +
                ", product='" + product + '\'' +
                '}';
    }

    public Long getPid() {
        return pid;
    }

    public void setPid(Long pid) {
        this.pid = pid;
    }

    public String getModelName() {
        return ModelName;
    }

    public void setModelName(String modelName) {
        ModelName = modelName;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }
}
