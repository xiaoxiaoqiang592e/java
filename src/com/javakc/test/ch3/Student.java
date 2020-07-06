package com.javakc.test.ch3;

import java.util.Date;

public class Student {
    //全局变量
    String name;
    int age;
    String addreess;
    Date time;

    public void add(int a,int b){
        //局部变量与全局变量一致时，就近原则
        String name = "张三";
        System.out.println("加法结果是:"+(a+b));
        System.out.println(name);
    }

    public void song(String a){
        //把传过来的参数赋值
        name = a;
        System.out.println("唱儿歌"+name);
    }

}
