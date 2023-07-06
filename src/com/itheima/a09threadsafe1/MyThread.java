package com.itheima.a09threadsafe1;

public class MyThread extends Thread {

    //static表示这个类所有的对象，都共享ticket数据，即保证唯一性，否则ticket会每个线程都有
    static int ticket = 0;//0 ~ 99
    //static Object oo = new Object();
    @Override
    public void run() {
        while (true){
        synchronized (MyThread.class) {//（）里面要保证唯一性，可以static随便定义一个，也可以用当前类的字节码文件
                //同步代码块
            if (ticket < 100) {
                try {
                    Thread.sleep(10);
                    //某个线程抢到并睡觉的时候，其他线程可能会趁机抢到，导致重复或则超出范围，
                    // 根本原因是线程执行时具有随机性，解决方法给其锁起来，synchronized 一个线程用的时候，另一个用不了
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
//                    try {
//                        Thread.sleep(10);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
                ticket++;
                System.out.println(getName() + "正在卖第" + ticket + "张票！！！");
            } else {
                break;
            }

            }
        }

    }



}
