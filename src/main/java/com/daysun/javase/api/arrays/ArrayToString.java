package com.daysun.javase.api.arrays;

import java.util.Arrays;

/*
 * Arrays：是针对数组操作的工具类。方法都是静态的。通过类名就可以直接调用。
 *
 * 要掌握的功能：
 * 		A:把数组转成字符串。
 * 			public static String toString(int[] a)
 * 		B:排序。
 * 			public static void sort(int[] a)
 * 		C:查找(二分查找)。
 * 			public static int binarySearch(int[] a,int key)
 */

public class ArrayToString {
    public static void main(String[] args) {
        // 定义一个数组
        int[] arr = { 23, 81, 94, 72, 65 };

        // 需求：把这个数组的元素变成：[23, 81, 94, 72, 65]
        String s = arrayToString(arr);
        System.out.println(s);

        //public static String toString(int[] a)
        String s2 = Arrays.toString(arr);
        System.out.println(s2);

        //排序
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        //二分查找
        //[23, 65, 72, 81, 94]
        //public static int binarySearch(int[] a,int key)
        //需求：我要查72的索引
        //int index = Arrays.binarySearch(arr, 72);
        int index = Arrays.binarySearch(arr, 27);
        System.out.println(index);
    }

    // 把数组转成字符串
    // 把数组转成字符串
    // 很浪费空间 可以考虑stringBuffer
    public static String arrayToString(int[] arr) {
        String s = "";

        s += "[";
        for (int x = 0; x < arr.length; x++) {
            if (x == arr.length - 1) {
                s += arr[x];
            } else {
                s += arr[x] + ", ";
            }
        }
        s += "]";

        return s;
    }
}
