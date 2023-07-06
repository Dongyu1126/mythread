package com.itheima.test5;

import java.util.ArrayList;

import java.util.Collections;

public class Test {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        //Collections.addAll(list,20,50,100,600,1000);
        list.add(50);
        list.add(500);
        list.add(60);
        list.add(700);
        list.add(1000);

        MyThread t1 = new MyThread(list);
        MyThread t2 = new MyThread(list);


        t1.setName("抽奖箱1");
        t2.setName("抽奖箱2");

        t1.start();
        t2.start();
    }

}
