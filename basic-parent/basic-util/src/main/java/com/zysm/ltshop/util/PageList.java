package com.zysm.ltshop.util;

import java.util.ArrayList;
import java.util.List;

/**
 * Copyright (C), 2018-2019, Chong Qing  zy.
 *
 * @ClassName: PageList
 * @Description: 分页数据
 * @Author: Mr_shi
 * @CreateDate: 2019/1/27 11:07
 * @Version: 1.0
 */
public class PageList<T> {
    private int total = 1;
    private List<T> rows = new ArrayList<>();

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
}
