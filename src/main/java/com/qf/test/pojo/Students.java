package com.qf.test.pojo;


public class Students {

    private int id;
    private String uname;
    private int age;
    private String sex;
    private int gid;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getGid() {
        return gid;
    }

    public void setGid(int gid) {
        this.gid = gid;
    }

    @Override
    public String toString() {
        return "Students{" +
                "id=" + id +
                ", uname='" + uname + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", gid=" + gid +
                '}';
    }

    public Students(int id, String uname, int age, String sex, int gid) {
        this.id = id;
        this.uname = uname;
        this.age = age;
        this.sex = sex;
        this.gid = gid;
    }

    public Students(){

    }

}
