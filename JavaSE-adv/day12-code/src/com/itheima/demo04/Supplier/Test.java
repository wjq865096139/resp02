package com.itheima.demo04.Supplier;

import java.util.function.Supplier;

/**
 * @ClassName Test
 * @Description: TODO
 * @Author true
 * @Date 2020/5/14
 * @Version V1.0
 **/
public class Test {

    public static void main(String[] args) {

        Object obj = get(()-> 1228);

        System.out.println(obj);

    }

    public static <T> T get(Supplier<T> supplier){
        return supplier.get();
    }

}
