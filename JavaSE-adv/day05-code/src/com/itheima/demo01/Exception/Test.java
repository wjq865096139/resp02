package com.itheima.demo01.Exception;

/**
 * @ClassName Test
 * @Description: TODO
 * @Author true
 * @Date 2020/5/5
 * @Version V1.0
 **/
public class Test {

    public static void main(String[] args) {

        int a = get();
        if(a==0){
            System.out.println("java.lang.ArithmeticException: / by zero");
        }else {
            System.out.println(a);
        }

    }

    public static int get()  {
        int i;
        try{
            i = 1 / 0;
        }catch (ArithmeticException e){
            return 0;
        }



        return i;

    }

}
