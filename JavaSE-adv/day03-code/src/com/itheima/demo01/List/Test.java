package com.itheima.demo01.List;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName Test
 * @Description: TODO
 * @Author true
 * @Date 2020/5/4
 * @Version V1.0
 **/
public class Test {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("1");
        System.out.println(list);
        change(list);
        System.out.println(list);

    }

    public static <T> void change(List<T> l){
        l.add((T) "2");
    }

}
