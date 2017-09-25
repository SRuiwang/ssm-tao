package com.sr.web.webutils;

import java.util.List;

public class EasyUIResult {

    private Integer total;

    private List<? extends Object> rows;

    public EasyUIResult(Integer total, List<? extends Object> rows) {
        this.total = total;
        this.rows = rows;
    }

    public EasyUIResult(Long total, List<? extends Object> rows) {
        this.total = total.intValue();
        this.rows = rows;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public List<? extends Object> getRows() {
        return rows;
    }

    public void setRows(List<? extends Object> rows) {
        this.rows = rows;
    }
}