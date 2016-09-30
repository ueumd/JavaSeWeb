package com.daysun.javase.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/**
 * METHOD 注解只允许放在放法上
 */
@Target(ElementType.METHOD)
public @interface MyTarget {
    String value();
}
