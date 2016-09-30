package com.daysun.javase.collections;

/**
 * Created by Administrator on 2016/9/25.
 */
public class Generic {
    public static void main(String[] args) {
        String str=getData("abc");
        int i=getData(123);

        System.out.println(str+"--------"+i);
    }

    public static  <T> T getData(T o){
        return o;
    }
}
