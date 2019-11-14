package com.aaa.creator2.entity;

public class ProductVO {
    private Integer pid;
    private String pimage;
    private String pname;
    private String details;
    private Integer sid;
    private float price;
    private Integer onum;
    private Integer sales;
    private Integer pstate;
    private String sname;

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getPimage() {
        return pimage;
    }

    public void setPimage(String pimage) {
        this.pimage = pimage;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }



    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }



    public Integer getOnum() {
        return onum;
    }

    public void setOnum(Integer onum) {
        this.onum = onum;
    }

    public Integer getSales() {
        return sales;
    }

    public void setSales(Integer sales) {
        this.sales = sales;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public Integer getPstate() {
        return pstate;
    }

    public void setPstate(Integer pstate) {
        this.pstate = pstate;
    }
}
