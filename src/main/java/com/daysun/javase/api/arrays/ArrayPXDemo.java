package com.daysun.javase.api.arrays;

import org.junit.Test;

public class ArrayPXDemo {
    public static void main(String[] args) {

    }

    @Test
    public void px(){
        // 定义数组
        int[] arr = { 28, 35, 91, 16, 78 };

        // 写一个功能排序
       // bubbleSort(arr);

        //选择排序
        selectSort(arr);

        // 效果：16,28,35,78,91
        for (int x = 0; x < arr.length; x++) {
            System.out.println(arr[x]);
        }
    }

    // 对int[]进行排序
    // 返回值类型：void
    // 参数列表：需要被排序的数组
    public static void bubbleSort(int[] arr) {
        for (int x = 0; x < arr.length - 1; x++) {
            for (int y = 0; y < arr.length - 1 - x; y++) {
                if (arr[y] > arr[y + 1]) {
                    int temp = arr[y];
                    arr[y] = arr[y + 1];
                    arr[y + 1] = temp;
                }
            }
        }
    }

    //选择排序
    public static void selectSort(int[] arr){
        for(int x=0; x<arr.length-1; x++) {
            for(int y=x+1; y<arr.length; y++) {
                if(arr[y]<arr[x]) {
                    int temp = arr[y];
                    arr[y] = arr[x];
                    arr[x] = temp;
                }
            }
        }
    }
}
