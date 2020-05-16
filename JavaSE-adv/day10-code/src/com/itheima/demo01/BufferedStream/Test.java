package com.itheima.demo01.BufferedStream;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * @ClassName Test
 * @Description: TODO
 * @Author true
 * @Date 2020/5/12
 * @Version V1.0
 **/
public class Test {

    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("D:\\06-workspace\\JavaSE-adv\\day10-code\\a.txt");
        int r = 0 ;
        byte[] b = new byte[5];
        int read = fis.read(b);
        System.out.println(read);
        while ((r=fis.read(b))!=-1){
            System.out.println(r);
        }
        System.out.println(111);
    }

}
