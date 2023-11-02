package com.ruoyi.carbon.domain.dto;

public class ProductDetailPageDto {
    private Integer pageNum;

    private Integer pageSize;

    private String modelName;

    @Override
    public String toString() {
        return "ProductDetailPageDto{" +
                "pageNum=" + pageNum +
                ", pageSize=" + pageSize +
                ", modelName='" + modelName + '\'' +
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

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }
}
