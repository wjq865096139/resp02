package com.itheima.demo04.Runnable;

/**
 * @ClassName WhileTest
 * @Description: TODO
 * @Author true
 * @Date 2020/5/5
 * @Version V1.0
 **/
public class WhileTest {

    public static void main(String[] args) {

        int i = 100;
        while (true){
            System.out.println(i);
            i--;
            if(i<0){
                break;
            }
        }

    }

}
