package com.itheima.demo04.Lambda;

/**
 * @ClassName Test
 * @Description: TODO
 * @Author true
 * @Date 2020/5/8
 * @Version V1.0
 **/
public class Test {

    public static void main(String[] args) {

        /*Person[] p = {new Person("wjq", 26),new Person("gmn",23),new Person(" ",28)};
        Arrays.sort(p, (o1, o2) -> o1.age - o2.age);
        for (Person m : p){
            System.out.println(m);
        }*/

        getMoney(m -> m,10000);


    }

    public static void getMoney(Money money,double m){
        double s = money.saveMoney(m);
        System.out.println(s);
    }

}
