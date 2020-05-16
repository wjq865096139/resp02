package com.itheima.demo01.List;

/**
 * @ClassName Outer
 * @Description: TODO
 * @Author true
 * @Date 2020/5/4
 * @Version V1.0
 **/
public class Outer {

    int a = 1;

    public static class Integer{

        int a = 2;

        public static void p(){
            int a = 3;
            System.out.println(new Outer().a);
        }

    }

    class Inner2{

        int a = 4;

        public void p2(){
            int a = 5;
            System.out.println(Outer.this.a);
        }

    }

    public void p3(){
        class Inner3{

            public void p4(){
                System.out.println(4);
            }

        }
        new Inner3().p4();
    }

}
