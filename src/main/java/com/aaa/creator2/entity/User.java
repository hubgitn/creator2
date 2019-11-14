package com.aaa.creator2.entity;


public class User {
    private Integer uid;
    private String openid;

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }

    @Override
    public String toString() {
        return "User{" +
                "uid=" + uid +
                ", openid='" + openid + '\'' +
                '}';
    }
}
