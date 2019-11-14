package com.aaa.creator2.entity;

import net.sf.jsqlparser.expression.DateTimeLiteralExpression;

public class Orders {
    private int oid;
    private String onumeration;
    private Integer uid;
    private DateTimeLiteralExpression.DateTime otime;
    private double osum;
    private int ostateid;

    public int getOid() {
        return oid;
    }

    public void setOid(int oid) {
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

    public DateTimeLiteralExpression.DateTime getOtime() {
        return otime;
    }

    public void setOtime(DateTimeLiteralExpression.DateTime otime) {
        this.otime = otime;
    }

    public double getOsum() {
        return osum;
    }

    public void setOsum(double osum) {
        this.osum = osum;
    }


    public int getOstateid() {
        return ostateid;
    }

    public void setOstateid(int ostateid) {
        this.ostateid = ostateid;
    }
}
