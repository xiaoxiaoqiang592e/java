package com.javakc.test.ch3;

public class 引用数据类型 {
    public static void main(String[] args) {


        A a1 = new A();
        a1.x = 10;

        A a2 = a1;
        a2.x++;

        System.out.println(a2.x);

        //String 引用数据类型 按值传递
        String S1="javakc77";
        String S2=S1;

        S1 = "javakc78";

        System.out.println(S1);
        System.out.println(S2);

    }
}

 class A {
    int x;
}