package com.ruoyi.common.core.page;

import java.io.Serializable;
import java.util.List;

public class PageResult implements Serializable {

    /**
     * 总记录数
     */
    private Integer total;

    /**
     * 当前页数据合集
     */
    private List records;

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public List getRecords() {
        return records;
    }

    public void setRecords(List records) {
        this.records = records;
    }

    public PageResult() {
    }

    public PageResult(Integer total, List records) {
        this.total = total;
        this.records = records;
    }

    @Override
    public String toString() {
        return "PageResult{" +
                "total=" + total +
                ", records=" + records +
                '}';
    }
}
