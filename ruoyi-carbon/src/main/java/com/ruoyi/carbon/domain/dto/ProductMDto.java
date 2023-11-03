package com.ruoyi.carbon.domain.dto;

public class ProductMDto {

    private String product;

    private String modelName;

    private String remark;

    private Long mid;

    private Long pid;

    @Override
    public String toString() {
        return "ProductMDto{" +
                "product='" + product + '\'' +
                ", modelName='" + modelName + '\'' +
                ", remark='" + remark + '\'' +
                ", mid=" + mid +
                ", pid=" + pid +
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
