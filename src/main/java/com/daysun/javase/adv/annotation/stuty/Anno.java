package com.daysun.javase.adv.annotation.stuty;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 *     @Target：表示该注解可以用于什么地方，可能的ElementType参数有：
 *         CONSTRUCTOR：构造器的声明
 *         FIELD：域声明（包括enum实例）
 *         LOCAL_VARIABLE：局部变量声明
 *         METHOD：方法声明
 *         PACKAGE：包声明
 *         PARAMETER：参数声明
 *         TYPE：类、接口（包括注解类型）或enum声明
 *
 *     @Retention：表示需要在什么级别保存该注解信息。可选的RetentionPolicy参数包括：
 *         SOURCE：注解将被编译器丢弃
 *         CLASS：注解在class文件中可用，但会被VM丢弃
 *         RUNTIME：VM将在运行期间保留注解，因此可以通过反射机制读取注解的信息
 *
 *     @Document：将注解包含在Javadoc中
 *
 *     @Inherited：允许子类继承父类中的注解
 */

/**
 * 元注解
 * 语法
 * 默认值
 *      经常使用空字符串 0 作为默认值
 *      也经常用负数，如-1，表示不存在的含义
 */

@Target(value = {ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)

public @interface Anno {
    String value() default "hello";

    StringList list();

    String hello() default "hello default";

    String world() default "world default";
}