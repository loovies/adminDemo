package com.ruoyi.carbon.domain.dto;

public class BOMupdateDataDto {

    private Long bid;

    private String bname;

    private Long model;

    private String remark;

    @Override
    public String toString() {
        return "BOMupdateDataDto{" +
                "bid=" + bid +
                ", bname='" + bname + '\'' +
                ", model=" + model +
                ", remark='" + remark + '\'' +
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

    public Long getModel() {
        return model;
    }

    public void setModel(Long model) {
        this.model = model;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
