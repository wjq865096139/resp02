package com.itheima.demo02.Stream;

/**
 * @ClassName Person
 * @Description: TODO
 * @Author true
 * @Date 2020/5/15
 * @Version V1.0
 **/
public class Person {

    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }

    public Person(String name) {
        this.name = name;
    }
}
