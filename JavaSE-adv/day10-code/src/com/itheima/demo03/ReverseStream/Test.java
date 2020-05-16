package com.itheima.demo03.ReverseStream;

import java.io.*;

/**
 * @ClassName Test
 * @Description: TODO
 * @Author true
 * @Date 2020/5/10
 * @Version V1.0
 **/
public class Test {

    public static void main(String[] args) throws IOException {

        gbkToUtf8();

    }

    private static void gbkToUtf8() throws IOException {

        InputStreamReader isr = new InputStreamReader(new FileInputStream("day10-code\\我是GBK格式的文本.txt"),"gbk");
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("day10-code\\gbkNew.txt"),"utf-8");
        int len = 0;
        while((len = isr.read())!=-1){
            System.out.println((char)len);
            osw.write(len);
            osw.flush();
        }
        osw.close();
        isr.close();


    }

}
