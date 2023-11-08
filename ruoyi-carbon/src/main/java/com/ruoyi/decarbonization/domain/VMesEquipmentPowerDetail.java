package com.ruoyi.decarbonization.domain;


import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;
import io.swagger.annotations.ApiModelProperty;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * VIEW对象 v_mes_equipment_power_detail
 *
 * @author neuedu
 * @date 2023-11-08
 */

public class VMesEquipmentPowerDetail extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 设备编号 */
    @Excel(name = "设备编号")
    private Long equipmentId;

    /** 名称 */
    @Excel(name = "名称")
    private String equipmentName;

    /** 计划编号 */

    @Excel(name = "计划编号")
    private Long planId;

    /** BOM单编号 */
    @Excel(name = "BOM单编号")
    private Long bomId;

    /** 订单编号 */

    @Excel(name = "订单编号")
    private Long orderId;

    /** 生产日期 */

    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "生产日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date productDate;

    /** 物料编号 */

    @Excel(name = "物料编号")
    private Long materialId;

    /** 待产数量 */

    @Excel(name = "待产数量")
    private Long requireQuantity;

    /** 已产数量 */

    @Excel(name = "已产数量")
    private Long productQuantity;

    /** 工艺编号 */

    @Excel(name = "工艺编号")
    private Long processId;

    /** 生产线编号 */

    @Excel(name = "生产线编号")
    private Long productLineId;

    /** 单位耗电量 */

    @Excel(name = "单位耗电量")
    private Long powerConsume;

    /** 工艺名称 */

    @Excel(name = "工艺名称")
    private String processName;

    /** $column.columnComment */

    @Excel(name = "总耗电量")
    private Long totalPowerConsume;

    @Excel(name = "单位碳排放量")
    private Double carbonEmission;

    @Excel(name = "总碳排放量")
    private Double totalCarbonEmission;

    /** 生产线名称 */
    @Excel(name = "生产线名称")
    private String productLineName;

    public void setEquipmentId(Long equipmentId)
    {
        this.equipmentId = equipmentId;
    }

    public Long getEquipmentId()
    {
        return equipmentId;
    }
    public void setEquipmentName(String equipmentName)
    {
        this.equipmentName = equipmentName;
    }

    public String getEquipmentName()
    {
        return equipmentName;
    }
    public void setPlanId(Long planId)
    {
        this.planId = planId;
    }

    public Long getPlanId()
    {
        return planId;
    }
    public void setBomId(Long bomId)
    {
        this.bomId = bomId;
    }

    public Long getBomId()
    {
        return bomId;
    }
    public void setOrderId(Long orderId)
    {
        this.orderId = orderId;
    }

    public Long getOrderId()
    {
        return orderId;
    }
    public void setProductDate(Date productDate)
    {
        this.productDate = productDate;
    }

    public Date getProductDate()
    {
        return productDate;
    }
    public void setMaterialId(Long materialId)
    {
        this.materialId = materialId;
    }

    public Long getMaterialId()
    {
        return materialId;
    }
    public void setRequireQuantity(Long requireQuantity)
    {
        this.requireQuantity = requireQuantity;
    }

    public Long getRequireQuantity()
    {
        return requireQuantity;
    }
    public void setProductQuantity(Long productQuantity)
    {
        this.productQuantity = productQuantity;
    }

    public Long getProductQuantity()
    {
        return productQuantity;
    }
    public void setProcessId(Long processId)
    {
        this.processId = processId;
    }

    public Long getProcessId()
    {
        return processId;
    }
    public void setProductLineId(Long productLineId)
    {
        this.productLineId = productLineId;
    }

    public Long getProductLineId()
    {
        return productLineId;
    }
    public void setPowerConsume(Long powerConsume)
    {
        this.powerConsume = powerConsume;
    }

    public Long getPowerConsume()
    {
        return powerConsume;
    }
    public void setProcessName(String processName)
    {
        this.processName = processName;
    }

    public String getProcessName()
    {
        return processName;
    }
    public void setTotalPowerConsume(Long totalPowerConsume)
    {
        this.totalPowerConsume = totalPowerConsume;
    }

    public Long getTotalPowerConsume()
    {
        return totalPowerConsume;
    }
    public void setProductLineName(String productLineName)
    {
        this.productLineName = productLineName;
    }

    public String getProductLineName()
    {
        return productLineName;
    }

    public Double getCarbonEmission() {
        return carbonEmission;
    }

    public void setCarbonEmission(Double carbonEmission) {
        this.carbonEmission = carbonEmission;
    }

    public Double getTotalCarbonEmission() {
        return totalCarbonEmission;
    }

    public void setTotalCarbonEmission(Double totalCarbonEmission) {
        this.totalCarbonEmission = totalCarbonEmission;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
                .append("equipmentId", getEquipmentId())
                .append("equipmentName", getEquipmentName())
                .append("planId", getPlanId())
                .append("bomId", getBomId())
                .append("orderId", getOrderId())
                .append("productDate", getProductDate())
                .append("materialId", getMaterialId())
                .append("requireQuantity", getRequireQuantity())
                .append("productQuantity", getProductQuantity())
                .append("processId", getProcessId())
                .append("productLineId", getProductLineId())
                .append("powerConsume", getPowerConsume())
                .append("processName", getProcessName())
                .append("totalPowerConsume", getTotalPowerConsume())
                .append("productLineName", getProductLineName())
                .append("carbonEmission",getCarbonEmission())
                .append("totalCarbonEmission",getTotalCarbonEmission())
                .toString();
    }
}