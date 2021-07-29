package com.xyh;

public class Plates {
    private String cls_name;
    private double prob;
    private String txt;
    private double cls_prob;
    private String detail;
    private Roi roi;
    public void setCls_name(String cls_name) {
        this.cls_name = cls_name;
    }
    public String getCls_name() {
        return cls_name;
    }

    public void setProb(double prob) {
        this.prob = prob;
    }
    public double getProb() {
        return prob;
    }

    public void setTxt(String txt) {
        this.txt = txt;
    }
    public String getTxt() {
        return txt;
    }

    public void setCls_prob(double cls_prob) {
        this.cls_prob = cls_prob;
    }
    public double getCls_prob() {
        return cls_prob;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }
    public String getDetail() {
        return detail;
    }

    public void setRoi(Roi roi) {
        this.roi = roi;
    }
    public Roi getRoi() {
        return roi;
    }
}
