package com.itheima.demo06.Thread;

/**
 * @ClassName MyThreadTest
 * @Description: TODO
 * @Author true
 * @Date 2020/5/5
 * @Version V1.0
 **/
public class MyThreadTest extends Thread {

    @Override
    public void run() {
        for(int i = 1;i<20;i++){
            System.out.println("Thread:"+i);
        }
    }
}
