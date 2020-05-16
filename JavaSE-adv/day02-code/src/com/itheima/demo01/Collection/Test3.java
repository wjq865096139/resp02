package com.itheima.demo01.Collection;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @ClassName Test3
 * @Description: TODO
 * @Author true
 * @Date 2020/5/3
 * @Version V1.0
 **/
public class Test3 {

    public static void main(String[] args) {

        final  int i ;
        i = 1;

        ArrayList<String> list1 = new ArrayList<String>();
        ArrayList<String> list2 = new ArrayList<String>();
        ArrayList<String> list3 = new ArrayList<String>();

        list1.add("1");
        list1.add("2");
        list1.add("3");
        list2.add("红桃");
        list2.add("黑桃");
        list2.add("方块");
        list2.add("梅花");
        for(String str1 : list1){
            for (String str2 : list2){
                /*System.out.println(str1+str2);*/
                list3.add(str1+str2);
            }
        }
        Collections.shuffle(list3);
        System.out.println(list3);


    }

}
