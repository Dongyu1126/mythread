package com.itheima.test4;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

public class Mythread extends Thread{
    static int count = 3;
    //static double money = 100;
    static BigDecimal money = BigDecimal.valueOf(100.0);
    //static final double min = 0.01;
    static final BigDecimal min = BigDecimal.valueOf(0.01);

    @Override
    public void run() {

        synchronized(Mythread.class){


            if(count == 0){
                System.out.println(getName() + "没有抢到红包!");
            }else{
                //double prize = 0;
                BigDecimal prize;
                if (count == 1){
                    prize = money;

                }else{
                    Random r = new Random();
//                    prize = r.nextDouble(money - (count - 1) * min);
                    prize = BigDecimal.valueOf(r.nextDouble( money.subtract(BigDecimal.valueOf(count-1).multiply(min)).doubleValue() ));
                    //设置小数点保留两位，四舍五入
                    prize = prize.setScale(2, RoundingMode.HALF_UP);
                    ///if(prize < min)  prize = min;//如果抢到的低于0.01元则视为就是最小的min0.01元

                }

                //更新money值和count次数
                money = money.subtract(prize);
                count --;
                System.out.println(getName()+"抢到了"+prize+"元");
            }



        }

    }
}
