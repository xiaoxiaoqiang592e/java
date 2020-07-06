package com.javakc.test.ch3;

public class 构造方法 {

    public String name;

        //构造方法，与类名相同，无返回类型，创建对象时自动调用
        public 构造方法()
        {
            System.out.println("构造方法");
        }

        public 构造方法(int a,int b)
        {
            this();//调用构造方法
            System.out.println(a+b);
        }

        //析构方法
        @Override
        public void finalize()
        {
            //this();//不能在其他方法使用this调用构造方法
            System.out.println("销毁了构造方法类");
        }

        public void method()
        {
            System.out.println("method 方法");
        }
}
