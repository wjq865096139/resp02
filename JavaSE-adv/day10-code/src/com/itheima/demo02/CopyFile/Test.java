package com.itheima.demo02.CopyFile;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @ClassName Test
 * @Description: TODO
 * @Author true
 * @Date 2020/5/10
 * @Version V1.0
 **/
public class Test {

    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"aaa");
        map.put(3,"ccc");
        map.put(2,"bbb");
        Set<Map.Entry<Integer, String>> entries = map.entrySet();
        Iterator<Map.Entry<Integer, String>> iterator = entries.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

}
