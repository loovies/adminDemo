package com.ruoyi.decarbonization.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 产品模型明细对象 mes_product_model_detail
 * 
 * @author ruoyi
 * @date 2023-11-08
 */
public class MesProductModelDetail extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 编号 */
    private Long id;

    /** 产品模型编号 */
    @Excel(name = "产品模型编号")
    private Long productModelId;

    /** 物料档案编号 */
    @Excel(name = "物料档案编号")
    private Long materialId;

    /** 备注 */
    @Excel(name = "备注")
    private String detailRemark;

    @Excel(name = "物料编码")
    private String materialCode;

    /** 物料名称 */
    @Excel(name = "物料名称")
    private String materialName;

    /** 型号 */
    @Excel(name = "型号")
    private String materialModel;

    /** 规格 */
    @Excel(name = "规格")
    private String materialSpecification;

    @Excel(name = "单位")
    private String materialUnit;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setProductModelId(Long productModelId) 
    {
        this.productModelId = productModelId;
    }

    public Long getProductModelId() 
    {
        return productModelId;
    }
    public void setMaterialId(Long materialId) 
    {
        this.materialId = materialId;
    }

    public Long getMaterialId() 
    {
        return materialId;
    }
    public void setDetailRemark(String detailRemark) 
    {
        this.detailRemark = detailRemark;
    }

    public String getDetailRemark() 
    {
        return detailRemark;
    }

    public String getMaterialCode() {
        return materialCode;
    }

    public void setMaterialCode(String materialCode) {
        this.materialCode = materialCode;
    }

    public String getMaterialName() {
        return materialName;
    }

    public void setMaterialName(String materialName) {
        this.materialName = materialName;
    }

    public String getMaterialModel() {
        return materialModel;
    }

    public void setMaterialModel(String materialModel) {
        this.materialModel = materialModel;
    }

    public String getMaterialSpecification() {
        return materialSpecification;
    }

    public void setMaterialSpecification(String materialSpecification) {
        this.materialSpecification = materialSpecification;
    }

    public String getMaterialUnit() {
        return materialUnit;
    }

    public void setMaterialUnit(String materialUnit) {
        this.materialUnit = materialUnit;
    }

    @Override
    public String toString() {
        return "MesProductModelDetail{" +
                "id=" + id +
                ", productModelId=" + productModelId +
                ", materialId=" + materialId +
                ", detailRemark='" + detailRemark + '\'' +
                ", materialCode='" + materialCode + '\'' +
                ", materialName='" + materialName + '\'' +
                ", materialModel='" + materialModel + '\'' +
                ", materialSpecification='" + materialSpecification + '\'' +
                ", materialUnit='" + materialUnit + '\'' +
                '}';
    }
}
