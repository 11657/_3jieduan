package com.qf.pojo;

public class changping {
    private  int sid;
    private  String name;
    private  String xinghao;
    private  String dengji;
    private  String danwei;
    private  String yuan;
    private  String beizhu;

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getXinghao() {
        return xinghao;
    }

    public void setXinghao(String xinghao) {
        this.xinghao = xinghao;
    }

    public String getDengji() {
        return dengji;
    }

    public void setDengji(String dengji) {
        this.dengji = dengji;
    }

    public String getDanwei() {
        return danwei;
    }

    public void setDanwei(String danwei) {
        this.danwei = danwei;
    }

    public String getYuan() {
        return yuan;
    }

    public void setYuan(String yuan) {
        this.yuan = yuan;
    }

    public String getBeizhu() {
        return beizhu;
    }

    public void setBeizhu(String beizhu) {
        this.beizhu = beizhu;
    }

    @Override
    public String toString() {
        return "changping{" +
                "sid=" + sid +
                ", name='" + name + '\'' +
                ", xinghao='" + xinghao + '\'' +
                ", dengji='" + dengji + '\'' +
                ", danwei='" + danwei + '\'' +
                ", yuan='" + yuan + '\'' +
                ", beizhu='" + beizhu + '\'' +
                '}';
    }
}

