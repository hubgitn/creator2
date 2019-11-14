package com.aaa.creator2.entity;

import net.sf.jsqlparser.expression.DateTimeLiteralExpression;

import java.util.Date;

public class Orderitem {
    private int omid;
    private String onumeration;    //DateTimeLiteralExpression.DateTime
    private int pid;
    private int ordernum;      //  int  Integer[]
//    private Integer oid;



    public int getOmid() {
        return omid;
    }

    public void setOmid(int omid) {
        this.omid = omid;
    }

//    public DateTimeLiteralExpression.DateTime getOnumeration() {
//        return onumeration;
//    }
//
//    public void setOnumeration(DateTimeLiteralExpression.DateTime onumeration) {
//        this.onumeration = onumeration;
//    }


    public String getOnumeration() {
        return onumeration;
    }

    public void setOnumeration(String onumeration) {
        this.onumeration = onumeration;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public int getOrdernum() {
        return ordernum;
    }

    public void setOrdernum(int ordernum) {
        this.ordernum = ordernum;
    }


//    public Integer getOid() {
//        return oid;
//    }
//
//    public void setOid(Integer oid) {
//        this.oid = oid;
//    }
}
