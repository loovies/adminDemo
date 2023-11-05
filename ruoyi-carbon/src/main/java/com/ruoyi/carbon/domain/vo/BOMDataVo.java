package com.ruoyi.carbon.domain.vo;

public class BOMDataVo {
    private Long bid;

    private String bname;

    private  String product;

    private String model;

    private String specification;

    private String unit;

    @Override
    public String toString() {
        return "BOMDataVo{" +
                "bid=" + bid +
                ", bname='" + bname + '\'' +
                ", product='" + product + '\'' +
                ", model='" + model + '\'' +
                ", specification='" + specification + '\'' +
                ", unit='" + unit + '\'' +
                '}';
    }

    public Long getBid() {
        return bid;
    }

    public void setBid(Long bid) {
        this.bid = bid;
    }

    public String getBname() {
        return bname;
    }

    public void setBname(String bname) {
        this.bname = bname;
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

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }
}
