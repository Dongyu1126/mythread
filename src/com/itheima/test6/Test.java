package com.itheima.test6;

import java.util.ArrayList;
import java.util.Collections;

public class Test {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list, 30, 60, 300, 600, 1000);

        Mythread t1 = new Mythread(list);
        Mythread t2 = new Mythread(list);

        t1.setName("抽奖箱1");
        t2.setName("抽奖箱2");

        t1.start();
        t2.start();


    }
}
