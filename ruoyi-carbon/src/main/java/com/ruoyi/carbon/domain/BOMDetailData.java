package com.ruoyi.carbon.domain;

import java.io.Serializable;
import java.time.LocalDateTime;

public class BOMDetailData implements Serializable {

    private Long id;

    private Long mid;

    private Long bid;

    private int dosage;

    private String remark;

    private LocalDateTime createTime;

    private LocalDateTime updateTime;

    private int isDeleteId;

    @Override
    public String  toString() {
        return "BOMDetailData{" +
                "id=" + id +
                ", mid=" + mid +
                ", bid=" + bid +
                ", dosage=" + dosage +
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

    public Long getMid() {
        return mid;
    }

    public void setMid(Long mid) {
        this.mid = mid;
    }

    public Long getBid() {
        return bid;
    }

    public void setBid(Long bid) {
        this.bid = bid;
    }

    public int getDosage() {
        return dosage;
    }

    public void setDosage(int dosage) {
        this.dosage = dosage;
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
}
