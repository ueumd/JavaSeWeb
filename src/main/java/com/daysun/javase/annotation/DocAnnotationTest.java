package com.daysun.javase.annotation;

/**
 * Created by Administrator on 2016/9/24.
 */
public class DocAnnotationTest {
    @DocAnnotation(hello = "welcome")
    public  void  method(){
        System.out.println("hello world");
    }
}
