package com.itheima.demo04.MyException;

/**
 * @ClassName Person
 * @Description: TODO
 * @Author true
 * @Date 2020/5/5
 * @Version V1.0
 **/
public class Person implements Comparable<Person> {
    int age;

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    String name;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person( int age,String name) {
        this.name = name;
        this.age = age;
    }



    @Override
    public int compareTo(Person o) {
        if(this.age==o.age&&this.name==o.name){
            return 0;
        }else if(this.age>o.age){
            System.out.println("this.age:"+this.age+"o.age:"+o.age);
            return -1;
        }else{
            return 1;
        }
    }
}
