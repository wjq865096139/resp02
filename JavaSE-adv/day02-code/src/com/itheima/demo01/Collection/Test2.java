package com.itheima.demo01.Collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @ClassName Test2
 * @Description: TODO
 * @Author true
 * @Date 2020/5/3
 * @Version V1.0
 **/
public class Test2 {

    public static void main(String[] args) {
        /*Person p = new Person();
        p.setName("wjq");
        Object name = p.getName();
        System.out.println(name);
        System.out.println(name instanceof String);

        Person<Integer> p1 = new Person<Integer>();
        p1.setName(666);
        Integer name1 = p1.getName();
        System.out.println(name1);
        System.out.println(name1 instanceof Integer);*/

        ArrayList<String> list = new ArrayList<String>();
        list.add("1");
        list.add("wjq");
        list.add("gmn");
        get(list);

        System.out.println(give(list));

        List<String> list1 = new LinkedList<String>();
        list1.add("b");
        list1.add("a");
        list1.add("2");
        list1.add("b");
        System.out.println(list1.get(2));


    }

    public static <E> void get(ArrayList<E> list){
        System.out.println(list);
    }

    public static <E> ArrayList<E> give(ArrayList<E> list){
        list.remove(0);
        return list;
    }

}
