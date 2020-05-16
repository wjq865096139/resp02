package com.itheima.demo04.TreadTest;

/**
 * @ClassName RunImp3
 * @Description: TODO
 * @Author true
 * @Date 2020/5/5
 * @Version V1.0
 **/
public class RunImp3 implements Runnable {

    int ticket = 100;
    public int cnt = 0;

    @Override
    public void run() {
        play();
       // System.out.println(cnt);
    }

    public synchronized void play(){
        while (true){
            if(ticket <= 0)
                return;
            System.out.println(Thread.currentThread().getName()+" "+ticket);
            ticket--;
            cnt++;
        }
    }
}
