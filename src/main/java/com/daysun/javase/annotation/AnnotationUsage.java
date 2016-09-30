package com.daysun.javase.annotation;

/**
 * Created by Administrator on 2016/9/24.
 */
@AnnotationTest(value = "hello",value2 = EnumTest.hello)
public class AnnotationUsage {

    @AnnotationTest(value = "method",value2 = EnumTest.welcome)
    public void method(){
        System.out.println("usage of annotation");
    }

    public static void main(String[] args) {
        AnnotationUsage usage=new AnnotationUsage();
        usage.method();
    }
}
