package com.itheima.demo04.TreadTest;

/**
 * @ClassName TestNotify
 * @Description: TODO
 * @Author true
 * @Date 2020/5/5
 * @Version V1.0
 **/
public class TestNotify {

    public static void main(String[] args) {

        Object obj = new Object();

        new Thread(){
            @Override
            public void run() {
                while (true){
                    synchronized (obj){
                        System.out.println("买包子");
                        try {
                            obj.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        System.out.println("吃包子");
                        System.out.println("------------");
                    }
                }
            }
        }.start();

        new Thread(){
            @Override
            public void run() {
                while (true){
                    try {
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (obj){
                        System.out.println("包子做好了");
                        obj.notify();
                    }
                }
            }
        }.start();

    }

}
