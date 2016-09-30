package com.daysun.javase.javabase;

/**
 * Created by Administrator on 2016/9/24.
 */
public class StaticMethod {
    public static void main(String[] args) {
        Study s=new Study();
        s.test();
        Study.test();
        System.out.println(Study.version);
    }
}

class Study{
    public  static  double version=1.0;

    static void test(){
        System.out.println("I am a static method");
    }
}
