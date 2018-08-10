package com.daysun.javase.collection;


import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * 面试题：Collection和Collections的区别?
 * Collection是单列集合的顶层接口。
 * Collections是针对集合进行操作的工具类。
 *
 * Collections中要掌握的功能：
 * 		public static <T> void sort(List<T> list):排序
 * 		public static <T> int binarySearch(List<T> list,T key):二分查找
 * 		public static <T> T max(Collection<T> coll):最大值
 * 		public static void reverse(List<?> list):反转
 * 		public static void shuffle(List<?> list):随机置换
 *
 * 		在多线程环境中有用。
 */
public class CollectionsDemo {
    public static void main(String[] args) {
        // 创建集合并添加元素
        ArrayList<Integer> array = new ArrayList<Integer>();
        array.add(19);
        array.add(22);
        array.add(21);
        array.add(20);
        array.add(18);
        System.out.println("原始集合：" + array);

        // public static <T> void sort(List<T> list):排序
        Collections.sort(array);
        System.out.println("排序后的集合：" + array);
        // [18, 19, 20, 21, 22]

        // public static <T> int binarySearch(List<T> list,T key):二分查找
        int index = Collections.binarySearch(array, 20);
        System.out.println("20的索引是：" + index);

        // public static <T> T max(Collection<T> coll):最大值
        Integer i = Collections.max(array);
        System.out.println("最大值是：" + i);

        // public static void reverse(List<?> list):反转
        Collections.reverse(array);
        System.out.println("反转后的集合：" + array);

        // public static void shuffle(List<?> list):随机置换
        Collections.shuffle(array);
        System.out.println("随机置换后的集合：" + array);

        // 如何创建一个线程安全的集合
        // ArrayList<String> arr = new ArrayList<String>();
        // public static <T> List<T> synchronizedList(List<T> list)
        // List<String> list = Collections.synchronizedList(arr);

        // 另外方式
        List<String> list = Collections.synchronizedList(new ArrayList<String>());
    }


    /*
     * 模拟洗牌。
     *
     * 牌：54张。
     *
     * 思路：
     * 		A:买牌
     * 		B:洗牌
     * 		C:发牌
     */
    @Test
    public void test1(){
        // 买牌
        ArrayList<String> array = new ArrayList<String>();

        /*
         * 牌色：黑桃，红桃，梅花，方块 点数：A,2,3,4,5,6,7,8,9,10,J,Q,K
         */
        // 定义牌色
        String[] colors = { "黑桃", "红桃", "梅花", "方块" };
        // 定义点数
        String[] numbers = { "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K" };

        for (String color : colors) {
            for (String number : numbers) {
                array.add(color.concat(number));
            }
        }
        array.add("大王");
        array.add("小王");

        // System.out.println("array:" + array);

        // 洗牌
        Collections.shuffle(array);
        // System.out.println("array:" + array);

        // 发牌
        ArrayList<String> liuBeiArray = new ArrayList<String>();
        ArrayList<String> caoCaoArray = new ArrayList<String>();
        ArrayList<String> sunQuanArray = new ArrayList<String>();

        for (int x = 0; x < array.size() - 3; x++) {
            if (x % 3 == 0) {
                liuBeiArray.add(array.get(x));
            } else if (x % 3 == 1) {
                caoCaoArray.add(array.get(x));
            } else if (x % 3 == 2) {
                sunQuanArray.add(array.get(x));
            }
        }

        // 看牌
        Collections.sort(liuBeiArray);
        System.out.println("liuBeiArray:" + liuBeiArray);
        System.out.println("caoCaoArray:" + caoCaoArray);
        System.out.println("sunQuanArray:" + sunQuanArray);

        // 底牌
        for (int x = array.size() - 3; x < array.size(); x++) {
            System.out.print(array.get(x) + "  ");
        }
    }
}
