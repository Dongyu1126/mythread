package com.itheima.test5;

import java.util.ArrayList;
import java.util.Collections;

public class MyThread extends Thread{

    ArrayList<Integer> list;

    public MyThread(ArrayList<Integer> list) {
        this.list = list;
    }

    @Override
    public void run() {


        while (true){
            synchronized (MyThread.class){
                if(list.size()==0) break;
                else{
                    Collections.shuffle(list);//打乱剩下的顺序
                    Integer prize = list.remove(0);
                    System.out.println(getName()+"抽除了"+prize+"元");
                }
            }
            try {
                Thread.sleep(10);//每运行完一个线程，让其休息一小段时间，使得每个线程均匀的抽中奖
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }

}
