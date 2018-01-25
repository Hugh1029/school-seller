package cn.answering.seller.util;

import java.util.List;

/**
 * Created by zjp on 2018/1/19.
 * QQ：34948062
 * github: https://www.github.com/zjp1029
 * web： http://www.zjp1029.cn
 */
public class PageEntity {
    private int total;
    private List rows;

    public PageEntity(int total, List rows){
        super();
        this.total = total;
        this.rows = rows;
    }

    public int getTotal() {
        return total;
    }
    public void setTotal(int total) {
        this.total = total;
    }
    public List getRows() {
        return rows;
    }
    public void setRows(List rows) {
        this.rows = rows;
    }
}
