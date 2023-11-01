package com.ruoyi.carbon.domain;

import java.io.Serializable;
import java.time.LocalDateTime;

public class EnergyCollect implements Serializable {

    private Long id;

    private String devicename;

    private Integer output;

    private Float power;

    private Float totalPower;

    private Float emission;

    private Float totalEmission;

    private LocalDateTime currentDate;

    @Override
    public String toString() {
        return "EnergyCollect{" +
                "id=" + id +
                ", devicename='" + devicename + '\'' +
                ", output=" + output +
                ", power=" + power +
                ", totalPower=" + totalPower +
                ", emission=" + emission +
                ", totalEmission=" + totalEmission +
                ", currentDate=" + currentDate +
                '}';
    }

    public Float getTotalEmission() {
        return totalEmission;
    }

    public void setTotalEmission(Float totalEmission) {
        this.totalEmission = totalEmission;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDevicename() {
        return devicename;
    }

    public void setDevicename(String devicename) {
        this.devicename = devicename;
    }

    public Integer getOutput() {
        return output;
    }

    public void setOutput(Integer output) {
        this.output = output;
    }

    public Float getPower() {
        return power;
    }

    public void setPower(Float power) {
        this.power = power;
    }

    public Float getTotalPower() {
        return totalPower;
    }

    public void setTotalPower(Float totalPower) {
        this.totalPower = totalPower;
    }

    public Float getEmission() {
        return emission;
    }

    public void setEmission(Float emission) {
        this.emission = emission;
    }

    public LocalDateTime getCurrentDate() {
        return currentDate;
    }

    public void setCurrentDate(LocalDateTime currentDate) {
        this.currentDate = currentDate;
    }
}
