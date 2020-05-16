package com.itheima.demo02.FileUpload;

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
        FileInputStream fis = new FileInputStream("D:\\06-workspace\\JavaSE-adv\\day11-code\\src\\com\\itheima\\demo02\\FileUpload\\data1.txt");//ANSI格式
        for (int i = 0; i < 5; i++) {
            System.out.println(fis.read());
        }

        fis.close();
        System.out.println("------------------");
        fis = new FileInputStream("D:\\06-workspace\\JavaSE-adv\\day11-code\\src\\com\\itheima\\demo02\\FileUpload\\data2.txt");//Unicode格式
        for (int i = 0; i < 5; i++) {
            System.out.println(fis.read());
        }
        fis.close();
    }

}
