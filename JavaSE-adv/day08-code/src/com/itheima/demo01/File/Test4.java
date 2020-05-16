package com.itheima.demo01.File;

import java.io.File;
import java.io.FilenameFilter;

/**
 * @ClassName Test4
 * @Description: TODO
 * @Author true
 * @Date 2020/5/8
 * @Version V1.0
 **/
public class Test4 {

    public static void main(String[] args) {

        File f = new File("D:\\04-video\\001-Java\\57\\02-Java语进阶\\day08_File类、递归\\课件资料");
        //p(f);
        File[] files = f.listFiles();
        for(File ff : files){
            System.out.println(ff);
        }

    }

    public static void p(File file){
        if(file.isDirectory()){
            /*File[] files = file.listFiles(new FileFilter() {
                @Override
                public boolean accept(File pathname) {
                    return pathname.isDirectory() || pathname.getName().toLowerCase().endsWith(".java");
                }
            });*/
            File[] files = file.listFiles(new FilenameFilter() {
                @Override
                public boolean accept(File dir, String name) {
                    System.out.println(dir +"---"+ name);
                    return false;
                }
            });
            for(File f : files){
                p(f);
            }
        }else{
            System.out.println(file.getName());
        }
    }

}
