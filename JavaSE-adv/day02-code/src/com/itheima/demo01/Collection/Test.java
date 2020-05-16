package com.itheima.demo01.Collection;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @ClassName Test
 * @Description: TODO
 * @Author true
 * @Date 2020/5/3
 * @Version V1.0
 **/
public class Test {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);

        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }


        Object[] objects = list.toArray();
        for(Object obj:objects){
            System.out.println(obj);
        }
        System.out.println(list.contains(1));
        list.clear();
        System.out.println(list.isEmpty());
    }

}
