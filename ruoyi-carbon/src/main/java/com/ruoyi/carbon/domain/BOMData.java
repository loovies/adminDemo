package com.ruoyi.carbon.domain;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

public class BOMData implements Serializable {

    private Long bid;

    private Long mid;

    private String bname;

    private String product;

    private String model;

    private String modelName;

    private String productType;

    private String BOMUnit;

    private String remark;

    private LocalDateTime createTime;

    private LocalDateTime updateTime;

    private int isDeleteId;

    List<BOMDetailData> detailData;

    @Override
    public String toString() {
        return "BOMData{" +
                "bid=" + bid +
                ", mid=" + mid +
                ", bname='" + bname + '\'' +
                ", product='" + product + '\'' +
                ", model='" + model + '\'' +
                ", modelName='" + modelName + '\'' +
                ", productType='" + productType + '\'' +
                ", BOMUnit='" + BOMUnit + '\'' +
                ", remark='" + remark + '\'' +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                ", isDeleteId=" + isDeleteId +
                ", detailData=" + detailData +
                '}';
    }

    public List<BOMDetailData> getDetailData() {
        return detailData;
    }

    public void setDetailData(List<BOMDetailData> detailData) {
        this.detailData = detailData;
    }

    public Long getBid() {
        return bid;
    }

    public void setBid(Long bid) {
        this.bid = bid;
    }

    public Long getMid() {
        return mid;
    }

    public void setMid(Long mid) {
        this.mid = mid;
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

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public String getBOMUnit() {
        return BOMUnit;
    }

    public void setBOMUnit(String BOMUnit) {
        this.BOMUnit = BOMUnit;
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

    public int getIsDeleteId() {
        return isDeleteId;
    }

    public void setIsDeleteId(int isDeleteId) {
        this.isDeleteId = isDeleteId;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }
}
