package com.javakc.test.thread;

public class Test02 {
    public static void main(String[] args) {
        MyThread1 Mt = new MyThread1();
        Thread th1 = new Thread(Mt);
        Thread th2 = new Thread(Mt);

        //修改进程名称
        th1.setName("线程1");
        th2.setName("线程2");
        //两个线程抢CPU时间片
        //CPU同一时间只能为一个线程服务
        //双核 2个线程
        //4核 为8 个线程

        //设置线程优先级
        th1.setPriority(5);//默认为5   1   10
        th2.setPriority(Thread.MAX_PRIORITY);

        th1.start();
        th2.start();
    }
}
