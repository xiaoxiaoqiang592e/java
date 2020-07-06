package com.javakc.test.ch3;

public class 构造方法test {
    public static void main(String[] args) {
        //new 对象时自动调用构造方法
        构造方法 a = new 构造方法();
        构造方法 a1 = new 构造方法(10,20);

        a = null;
        a1 = null;

        System.gc();
    }
}
