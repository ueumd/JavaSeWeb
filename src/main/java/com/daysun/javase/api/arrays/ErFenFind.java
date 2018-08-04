package com.daysun.javase.api.arrays;

/*
 * 数组元素的查找：
 * 		A:普通查找
 * 		B:二分查找(折半查找)
 * 			前提：数组必须是有序的。
 *
 * 		注意：请不要对任意的数组先排序，在查找，这样就改变了原来的元素位置。
 */
public class ErFenFind {
    public static void main(String[] args) {
        // 定义一个数组
        int[] arr = { 23, 91, 87, 63, 54 };

        // 我现在要查找91的索引。
        int index = getIndex(arr, 91);
        System.out.println(index);

        // 重新定义一个数组
        int[] arr2 = { 23, 54, 63, 87, 91 };
        // 新的查找方案：二分查找
        //int index2 = getIndex(arr2, 91);
        int index2 = getIndex2(arr2, 191);
        System.out.println(index2);
    }

    /*
     * 二分查找： 返回值类型： int 参数列表： int[] arr,int value
     */
    public static int getIndex2(int[] arr, int value) {  //91
        int start = 0;
        int end = arr.length - 1; //4
        int mid = (start + end) / 2; //2

        while (arr[mid] != value) {
            if (value > arr[mid]) {
                start = mid + 1; //3,4
            } else if (value < arr[mid]) {
                end = mid - 1;
            }

            //如果找不到，就返回-1。
            if(start > end) {
                return -1;
            }

            mid = (start + end) / 2;  //3,4
        }

        return mid;

    }

    // 普通查找
    public static int getIndex(int[] arr, int value) {
        int index = -1;

        for (int x = 0; x < arr.length; x++) {
            if (arr[x] == value) {
                index = x;
                break;
            }
        }

        return index;
    }
}
