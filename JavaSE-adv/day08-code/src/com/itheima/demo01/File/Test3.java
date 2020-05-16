package com.itheima.demo01.File;

import java.io.File;

/**
 * @ClassName Test3
 * @Description: TODO
 * @Author true
 * @Date 2020/5/8
 * @Version V1.0
 **/
public class Test3 {

    static int count = 0;

    public static void main(String[] args) {
        File f = new File("D:\\04-video\\001-Java\\57\\02-Java语进阶\\day08_File类、递归");
        System.out.println(f.exists());
        p(f);
        System.out.println(count);
    }

    public static  void p(File file){
        if(file.isDirectory()){
            File[] files = file.listFiles();
            for (File f : files){
                p(f);
            }
        }else{
            count++;
            if(file.getName().toLowerCase().endsWith(".java"))
            System.out.println(file.getName());
        }

    }


}
