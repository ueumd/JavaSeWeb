package com.daysun.javase.collection.map;

import java.util.LinkedHashMap;
import java.util.Set;

/*
 * LinkedHashMap:
 * 		键的数据结构是链表和哈希表。
 * 		键有序，唯一。
 */
public class LinkedHashMapDemo {
    public static void main(String[] args) {
        // 创建集合对象
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<String, String>();

        // 创建并添加元素
        linkedHashMap.put("javase", "刘意");
        linkedHashMap.put("android", "刘晓曲");
        linkedHashMap.put("javaee", "朴钱1");
        linkedHashMap.put("javaee", "朴钱2");



        // 遍历
        Set<String> set = linkedHashMap.keySet();

        for (String key : set) {
            String value = linkedHashMap.get(key);
            System.out.println(key + "---" + value);
        }
        /*
        javase---刘意
        android---刘晓曲
        javaee---朴钱2
         */
    }
}
