package com.itheima.demo07.Function;

/**
 * @ClassName Work2
 * @Description: TODO
 * @Author true
 * @Date 2020/5/15
 * @Version V1.0
 **/

import java.util.LinkedList;
import java.util.List;

/**
 * 2.两个人AB通过一个账户A在柜台取钱和B在ATM机取钱！
 * 思路：
 */
public class Work2 {

    public static Boolean flag = false;
    public static void main(String[] args) {

        List<Double> list = new LinkedList<Double>();

        // 存钱
        new Thread(){
            @Override
            public void run() {
                while (true){
                    if(!flag){
                        try {
                            list.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    save(list);
                    list.notify();
                }
            }
        }.start();

        // 取钱
        new Thread(){
            @Override
            public void run() {
                if(flag){
                    try {
                        list.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                get(list);
                list.notify();

            }
        }.start();

    }

    public static synchronized void save(List<Double> list){
        list.add(66.6);
        System.out.println("存入"+list.get(0)+"元");
    }

    public static synchronized void get(List<Double> list){
        System.out.println("取出"+list.remove(0)+"元");
    }

}
