package com.itheima.test1;

public class Test1 extends Thread{

    static int ticket = 0;
    @Override
    public void run() {
        while(true){
            synchronized (Test1.class){
            if(ticket < 20){
                try {
                    Thread.sleep(300);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                ticket++;
                System.out.println(getName() + "窗口卖出第"+ ticket +"张票");
            }else{
                break;
            }
        }


        }



//        for (int i = 0; i < 20; i++) {
//            try {
//                Thread.sleep(300);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//            System.out.println(getName() + "窗口卖出第"+ i +"张票");
//        }
    }
}
