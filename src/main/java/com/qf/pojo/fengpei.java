package com.qf.pojo;

import java.util.Date;

public class fengpei {
    private int id;
    private String zz;
    private  String cc;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    @Override
    public String toString() {
        return "fengpei{" +
                "id=" + id +
                ", zz='" + zz + '\'' +
                ", cc='" + cc + '\'' +
                '}';
    }
}
