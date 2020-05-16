package com.itheima.demo02.Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @ClassName Test
 * @Description: TODO
 * @Author true
 * @Date 2020/5/3
 * @Version V1.0
 **/
public class Test {

    public static void main(String[] args) throws ParseException {

        long currenttime = System.currentTimeMillis();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
        Date birthday = sdf.parse("1993/12/24");
        long birthtime = birthday.getTime();
        long livetime = currenttime - birthtime;
        System.out.println(livetime/1000/60/60/24/365);

    }

}
