package com.daysun.javase.adv.reflection.demo1;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME) //反射读取注解时 一定是RUNTIME

public @interface BindAddress {
    String value() default "127.0.0.1";
}
