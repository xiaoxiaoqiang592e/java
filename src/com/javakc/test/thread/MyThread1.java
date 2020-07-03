package com.javakc.test.thread;

public class MyThread1 implements Runnable {
    @Override
    public void run() {
        //线程启动后，做什么？
        for (int i = 1; i <= 100; i++) {
            //获取当前对象，线程的名字
            System.out.println(Thread.currentThread().getName() + ":" + i);
        }
    }
}