package com.itheima.demo01.Collection;

/**
 * @ClassName Person
 * @Description: TODO
 * @Author true
 * @Date 2020/5/3
 * @Version V1.0
 **/
public class Person<E> {

    E name;

    public E getName() {
        return name;
    }

    public void setName(E name) {
        this.name = name;
    }
}
