package com.aaa.creator2.entity;

public class OrdersItem {
    private Integer omid;
    private Integer pid;
    private Integer ordernum;
    private String onumeration;
    private Product product;

    public Integer getOmid() {
        return omid;
    }

    public void setOmid(Integer omid) {
        this.omid = omid;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public Integer getOrdernum() {
        return ordernum;
    }

    public void setOrdernum(Integer ordernum) {
        this.ordernum = ordernum;
    }

    public String getOnumeration() {
        return onumeration;
    }

    public void setOnumeration(String onumeration) {
        this.onumeration = onumeration;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    @Override
    public String toString() {
        return "OrdersItem{" +
                "omid=" + omid +
                ", pid=" + pid +
                ", ordernum=" + ordernum +
                ", onumeration='" + onumeration + '\'' +
                ", product=" + product +
                '}';
    }
}
