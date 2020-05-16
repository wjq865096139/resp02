package com.itheima.demo04.Lambda;

/**
 * @ClassName DriverTest
 * @Description: TODO
 * @Author true
 * @Date 2020/5/7
 * @Version V1.0
 **/
public class DriverTest {

    public static void main(String[] args) {

        //myDriver(() ->{System.out.println("驾车出门了"); });

        myDriver(()-> System.out.println("出门"));


    }

    public  static void myDriver(Driver driver){
        driver.driver();;
    }



}
