package com.daysun.javase.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 *  RetentionPolicy
 *  枚举常量摘要
     CLASS
        编译器将把注释记录在类文件中，但在运行时 VM 不需要保留注释。
     RUNTIME
        编译器将把注释记录在类文件中，在运行时 VM 将保留注释，因此可以反射性地读取。
     SOURCE
        编译器要丢弃的注释。

 */
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnotation {
    String hello() default "shengsiyuan";
    String world();
}
