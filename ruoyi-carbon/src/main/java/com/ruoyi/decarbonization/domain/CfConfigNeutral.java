package com.ruoyi.decarbonization.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 碳中和计算比例对象 cf_config_neutral
 * 
 * @author ruoyi
 * @date 2023-11-08
 */
public class CfConfigNeutral extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 编号 */
    private Long id;

    /** 1千克标准煤=X(2.5)千克二氧化碳 */
    @Excel(name = "1千克标准煤=X(2.5)千克二氧化碳")
    private Long coalCo2;

    /** 1度电=X(0.96)千克二氧化碳 */
    @Excel(name = "1度电=X(0.96)千克二氧化碳")
    private Long electricCo2;

    /** 1吨水=X(0.19)千克二氧化碳 */
    @Excel(name = "1吨水=X(0.19)千克二氧化碳")
    private Long waterCo2;

    /** 1kg汽油产生的热量=X(1.5kg)标准煤产生的热量 */
    @Excel(name = "1kg汽油产生的热量=X(1.5kg)标准煤产生的热量")
    private Long oilCoal;

    /** 二氧化碳与碳的比值=3.7 */
    @Excel(name = "二氧化碳与碳的比值=3.7")
    private Long co2Ratio;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setCoalCo2(Long coalCo2) 
    {
        this.coalCo2 = coalCo2;
    }

    public Long getCoalCo2() 
    {
        return coalCo2;
    }
    public void setElectricCo2(Long electricCo2) 
    {
        this.electricCo2 = electricCo2;
    }

    public Long getElectricCo2() 
    {
        return electricCo2;
    }
    public void setWaterCo2(Long waterCo2) 
    {
        this.waterCo2 = waterCo2;
    }

    public Long getWaterCo2() 
    {
        return waterCo2;
    }
    public void setOilCoal(Long oilCoal) 
    {
        this.oilCoal = oilCoal;
    }

    public Long getOilCoal() 
    {
        return oilCoal;
    }
    public void setCo2Ratio(Long co2Ratio) 
    {
        this.co2Ratio = co2Ratio;
    }

    public Long getCo2Ratio() 
    {
        return co2Ratio;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("coalCo2", getCoalCo2())
            .append("electricCo2", getElectricCo2())
            .append("waterCo2", getWaterCo2())
            .append("oilCoal", getOilCoal())
            .append("co2Ratio", getCo2Ratio())
            .toString();
    }
}
