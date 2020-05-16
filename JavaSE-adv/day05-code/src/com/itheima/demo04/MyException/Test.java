package com.itheima.demo04.MyException;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * @ClassName Test
 * @Description: TODO
 * @Author true
 * @Date 2020/5/5
 * @Version V1.0
 **/
public class Test {

    public static void main(String[] args) {

        ArrayList<Person> list = new ArrayList<>();
        Person p1 = new Person(12,"张三");
        Person p2 = new Person(15,"李四");
        Person p3 = new Person(2,"ala");
        Person p4 = new Person(3,"bb");
        list.add(p1);
        list.add(p2);
        list.add(p3);
        list.add(p4);
        Collections.sort(list, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.age - o2.age;
            }
        });
        System.out.println(list);

    }

}
