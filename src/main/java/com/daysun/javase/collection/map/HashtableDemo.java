package com.daysun.javase.collection.map;

import java.util.Hashtable;

/*
 * 如果你要写一个JDK提供了的类名的名称，那么在使用JDK的类时候，你需要加入包作为前缀。
 * java.util.Hashtable<String, String> hm = new java.util.Hashtable<String, String>();
 * 一般不建议这样使用。
 *
 * 面试题：HashMap和Hashtable的区别?
 * A:HshMap是线程不安全的，效率高。可以允许null键和值。
 *
 * B:Hashtable是线程安全的，效率低。不可以允许null键和值。
 */
public class HashtableDemo {
    public static void main(String[] args) {
        // HashMap<String, String> hm = new HashMap<String, String>();
        // hm.put("it001", null);
        // hm.put(null, "hello");
        // System.out.println(hm);

        Hashtable<String, String> hm = new Hashtable<String, String>();
        // NullPointerException
//		hm.put("it001", null);
        // hm.put(null, "hello");
        System.out.println(hm);
    }
}
