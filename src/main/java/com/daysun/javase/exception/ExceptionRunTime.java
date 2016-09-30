package com.daysun.javase.exception;

/**
 * Created by Administrator on 2016/9/24.
 */
public class ExceptionRunTime {
    public static void main(String[] args) {
        String str=null;

        //运行时异常推荐不进行处理 runtime exception
        System.out.println(str.length()); //NullPointerException 空指针异常
    }
}
