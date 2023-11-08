package com.ruoyi.decarbonization.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * BOM单明细对象 mes_product_bom_detail
 * 
 * @author ruoyi
 * @date 2023-11-08
 */
public class MesProductBomDetail extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 编号 */
    private Long id;

    /** bom单id */
    @Excel(name = "bom单id")
    private Long bomId;

    /** 物料id */
    @Excel(name = "物料id")
    private Long materialId;

    /** 用量 */
    @Excel(name = "用量")
    private Long usage;


    private String productCode;

    private String productName;

    private String productModel;

    private String productSpecification;

    private String productUnit;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setBomId(Long bomId) 
    {
        this.bomId = bomId;
    }

    public Long getBomId() 
    {
        return bomId;
    }
    public void setMaterialId(Long materialId) 
    {
        this.materialId = materialId;
    }

    public Long getMaterialId() 
    {
        return materialId;
    }
    public void setUsage(Long usage) 
    {
        this.usage = usage;
    }

    public Long getUsage() 
    {
        return usage;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductModel() {
        return productModel;
    }

    public void setProductModel(String productModel) {
        this.productModel = productModel;
    }

    public String getProductSpecification() {
        return productSpecification;
    }

    public void setProductSpecification(String productSpecification) {
        this.productSpecification = productSpecification;
    }

    public String getProductUnit() {
        return productUnit;
    }

    public void setProductUnit(String productUnit) {
        this.productUnit = productUnit;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("bomId", getBomId())
            .append("materialId", getMaterialId())
            .append("usage", getUsage())
            .append("remark", getRemark())
            .toString();
    }
}
