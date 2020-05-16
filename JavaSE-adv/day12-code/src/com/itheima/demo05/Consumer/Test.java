package com.itheima.demo05.Consumer;

import java.util.function.Consumer;

/**
 * @ClassName Test
 * @Description: TODO
 * @Author true
 * @Date 2020/5/14
 * @Version V1.0
 **/
public class Test {

    public static void main(String[] args) {

        method("gmn", (o) -> System.out.println(o));

    }


    public static void method(String string, Consumer consumer){
        consumer.accept(string);
    }
}
