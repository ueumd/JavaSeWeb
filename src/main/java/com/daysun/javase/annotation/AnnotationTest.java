package com.daysun.javase.annotation;

/**
 * @Overide 表示子类要重写父类对应的方法
 * @Deprecated 表示方法建议被使用的方法
 * @SuppressWarning 注解表示抑制警告
 *
 * @interface 表示定义注解
 *
 * 自定义注解属性名value时可以直接使用
 * AnnotationTest("hello")
 * 反之
 * AnnotationTest(value1="hello")
 */
public @interface AnnotationTest {

    //String value() default "hello"
    String[] value1() default  "hello";
    String value();

    EnumTest value2();

}

enum EnumTest{
    hello,world,welcome;
}