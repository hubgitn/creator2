package com.aaa.creator2.entity;

public class Products {
    private Integer pid;
    private String pimage;
    private String pname;
    private String detailsl;
    private Integer sid;
    private Double price;
    private Integer onum;
    private Integer sales;
    private Integer psid;

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

    public String getDetailsl() {
        return detailsl;
    }

    public void setDetailsl(String detailsl) {
        this.detailsl = detailsl;
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
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

    public Integer getPsid() {
        return psid;
    }

    public void setPsid(Integer psid) {
        this.psid = psid;
    }

    @Override
    public String toString() {
        return "Product{" +
                "pid=" + pid +
                ", pimage='" + pimage + '\'' +
                ", pname='" + pname + '\'' +
                ", detailsl='" + detailsl + '\'' +
                ", sid=" + sid +
                ", price=" + price +
                ", onum=" + onum +
                ", sales=" + sales +
                ", psid=" + psid +
                '}';
    }
}
