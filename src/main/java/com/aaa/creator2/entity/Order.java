package com.aaa.creator2.entity;

import net.sf.jsqlparser.expression.DateTimeLiteralExpression;

import java.util.Date;
import java.util.List;

public class Order {
    private Integer oid;
    private String onumeration;
    private Integer uid;
    private Date otime;
    private Double osum;
    private List<OrdersItem> ordersItemList;

    public Integer getOid() {
        return oid;
    }

    public void setOid(Integer oid) {
        this.oid = oid;
    }

    public String getOnumeration() {
        return onumeration;
    }

    public void setOnumeration(String onumeration) {
        this.onumeration = onumeration;
    }



    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Date getOtime() {
        return otime;
    }

    public void setOtime(Date otime) {
        this.otime = otime;
    }

    public Double getOsum() {
        return osum;
    }

    public void setOsum(Double osum) {
        this.osum = osum;
    }

    public List<OrdersItem> getOrdersItemList() {
        return ordersItemList;
    }

    public void setOrdersItemList(List<OrdersItem> ordersItemList) {
        this.ordersItemList = ordersItemList;
    }


}
