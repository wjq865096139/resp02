package com.itheima.demo04.TreadTest;

/**
 * @ClassName RunImp2
 * @Description: TODO
 * @Author true
 * @Date 2020/5/5
 * @Version V1.0
 **/
public class RunImp2 implements Runnable {

    int ticket = 100;

    @Override
    public void run() {
        //synchronized (this){
            while (true){
                if(ticket <= 0)
                    return;
                //System.out.println(Thread.currentThread().getName()+" "+ticket);
                System.out.println(this);
                ticket--;
            }
        //}
    }
}
