package com.itheima.demo06.Predicate;

import java.util.function.Predicate;

/**
 * @ClassName Test
 * @Description: TODO
 * @Author true
 * @Date 2020/5/14
 * @Version V1.0
 **/
public class Test {

    public static void main(String[] args) {

        Boolean b = checkString("gmn", new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.length()>5;
            }
        });
        System.out.println(b);

    }

    public static Boolean checkString(String s, Predicate<String> pre){
        return pre.test(s);
    }

}
