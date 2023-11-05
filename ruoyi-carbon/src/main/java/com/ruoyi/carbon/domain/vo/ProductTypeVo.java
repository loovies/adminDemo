package com.ruoyi.carbon.domain.vo;

public class ProductTypeVo {

    private Long pid;

    private String product;

    private String productType;

    @Override
    public String toString() {
        return "ProductTypeVo{" +
                "pid=" + pid +
                ", product='" + product + '\'' +
                ", productType='" + productType + '\'' +
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

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }
}
