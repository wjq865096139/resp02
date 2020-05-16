package com.itheima.demo01.List;

import java.text.ParseException;
import java.util.ArrayList;

/**
 * @ClassName Test2
 * @Description: TODO
 * @Author true
 * @Date 2020/5/4
 * @Version V1.0
 **/
public class Test2 {

    public static void main(String[] args) throws ParseException {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        Integer set = list.set(0, 1);

        System.out.println(set);

    }

}
