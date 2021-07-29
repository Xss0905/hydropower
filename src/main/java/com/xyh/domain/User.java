package com.xyh.domain;

import java.util.List;

public class User {
    private Integer id;

    private String username;

    private Integer pwd;

    private Integer phone;

    private String address;

    private Integer money;

    private Integer ele;

    private Integer water;

    private Userbuy userbuy;

    public Userbuy getUserbuy() {
        return userbuy;
    }

    public void setUserbuy(Userbuy userbuy) {
        this.userbuy = userbuy;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public Integer getPwd() {
        return pwd;
    }

    public void setPwd(Integer pwd) {
        this.pwd = pwd;
    }

    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public Integer getMoney() {
        return money;
    }

    public void setMoney(Integer money) {
        this.money = money;
    }

    public Integer getEle() {
        return ele;
    }

    public void setEle(Integer ele) {
        this.ele = ele;
    }

    public Integer getWater() {
        return water;
    }

    public void setWater(Integer water) {
        this.water = water;
    }
}