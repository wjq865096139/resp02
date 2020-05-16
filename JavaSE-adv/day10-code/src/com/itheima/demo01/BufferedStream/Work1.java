package com.itheima.demo01.BufferedStream;

/**
 * @ClassName Dichotomy
 * @Description: TODO
 * @Author true
 * @Date 2020/5/13
 * @Version V1.0
 **/

/**
 * 思路：
 * 1.定义个目标值target
 * 2.设置起始索引为start，结束索引为end，起始索引要小于等于结束索引
 * 3.每次查询取（start+end）/2 中间索引为middle
 * 4.当中间索引对应的值大于目标值时，说明目标值在左边，将中间索引赋值给结束索引，让查询范围缩小到左半边；
 *   当中间索引对应的值小于目标值时，说明目标值在右边，将中间索引赋值给开始索引，让查询范围缩小到右半边；
 *   当中间索引对应的值等于目标值时，说明这个中间所有就是目标值的索引
 */

public class Work1 {

    public static void main(String[] args) {

        int target = 6;
        int[] arr = {5,6,7,8,9,10};
        int start = 0;
        int end = arr.length;
        while(start <= end){
            int middle = (start + end)/2;
            if(target < arr[middle]){
                end = middle;
            }else if(target > arr[middle]){
                start = middle;
            }else{
                System.out.println(arr[middle]+"的索引为："+middle);
                break;
            }
        }

    }

}
