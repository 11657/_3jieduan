package com.qf.pojo;

import java.util.Date;

public class guidang {
    private int id;
    private  String name;
    private  String gaiyao;
    private  String zz;
    private  String cc;
    private  String vv;
    private  String aa;
    private  String ee;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGaiyao() {
        return gaiyao;
    }

    public void setGaiyao(String gaiyao) {
        this.gaiyao = gaiyao;
    }

    public String getZz() {
        return zz;
    }

    public void setZz(String zz) {
        this.zz = zz;
    }

    public String getCc() {
        return cc;
    }

    public void setCc(String cc) {
        this.cc = cc;
    }

    public String getVv() {
        return vv;
    }

    public void setVv(String vv) {
        this.vv = vv;
    }

    public String getAa() {
        return aa;
    }

    public void setAa(String aa) {
        this.aa = aa;
    }

    public String getEe() {
        return ee;
    }

    public void setEe(String ee) {
        this.ee = ee;
    }

    @Override
    public String toString() {
        return "guidang{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gaiyao='" + gaiyao + '\'' +
                ", zz='" + zz + '\'' +
                ", cc='" + cc + '\'' +
                ", vv='" + vv + '\'' +
                ", aa='" + aa + '\'' +
                ", ee='" + ee + '\'' +
                '}';
    }
}
