package com.itheima.demo04.TreadTest;

/**
 * @ClassName RunImp
 * @Description: TODO
 * @Author true
 * @Date 2020/5/5
 * @Version V1.0
 **/
public class RunImp implements Runnable {

    int ticket = 100;

    @Override
    public void run() {
        while (true){
            if(ticket <= 0)
                return;
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+": "+ticket);
            ticket--;
        }
    }
}
