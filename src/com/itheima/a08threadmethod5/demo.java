package com.itheima.a08threadmethod5;

public class demo {
    public static void main(String[] args) throws InterruptedException {
        MyLove t1 = new MyLove();

        t1.setName("小草莓");

        t1.start();

        t1.join();

        for (int i = 0; i < 10; i++) {
            System.out.println("main线程" + i);
        }
    }
}
