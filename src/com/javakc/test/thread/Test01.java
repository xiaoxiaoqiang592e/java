package com.javakc.test.thread;

public class Test01 {
    public static void main(String[] args) {
        MyTread mt = new MyTread();
        MyTread mt1 = new MyTread();
        //启动线程
        mt.start();
        mt1.start();
    }
}
