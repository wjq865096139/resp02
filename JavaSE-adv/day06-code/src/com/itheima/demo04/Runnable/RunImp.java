package com.itheima.demo04.Runnable;

/**
 * @ClassName RunImp
 * @Description: TODO
 * @Author true
 * @Date 2020/5/5
 * @Version V1.0
 **/
public class RunImp implements Runnable {
    @Override
    public void run() {
        for(int i =1;i<20;i++){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+i);
        }
    }
}
