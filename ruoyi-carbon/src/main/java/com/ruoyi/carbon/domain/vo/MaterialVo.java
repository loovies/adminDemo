package com.ruoyi.carbon.domain.vo;

import java.io.Serializable;

public class MaterialVo implements Serializable {

    private Long mid;

    private String materialNumber;

    private String materialName;

    private String model;

    private String specification;

    private String unit;

    private double unitPrice;

    private String remark;


    private String mcategoryName;

    @Override
    public String toString() {
        return "MaterialVo{" +
                "mid=" + mid +
                ", materialNumber='" + materialNumber + '\'' +
                ", materialName='" + materialName + '\'' +
                ", model='" + model + '\'' +
                ", specification='" + specification + '\'' +
                ", unit='" + unit + '\'' +
                ", unitPrice=" + unitPrice +
                ", remark='" + remark + '\'' +
                ", mcategoryName='" + mcategoryName + '\'' +
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

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getMcategoryName() {
        return mcategoryName;
    }

    public void setMcategoryName(String mcategoryName) {
        this.mcategoryName = mcategoryName;
    }
}
