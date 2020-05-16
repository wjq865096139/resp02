package com.itheima.demo01.BufferedStream;

import java.io.*;

/**
 * @ClassName Work22
 * @Description: TODO
 * @Author true
 * @Date 2020/5/13
 * @Version V1.0
 **/

/**
 * 思路：
 * 1.创建一个字节输出流bos供线程A想目标文件中写入数据，再创建一个字节输入流bis供线程B读取目标文件中的数据
 * 2.线程A在写入数据前先判断目标文件中是否有数据，有就使A线程处于无序等待状态
 * 3.当线程A处于无线等待状态时，线程B开始读取目标文件中的数据，将flag标记为flase，表示已经读取了目标文件中的数据，之后唤醒线程A
 * 4.线程A被唤醒，让后往目标文件中写入数据，之后将flag标记为true，表示有新数据写入
 * 5.使用while(true),可以让两个线程无线循环交互，流对象不能关闭，一旦关闭将无法进行写入和读取
 */
public class Work2 {

    public static Boolean flag = false;
    public static int cnt = 0;
    public static void main(String[] args) throws FileNotFoundException {

        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("D:\\06-workspace\\JavaSE-adv\\day10-code\\a.txt"));
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("D:\\06-workspace\\JavaSE-adv\\day10-code\\a.txt"));

        new Thread(){
            @Override
            public void run() {
                while (true){
                    synchronized (bos){
                        if(flag){
                            try {
                                bos.wait();
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                        try {
                            outputDate(bos);
                            flag = true;
                        } catch (IOException e) {
                            e.printStackTrace();
                        } finally {
                            bos.notify();
                        }
                    }
                }
            }
        }.start();

        new Thread(){
            @Override
            public void run() {
                while (true){
                    synchronized (bos){
                        if(flag){
                            try {
                                inputDate(bis);
                                flag = false;
                            } catch (IOException e) {
                                e.printStackTrace();
                            }finally {
                                bos.notify();
                            }
                        }
                    }
                }
            }
        }.start();


    }

    public static void outputDate(BufferedOutputStream bos) throws IOException {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("写入数据");
        if(cnt % 2 == 0){
            bos.write("你好".getBytes());
        }else{
            bos.write("Hello".getBytes());
        }
        cnt++;
        bos.flush();
        //bos.close();
    }

    public static void inputDate(BufferedInputStream bis) throws IOException {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        int len = 0;
        byte[] bytes = new byte[10];
        while ((len = bis.read(bytes)) != -1){
            System.out.println("打印数据： "+ new String(bytes,0,len));
        }
        //bis.close();
    }

}
