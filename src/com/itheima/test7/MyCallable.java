package com.itheima.test7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.Callable;

public class MyCallable implements Callable<Integer> {
    ArrayList<Integer> list;

    public MyCallable(ArrayList<Integer> list) {
        this.list = list;
    }

    @Override
    public Integer call() throws Exception {
        ArrayList<Integer> boxlists = new ArrayList<>();
        while (true) {
            synchronized (MyCallable.class) {
                if (list.size() == 0) {
                    System.out.println(Thread.currentThread().getName() + boxlists);
                    break;
                } else {
                    Collections.shuffle(list);
                    Integer prize = list.remove(0);
                    boxlists.add(prize);
                }
            }
            Thread.sleep(10);
        }

        //返回最后集合中的最大值
        if (boxlists.size() == 0) {
            return null;
        } else {
            return Collections.max(boxlists);
        }
    }
}
