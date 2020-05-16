package com.itheima.demo01.BufferedStream;

import java.util.LinkedList;
import java.util.List;

/**
 * @ClassName Work2
 * @Description: TODO
 * @Author true
 * @Date 2020/5/13
 * @Version V1.0
 **/

/**
 * 思路：
 * 1.定义一个LinkedList集合供A线程和B线程去写入读取数据
 * 2.
 */
public class Work222 {

    public static Boolean flag = false;
    public static void main(String[] args) {

        List<Integer> list = new LinkedList<Integer>();

        new Thread(){
            @Override
            public void run() {
                while(true){
                    synchronized (list){
                        if(flag){
                            try {
                                list.wait();
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                        push(list);
                        flag = true;
                        list.notify();
                    }
                }
            }
        }.start();

        new Thread(){
            @Override
            public void run() {
                while(true){
                    synchronized (list){
                        if(flag){
                            pop(list);
                            flag = false;
                            list.notify();
                        }else{
                            try {
                                list.wait();
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                    }
                }
            }
        }.start();

    }

    public static void push(List<Integer> list)  {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("添加数据111");
        list.add(1);
    }

    public static void pop(List<Integer> list){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("获取数据1");
        list.remove(0);
    }

}
