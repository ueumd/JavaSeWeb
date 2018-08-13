package com.daysun.javase.collection;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/*
 * public static <T> List<T> asList(T... a):把数组转成集合。
 * 注意：
 * 		A:这里的数组应该是引用类型。
 * 		B:转换后的集合的长度是固定的。不能做增删操作，但是可以做修改操作。
 */


public class ArraysAsListDemo {

    public static void main(String[] args) {

    }

    @Test
    public void test1(){
        List<String> list = Arrays.asList("hello", "world", "java");

      /*  数组的长度是固定的，不能做增删操作，但是可以做修改操作。
        list.add("aaa");
        list.remove(1);
        */
      list.set(1, "hi");

        for(String s: list) {
            System.out.println(s);
        }
    }
}
