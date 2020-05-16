package com.itheima.demo06.Predicate;

/**
 * @ClassName Test2
 * @Description: TODO
 * @Author true
 * @Date 2020/5/14
 * @Version V1.0
 **/

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
        练习：集合信息筛选
        数组当中有多条“姓名+性别”的信息如下，
        String[] array = { "迪丽热巴,女", "古力娜扎,女", "马尔扎哈,男", "赵丽颖,女" };
        请通过Predicate接口的拼装将符合要求的字符串筛选到集合ArrayList中，
        需要同时满足两个条件：
        1. 必须为女生；
        2. 姓名为4个字。

        分析:
        1.有两个判断条件,所以需要使用两个Predicate接口,对条件进行判断
        2.必须同时满足两个条件,所以可以使用and方法连接两个判断条件
 */

public class Test2 {

    public static void main(String[] args) {
        String[] array = { "迪丽热巴,女", "古力娜扎,女", "马尔扎哈,男", "赵丽颖,女" };
        List<String> list = new ArrayList<String>();
        for(String s : array){
            /*String[] split = s.split(",");
            System.out.println(split[0]+" "+split[1]);*/
            Boolean b = checkPer(s, new Predicate<String>() {
                @Override
                public boolean test(String s) {
                    return s.split(",")[0].length() == 4;
                }
            }, new Predicate<String>() {
                @Override
                public boolean test(String s) {
                    return "女".equals(s.split(",")[1]);
                }
            });
            if (b){
                list.add(s.split(",")[0]);
            }
        }
        System.out.println(list);

    }

    public static Boolean checkPer(String str, Predicate<String> pre1,Predicate<String> pre2){
        return pre1.test(str) && pre2.test(str);
    }

}
