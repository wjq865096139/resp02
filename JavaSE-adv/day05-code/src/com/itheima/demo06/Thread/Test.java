package com.itheima.demo06.Thread;

/**
 * @ClassName Test
 * @Description: TODO
 * @Author true
 * @Date 2020/5/5
 * @Version V1.0
 **/
public class Test {

    public static void main(String[] args) {

        Thread t = new MyThreadTest();
        t.run();
        System.out.println("======");
        t.start();

        for(int i = 0;i<20;i++){
            System.out.println("mian:"+i);
        }

    }

}
