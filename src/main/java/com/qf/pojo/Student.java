package com.qf.pojo;

    public class Student {
        private int sid;
        private String name;
        private String pass;
        private int age;
        private double score;

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
        public String getPass() {
            return pass;
        }
        public void setPass(String pass) {
            this.pass = pass;
        }
        public int getAge() {
            return age;
        }
        public void setAge(int age) {
            this.age = age;
        }
        public double getScore() {
            return score;
        }
        public void setScore(double score) {
            this.score = score;
        }
        @Override
        public String toString() {
            return "Student [sid=" + sid + ", name=" + name + ", pass=" + pass + ", age=" + age + ", score=" + score + "]";
        }

    }
