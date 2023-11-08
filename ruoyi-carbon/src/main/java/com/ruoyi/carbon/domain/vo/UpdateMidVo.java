package com.ruoyi.carbon.domain.vo;

public class UpdateMidVo {
    private Long id;

    private Long bid;

    private Long mid;

    @Override
    public String toString() {
        return "UpdateMidVo{" +
                "id=" + id +
                ", bid=" + bid +
                ", mid=" + mid +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
}
