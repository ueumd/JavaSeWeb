package com.daysun.javase.adv.reflection.demo1;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@Documented
@Inherited

public @interface BindPort {
    String value() default "8080";
}
