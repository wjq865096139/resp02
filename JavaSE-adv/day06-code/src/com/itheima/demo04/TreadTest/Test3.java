package com.itheima.demo04.TreadTest;

/**
 * @ClassName Test3
 * @Description: TODO
 * @Author true
 * @Date 2020/5/5
 * @Version V1.0
 **/
public class Test3 {

    public static void main(String[] args) {

        Runnable r = new RunImp3();
        RunImp3 runImp3 = new RunImp3();

        Thread t1 = new Thread(r,"aaa");
        Thread t2 = new Thread(r,"bbb");
        Thread t3 = new Thread(r,"ccc");
        t1.start();
        t2.start();
        t3.start();


    }

}
