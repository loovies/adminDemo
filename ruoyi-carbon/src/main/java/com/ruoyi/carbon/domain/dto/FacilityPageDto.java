package com.ruoyi.carbon.domain.dto;

import java.io.Serializable;

public class FacilityPageDto implements Serializable {

    private Integer pageNum;

    private Integer pageSize;

    private String facilityName;

    private String encoding;

    private String model;

    private String batchDate;

    private String batchNumber;

    private String manufacturer;

    private String state;

    @Override
    public String toString() {
        return "FacilityPageDto{" +
                "pageNum=" + pageNum +
                ", pageSize=" + pageSize +
                ", facilityName='" + facilityName + '\'' +
                ", encoding='" + encoding + '\'' +
                ", model='" + model + '\'' +
                ", batchDate='" + batchDate + '\'' +
                ", batchNumber='" + batchNumber + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", state='" + state + '\'' +
                '}';
    }

    public Integer getPageNum() {
        return pageNum;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public String getFacilityName() {
        return facilityName;
    }

    public void setFacilityName(String facilityName) {
        this.facilityName = facilityName;
    }

    public String getEncoding() {
        return encoding;
    }

    public void setEncoding(String encoding) {
        this.encoding = encoding;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBatchDate() {
        return batchDate;
    }

    public void setBatchDate(String batchDate) {
        this.batchDate = batchDate;
    }

    public String getBatchNumber() {
        return batchNumber;
    }

    public void setBatchNumber(String batchNumber) {
        this.batchNumber = batchNumber;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
