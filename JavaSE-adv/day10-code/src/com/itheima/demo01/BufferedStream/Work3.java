package com.itheima.demo01.BufferedStream;

/**
 * @ClassName Work3
 * @Description: TODO
 * @Author true
 * @Date 2020/5/13
 * @Version V1.0
 **/

/**
 * 思路：
 * 1.因为是分数，索引定义的变量为double类型，定义第一个分数的分母j=2，i=1，之后每个分数的分子等于上一个分子加分母的和，分母等于上个分子
 * 2.新的分子分母赋值时需要一个临时变量temp去接收，数列求和也需要一个sum变量取接收，还需要一个cnt变量去控制求和的项数
 */

public class Work3 {

    public static void main(String[] args) {

        Double i = 1.0;
        Double j = 2.0;
        Double temp = 0.0;
        Double sum = 0.0;
        Double cnt = 22.0;
        while(cnt > 0){
            sum += j / i;
            temp = i;
            i = j;
            j += temp;
            cnt--;
        }
        System.out.println(sum);

    }

}
