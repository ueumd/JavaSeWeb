package com.daysun.javase.adv.annotation.jdk;

interface Person {
    public String name();
    public int age();


    @Deprecated   // 弃用
    public void sing();
}

class Child implements Person {

    @Override
    public String name() {
        return null;
    }

    @Override
    public int age() {
        return 0;
    }

    @Override
    public void sing() {

    }
}

public class JdkDemo {

    public static void main(String[] args) {
        sing();
    }

    @SuppressWarnings("deprecation") //忽略警告
    public static void sing(){
        Person p = new Child();
        p.sing();    //有删除线警告，方法已经过时了
    }
}
