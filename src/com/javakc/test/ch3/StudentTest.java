package com.javakc.test.ch3;

public class StudentTest {
    public static void main(String[] args) {
        //使用属性时，必须先new对象
        Student s = new Student();
        s.name ="zhangsan";
        s.age = 20;
        s.addreess = "北京";


        s.add(10,20);
        s.song("晓小强");

        System.out.println(s);
        System.out.println(s.name);
        System.out.println(s.age);
        System.out.println(s.addreess);
        System.out.println(s.time);

    }
}