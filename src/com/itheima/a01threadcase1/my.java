package com.itheima.a01threadcase1;

public class my {
    public static void main(String[] args) {
        test demo1 = new test();
        test demo2 = new test();

        demo1.setName("线程1");
        demo2.setName("线程2");

        demo1.start();
        demo2.start();
    }
}
