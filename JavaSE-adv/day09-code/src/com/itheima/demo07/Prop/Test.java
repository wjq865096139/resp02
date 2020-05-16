package com.itheima.demo07.Prop;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

/**
 * @ClassName Test
 * @Description: TODO
 * @Author true
 * @Date 2020/5/10
 * @Version V1.0
 **/
public class Test {

    public static void main(String[] args) throws IOException {

        Properties pro = new Properties();
        pro.load(new FileReader("D:\\06-workspace\\JavaSE-adv\\day09-code\\prop2.txt"));
        Set<String> strings = pro.stringPropertyNames();
        for(String s : strings){
            System.out.println(s);
            System.out.println(pro.getProperty(s));
        }

    }
}
