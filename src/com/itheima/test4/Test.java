package com.itheima.test4;

public class Test {
    public static void main(String[] args) {


        Mythread t1 = new Mythread();
        Mythread t2 = new Mythread();
        Mythread t3 = new Mythread();
        Mythread t4 = new Mythread();
        Mythread t5 = new Mythread();

        t1.setName("小张");
        t2.setName("小姜");
        t3.setName("小李");
        t4.setName("小王");
        t5.setName("小明");

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();


    }
}