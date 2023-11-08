package com.ruoyi.carbon.domain.dto;

public class BomDataDto {

    private Long pid;

    private String bname;

    private String remark;

    @Override
    public String toString() {
        return "BomDataDto{" +
                "pid=" + pid +
                ", bname='" + bname + '\'' +
                ", remark='" + remark + '\'' +
                '}';
    }

    public Long getPid() {
        return pid;
    }

    public void setPid(Long pid) {
        this.pid = pid;
    }


    public String getBname() {
        return bname;
    }

    public void setBname(String bname) {
        this.bname = bname;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
