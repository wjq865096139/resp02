package com.itheima.demo07.Function;

/**
 * @ClassName Work1
 * @Description: TODO
 * @Author true
 * @Date 2020/5/14
 * @Version V1.0
 **/

/**
 * 1.三个售票窗口同时出售20张票
 * 思路：
 * 1.创建一个Runnable子类对象，再创建三个卖票的线程对象，三个线程对象要用同一个Runnable子类对象，保证票源是同一个
 * 2.再Runnable实现类的run方法中用while(true)保证一直处于卖票状态
 * 3.用synchronized同步代码块保证卖票的唯一性，不会导致同一张票卖给多个人
 *
 */

public class Work1 {

    public static void main(String[] args) {

        SaleTicketRunImp sale = new SaleTicketRunImp();
        Thread t1 = new Thread(sale, "一号窗口");
        Thread t2 = new Thread(sale, "二号窗口");
        Thread t3 = new Thread(sale, "三号窗口");
        t1.start();
        t2.start();
        t3.start();

    }

}
