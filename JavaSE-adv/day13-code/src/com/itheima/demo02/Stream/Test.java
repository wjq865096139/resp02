package com.itheima.demo02.Stream;

import java.util.ArrayList;
import java.util.stream.Stream;

/**
 * @ClassName Test
 * @Description: TODO
 * @Author true
 * @Date 2020/5/15
 * @Version V1.0
 **/
public class Test {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        ArrayList<Person> list1 = new ArrayList<>();
        list.add("吴锦情");
        list.add("甘梦娜");
        list.add("想当年");
        list.add("wq");
        list.add("迪丽热巴");
        list.add("许丹妮");
        Stream<String> s1 = list.stream().filter((s) -> s.length() == 3);
        Stream<String> s2 = list.stream().filter((s) -> s.length() > 3);
        Stream<String> s3 = s1.skip(2);
        Stream<String> s4 = Stream.concat(s2, s3);
        //s4.forEach(name -> System.out.println(name));
        //s4.forEach((s) -> list1.add(new Person(s)));
        s4.map(name -> new Person(name)).forEach(p -> System.out.println(p));
    }

}
