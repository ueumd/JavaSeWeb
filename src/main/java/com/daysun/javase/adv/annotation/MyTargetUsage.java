package com.daysun.javase.adv.annotation;

/**
 * java doc
 * tools -> generate javadoc
 */

public class MyTargetUsage {

    //只能写在放法上，不能写在类上
    @MyTarget("hello")
    public void doSomething(){
        System.out.println("hello world");
    }
}
