package com.qf.pojo;

public class TestOne {
    int id;
    String name;
    String pass;

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

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public TestOne() {
        super();
    }

    public TestOne(int id, String name, String pass) {
        this.id = id;
        this.name = name;
        this.pass = pass;
    }

    @Override
    public String toString() {
        return "TestOne{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", pass='" + pass + '\'' +
                '}';
    }
}
