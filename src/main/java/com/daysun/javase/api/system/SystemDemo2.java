package com.daysun.javase.api.system;

import java.util.Arrays;

public class SystemDemo2 {
    public static void main(String[] args) {
        // public static void arraycopy(Object src,int srcPos, Object dest,int destPos,int length)
        // 从指定源数组中复制一个数组，复制从指定的位置开始，到目标数组的指定位置结束。
            // src - 源数组。
            // srcPos - 源数组中的起始位置。
            // dest - 目标数组。
            // destPos - 目标数据中的起始位置。
            // length - 要复制的数组元素的数量。
        int[] arr = { 1, 2, 3, 4, 5 };
        int[] arr2 = { 6, 7, 8, 9, 10 };

        // 全部复制
         System.arraycopy(arr, 0, arr2, 2, 3);

        // 部分负责
        // ArrayIndexOutOfBoundsException
        // System.arraycopy(arr, 0, arr2, 2, 5);
        // ArrayIndexOutOfBoundsException
       // System.arraycopy(arr, 2, arr2, 0, 5); //数组的长度固定了


        System.out.println("arr:" + Arrays.toString(arr));
        System.out.println("arr2:" + Arrays.toString(arr2));
    }
}