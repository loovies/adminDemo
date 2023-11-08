package com.ruoyi.decarbonization.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 产品建模对象 mes_product_model
 * 
 * @author ruoyi
 * @date 2023-11-08
 */
public class MesProductModel extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 编号 */
    private Long id;

    /** 物料档案编号 */
    @Excel(name = "物料档案编号")
    private Long materialId;

    /** 模型名称 */
    @Excel(name = "模型名称")
    private String modelName;

    @Excel(name = "物料名称")
    private String productName;

    /** 型号 */
    @Excel(name = "型号")
    private String productModel;

    /** 规格 */
    @Excel(name = "规格")
    private String productSpecification;

    /** 单位 */
    @Excel(name = "单位")
    private String productUnit;


    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setMaterialId(Long materialId) 
    {
        this.materialId = materialId;
    }

    public Long getMaterialId() 
    {
        return materialId;
    }
    public void setModelName(String modelName) 
    {
        this.modelName = modelName;
    }

    public String getModelName() 
    {
        return modelName;
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
        return "MesProductModel{" +
                "id=" + id +
                ", materialId=" + materialId +
                ", modelName='" + modelName + '\'' +
                ", productName='" + productName + '\'' +
                ", productModel='" + productModel + '\'' +
                ", productSpecification='" + productSpecification + '\'' +
                ", productUnit='" + productUnit + '\'' +
                '}';
    }
}
