package com.itheima.demo01.File;

/**
 * @ClassName Test2
 * @Description: TODO
 * @Author true
 * @Date 2020/5/8
 * @Version V1.0
 **/
public class Test2 {


    public static void main(String[] args) {

        System.out.println(print(5));

    }

    public static int print(int a){

        if(a == 1) return 1;

        return a * print(a-1);

    }

}
