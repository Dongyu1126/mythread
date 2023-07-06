package com.itheima.a08threadmethod5;

public class MyLove extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println(getName() + "@" + i);
        }
    }
}
