package com.qf.pojo;

import java.util.Date;

public class fankui {
    private  int id;
    private  String name;
    private  String gaiyao;
    private  String fuwuleixing;
    private  String creator;
    private Date time;

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

    public String getFuwuleixing() {
        return fuwuleixing;
    }

    public void setFuwuleixing(String fuwuleixing) {
        this.fuwuleixing = fuwuleixing;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "fankui{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gaiyao='" + gaiyao + '\'' +
                ", fuwuleixing='" + fuwuleixing + '\'' +
                ", creator='" + creator + '\'' +
                ", time=" + time +
                '}';
    }
}
