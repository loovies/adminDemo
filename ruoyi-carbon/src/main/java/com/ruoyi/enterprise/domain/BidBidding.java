package com.ruoyi.enterprise.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 招投标对象 bid_bidding
 * 
 * @author ruoyi
 * @date 2023-11-09
 */
public class BidBidding extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键 */
    private Long id;

    /** 招投标标题 */
    @Excel(name = "招投标标题")
    private String bidTitle;

    /** 招投标内容 */
    @Excel(name = "招投标内容")
    private String bidContent;

    /** 发布时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "发布时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date bidPublishDatetime;

    /** 发布者 */
    @Excel(name = "发布者")
    private String bidPublisher;

    /** 发布分类  1招标预告 2招标公告 3 中标公告 4企业采购 */
    @Excel(name = "发布分类  1招标预告 2招标公告 3 中标公告 4企业采购")
    private Integer category;

    /** 开始时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "开始时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date beginDate;

    /** 结束时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "结束时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date endDate;

    /** 状态 待开标 0 资质审核 1 已过期 2 开标结果 3 */
    @Excel(name = "状态 待开标 0 资质审核 1 已过期 2 开标结果 3")
    private Integer status;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setBidTitle(String bidTitle) 
    {
        this.bidTitle = bidTitle;
    }

    public String getBidTitle() 
    {
        return bidTitle;
    }
    public void setBidContent(String bidContent) 
    {
        this.bidContent = bidContent;
    }

    public String getBidContent() 
    {
        return bidContent;
    }
    public void setBidPublishDatetime(Date bidPublishDatetime) 
    {
        this.bidPublishDatetime = bidPublishDatetime;
    }

    public Date getBidPublishDatetime() 
    {
        return bidPublishDatetime;
    }
    public void setBidPublisher(String bidPublisher) 
    {
        this.bidPublisher = bidPublisher;
    }

    public String getBidPublisher() 
    {
        return bidPublisher;
    }
    public void setCategory(Integer category) 
    {
        this.category = category;
    }

    public Integer getCategory() 
    {
        return category;
    }
    public void setBeginDate(Date beginDate) 
    {
        this.beginDate = beginDate;
    }

    public Date getBeginDate() 
    {
        return beginDate;
    }
    public void setEndDate(Date endDate) 
    {
        this.endDate = endDate;
    }

    public Date getEndDate() 
    {
        return endDate;
    }
    public void setStatus(Integer status) 
    {
        this.status = status;
    }

    public Integer getStatus() 
    {
        return status;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("bidTitle", getBidTitle())
            .append("bidContent", getBidContent())
            .append("bidPublishDatetime", getBidPublishDatetime())
            .append("bidPublisher", getBidPublisher())
            .append("category", getCategory())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .append("remark", getRemark())
            .append("beginDate", getBeginDate())
            .append("endDate", getEndDate())
            .append("status", getStatus())
            .toString();
    }
}
