package com.qf.pojo;

public class laiyuan {
    private  int id;
    private String dengji;
    private  String number;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDengji() {
        return dengji;
    }

    public void setDengji(String dengji) {
        this.dengji = dengji;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "laiyuan{" +
                "id=" + id +
                ", dengji='" + dengji + '\'' +
                ", number='" + number + '\'' +
                '}';
    }
}
