package com.xyh.domain;

import java.util.Date;

public class Userbuy {
    private Integer id;

    private Integer userid;

    private Integer ele;

    private Integer water;

    private Date buytime;

    private String buytimestring;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
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

    public Date getBuytime() {
        return buytime;
    }

    public void setBuytime(Date buytime) {
        this.buytime = buytime;
    }

    public String getBuytimestring() {
        return buytimestring;
    }

    public void setBuytimestring(String buytimestring) {
        this.buytimestring = buytimestring == null ? null : buytimestring.trim();
    }
}