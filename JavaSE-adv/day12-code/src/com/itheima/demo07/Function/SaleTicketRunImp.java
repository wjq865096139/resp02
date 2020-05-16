package com.itheima.demo07.Function;

/**
 * @ClassName SaleTicketRunImp
 * @Description: TODO
 * @Author true
 * @Date 2020/5/14
 * @Version V1.0
 **/
public class SaleTicketRunImp implements Runnable {

    int ticket = 20;

    @Override
    public void run() {
        while (true){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (this){
                if(ticket <= 0)
                    return;
                System.out.println(Thread.currentThread().getName()+"卖出一张票，还剩:"+ --ticket);
            }
        }
    }
}
