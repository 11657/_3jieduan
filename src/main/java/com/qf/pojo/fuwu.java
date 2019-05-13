package com.qf.pojo;

public class fuwu {
    private  int id;
    private  String zhi;
    private  String xu;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getZhi() {
        return zhi;
    }

    public void setZhi(String zhi) {
        this.zhi = zhi;
    }

    public String getXu() {
        return xu;
    }

    public void setXu(String xu) {
        this.xu = xu;
    }

    @Override
    public String toString() {
        return "fuwu{" +
                "id=" + id +
                ", zhi='" + zhi + '\'' +
                ", xu='" + xu + '\'' +
                '}';
    }
}
