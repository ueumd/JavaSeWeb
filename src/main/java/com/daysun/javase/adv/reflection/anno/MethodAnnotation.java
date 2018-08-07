package com.daysun.javase.adv.reflection.anno;

import java.lang.annotation.*;

@Documented
@Inherited
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD) //次注解只能作用于方法上
public @interface MethodAnnotation {

    String desc() default "method1";
}
