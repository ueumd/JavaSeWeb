package com.daysun.javase.collections.map;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2016/9/25.
 */
public class HashMapTest {
    public static void main(String[] args) {
        Map<String,String> map=new HashMap<String,String>();

        map.put("name","zs");
        map.put("age","20");

        System.out.println(map.put("city","beijing")); //返回null

        System.out.println(map.get("age"));
        System.out.println(map);

    }
}
