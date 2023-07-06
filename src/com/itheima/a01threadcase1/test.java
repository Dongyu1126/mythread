package com.itheima.a01threadcase1;

public class test extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(getName() + " "+i);
        }
    }
}
