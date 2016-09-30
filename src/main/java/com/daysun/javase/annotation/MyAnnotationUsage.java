package com.daysun.javase.annotation;

/**
 * 搭配反射机制使用
 */
@MyAnnotation(hello = "beijing",world = "shanghai")
public class MyAnnotationUsage {

    @MyAnnotation(hello="hello method",world = "world method")
    @Deprecated
    @SuppressWarnings("unchecked")
    public void output(){
        System.out.println("output something!");
    }
}
