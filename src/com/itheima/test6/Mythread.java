package com.itheima.test6;

import java.util.ArrayList;
import java.util.Collections;

public class Mythread extends Thread{
    ArrayList<Integer> list;

    public Mythread(ArrayList<Integer> list) {
        this.list = list;
    }

    //线程1
    //static ArrayList<Integer> list1 = new ArrayList<>();
    //线程2
    //static ArrayList<Integer> list2 = new ArrayList<>();


    @Override
    public void run() {
        ArrayList<Integer> boxlist = new ArrayList<>();//这里就不需要单独创建n个线程了，利用了各个线程在栈中互相独立，且都会有boxlist这种在run方法里面的定义
        while(true){

            synchronized (Mythread.class){

                if(list.size() == 0) {
                    System.out.println(getName()+boxlist);
//                    if("抽奖箱1".equals(getName())){
//                        System.out.println("抽奖箱1"+list1);
//                    }else {
//                        System.out.println("抽奖箱2"+list2);
//                    }
                    break;
                }
                else {
                    Collections.shuffle(list);
                    Integer prize = list.remove(0);
                    boxlist.add(prize);
//                    if("抽奖箱1".equals(getName())){
//                        list1.add(prize);
//                    }else {
//                        list2.add(prize);
//                    }
//                    System.out.println(getName() + "抽出了"+prize+"元");
                }
            }
            try {
                Thread.sleep(10); //在外面睡觉，可以让其他线程进来，结果平均一点
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
