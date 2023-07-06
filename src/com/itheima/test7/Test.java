package com.itheima.test7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class Test {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list,50,60,80,100,200,600,800,1000);

        MyCallable mc = new MyCallable(list);//表示多线程要执行的任务

        FutureTask<Integer> ft1 = new FutureTask<>(mc);//FutureTask管理多线程运行结果
        FutureTask<Integer> ft2 = new FutureTask<>(mc);//要设置2个，不然只会被一个抽奖箱拿走所有的结果，也显示一个抽奖箱的结果

        Thread t1 = new Thread(ft1);
        Thread t2 = new Thread(ft2);

        t1.setName("抽奖箱1");
        t2.setName("抽奖箱2");

        t1.start();
        t2.start();

        Integer max1 = ft1.get();
        Integer max2 = ft2.get();

        System.out.println("抽奖箱1：" + max1);
        System.out.println("抽奖箱2：" + max2);


        if (max1 > max2){
            System.out.println("在此次抽奖活动中，抽奖箱1产生了最大奖项"+max1+"元");
        }else{
            System.out.println("在此次抽奖活动中，抽奖箱2产生了最大奖项"+max2+"元");
        }



    }
}
