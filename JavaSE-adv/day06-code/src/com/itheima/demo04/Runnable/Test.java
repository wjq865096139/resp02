package com.itheima.demo04.Runnable;

/**
 * @ClassName Test
 * @Description: TODO
 * @Author true
 * @Date 2020/5/5
 * @Version V1.0
 **/
public class Test {

    public static void main(String[] args) {

        Runnable r = new RunImp();
        Thread t = new Thread(r,"test");
        t.start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<20;i++){
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName()+i);
                }
            }
        },"匿名").start();

        for(int i=0;i<20;i++){
            System.out.println(Thread.currentThread().getName()+i);
        }




    }
}
