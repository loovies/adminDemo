package com.ruoyi.carbon.domain.dto;

import java.io.Serializable;

public class EnergyCollectPageDto implements Serializable {

    /**
     * 当前页码
     */
    private Integer pageNum;

    /**
     * 显示多少数据
     */
    private Integer pageSize;

    /**
     * 设备名称
     */
    private String currentDate;

    /**
     * 日期
     */
    private String devicename;


    public Integer getPageNum() {
        return pageNum;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }

    public String getCurrentDate() {
        return currentDate;
    }

    public void setCurrentDate(String currentDate) {
        this.currentDate = currentDate;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public String getDevicename() {
        return devicename;
    }

    public void setDevicename(String devicename) {
        this.devicename = devicename;
    }


    @Override
    public String toString() {
        return "EnergyCollectPageDto{" +
                "pageNum=" + pageNum +
                ", pageSize=" + pageSize +
                ", currentDate=" + currentDate +
                ", devicename='" + devicename + '\'' +
                '}';
    }
}
