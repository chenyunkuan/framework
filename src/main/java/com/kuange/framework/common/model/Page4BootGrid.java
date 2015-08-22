package com.kuange.framework.common.model;

import java.util.List;

/**
 * Created by Administrator on 2015/8/21.
 */
public class Page4BootGrid<T>{

    private int current;

    private int rowCount;

    private int total;

    private List<T> rows;

    public int getRowCount() {
        return rowCount;
    }

    public void setRowCount(int rowCount) {
        this.rowCount = rowCount;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public List<T> getRows() {
        return rows;
    }

    public void setRows(List<T> rows) {
        this.rows = rows;
    }

    public int getCurrent() {

        return current;
    }

    public void setCurrent(int current) {
        this.current = current;
    }
}
