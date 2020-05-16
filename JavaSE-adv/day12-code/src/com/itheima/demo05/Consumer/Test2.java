package com.itheima.demo05.Consumer;

import java.util.function.Consumer;

/**
 * @ClassName Test2
 * @Description: TODO
 * @Author true
 * @Date 2020/5/14
 * @Version V1.0
 **/
public class Test2 {

    public static void main(String[] args) {
        method("gnm", (s) -> System.out.println(s.toUpperCase()),(s) ->System.out.println(s.toLowerCase()));
    }

    public static void method(String string, Consumer<String> con1,Consumer<String> con2){
        con1.andThen(con2).accept(string);
    }

}
