package com.qf.pojo;

public class dingdan {
    private  int  id;
    private  String name;
    private  String bb;
    private  String cc;
    private  String hh;

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

    public String getBb() {
        return bb;
    }

    public void setBb(String bb) {
        this.bb = bb;
    }

    public String getCc() {
        return cc;
    }

    public void setCc(String cc) {
        this.cc = cc;
    }

    public String getHh() {
        return hh;
    }

    public void setHh(String hh) {
        this.hh = hh;
    }

    @Override
    public String toString() {
        return "dingdan{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", bb='" + bb + '\'' +
                ", cc='" + cc + '\'' +
                ", hh='" + hh + '\'' +
                '}';
    }
}
