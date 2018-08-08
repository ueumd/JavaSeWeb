package com.daysun.javase.collections.set;

import java.util.LinkedHashSet;

/*
 * LinkedHashSet:是HashSet的子类。
 * 底层数据结构是哈希表和链表两种。特点是：有序，唯一。
 *
 * 链表保证有序，哈希保证唯一
 */
public class LinkedHashSetDemo {
    public static void main(String[] args) {
        // 创建集合对象
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<String>();

        // 创建并添加元素
        linkedHashSet.add("hello");
        linkedHashSet.add("world");
        linkedHashSet.add("java");
        linkedHashSet.add("java");

        // 遍历集合
        for (String s : linkedHashSet) {
            System.out.print(s); //hello world java
        }


    }
}
