package com.itheima.test1;

import com.itheima.a01threadcase1.MyThread;

public class Demo1 {
    public static void main(String[] args) {

        Test1 t1 = new Test1();
        Test1 t2 = new Test1();

        t1.setName("线程1");
        t2.setName("线程2");

        t1.start();
        t2.start();
    }
}
