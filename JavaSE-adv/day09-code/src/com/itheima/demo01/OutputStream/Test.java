package com.itheima.demo01.OutputStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @ClassName Test
 * @Description: TODO
 * @Author true
 * @Date 2020/5/10
 * @Version V1.0
 **/
public class Test {

    public static void main(String[] args) throws IOException {


        int cnt = 0;
        FileInputStream fis = new FileInputStream("C:\\Users\\true\\Desktop\\1.jpg");
        FileOutputStream fos = new FileOutputStream("D:\\1.jpg");
        int i = 0;
        byte[] b = new byte[1024];
        while((i=fis.read(b))!=-1){
            cnt++;
            fos.write(b,0,i);
        }
        System.out.println(cnt);
        /*while((i=fis.read())!=-1){
            cnt++;
            System.out.println(cnt+" "+i);
            fos.write(i);
        }*/
        // 197 163 177 198
        fos.close();
        fis.close();
        new String(b);


    }

}
