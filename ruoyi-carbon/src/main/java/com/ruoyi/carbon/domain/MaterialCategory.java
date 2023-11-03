package com.ruoyi.carbon.domain;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

public class MaterialCategory implements Serializable {
    private Long mcategoryId;

    private String mcategoryName;

    private String description;

    private Long parentCreateId;

    private List<MaterialCategory> children;
    private LocalDateTime createTime;

    private LocalDateTime updateTime;

    private Integer isDeleteId;

    @Override
    public String toString() {
        return "MaterialCategory{" +
                "mcategoryId=" + mcategoryId +
                ", mcategoryName='" + mcategoryName + '\'' +
                ", description='" + description + '\'' +
                ", parentCreateId=" + parentCreateId +
                ", children=" + children +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                ", isDeleteId=" + isDeleteId +
                '}';
    }

    public List<MaterialCategory> getChildren() {
        return children;
    }

    public void setChildren(List<MaterialCategory> children) {
        this.children = children;
    }

    public Long getMcategoryId() {
        return mcategoryId;
    }

    public void setMcategoryId(Long mcategoryId) {
        this.mcategoryId = mcategoryId;
    }

    public String getMcategoryName() {
        return mcategoryName;
    }

    public void setMcategoryName(String mcategoryName) {
        this.mcategoryName = mcategoryName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getParentCreateId() {
        return parentCreateId;
    }

    public void setParentCreateId(Long parentCreateId) {
        this.parentCreateId = parentCreateId;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public LocalDateTime getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(LocalDateTime updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getIsDeleteId() {
        return isDeleteId;
    }

    public void setIsDeleteId(Integer isDeleteId) {
        this.isDeleteId = isDeleteId;
    }
}
