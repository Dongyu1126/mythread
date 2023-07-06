package com.itheima.threadpool1;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadDemo {
    public static void main(String[] args) {
        //1.获取线程池对象
        //ExecutorService pool1 = Executors.newCachedThreadPool();//创建没有上限的线程池
        ExecutorService pool1 = Executors.newFixedThreadPool(3);//创建一定量的线程池

        //2.提交任务
        pool1.submit(new Myrunner());
        pool1.submit(new Myrunner());
        pool1.submit(new Myrunner());
        pool1.submit(new Myrunner());
        pool1.submit(new Myrunner());

        //3.销毁线程池
        pool1.shutdown();

    }
}
