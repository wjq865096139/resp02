package com.itheima.demo01.File;

import java.io.File;

/**
 * @ClassName Test
 * @Description: TODO
 * @Author true
 * @Date 2020/5/8
 * @Version V1.0
 **/
public class Test {

    public static void main(String[] args) {
        System.out.println(File.pathSeparator);
        System.out.println(File.pathSeparatorChar);
        System.out.println(File.separator);
        System.out.println(File.separatorChar);

        File f = new File("D:\\04-video\\001-Java\\57\\02-Java语进阶\\day08_File类、递归\\video");
        File[] files = f.listFiles();
        for(File file:files){
            System.out.println(file.getName());
        }
    }

}
