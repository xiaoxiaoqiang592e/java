package com.javakc.test.bean;

public class User {
    private int age ;
    private  int id ;
    private  String uname ;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

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

    public User(int age, int id, String uname) {
        this.age = age;
        this.id = id;
        this.uname = uname;

    }
    public User(){

    }
}
