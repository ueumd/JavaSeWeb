package com.daysun.javase.adv.annotation.stuty;

import java.lang.reflect.Method;

@Anno(value = "IS AnnoDemo", list= StringList.hello, hello = "beijing", world = "shanghai")
class AnnoDemo {

    @Anno(value = "IS output", list= StringList.world, hello = "Method hello", world = "method world")
    public void output() {
        System.out.println("output something!");
    }
}

public class AnnoTest {
    public static void main(String[] args) {
        try {
            AnnoDemo demo = new AnnoDemo();

            // Class c = Class.forName("com.daysun.javase.adv.annotation.stuty.AnnoDemo");
            Class<AnnoDemo> c = AnnoDemo.class;

            Method method = c.getMethod("output", new Class[]{});

            // 如果指定类型的注释存在于此元素上，则返回 true，否则返回 false。
            if (method.isAnnotationPresent(Anno.class)) { //RUNTIME

                //调用实例方法
                method.invoke(demo, new Object[]{});  //output something!

                //获取myTest.output方法上MyAnnotation的注解
                Anno anno = method.getAnnotation(Anno.class);

                String hello = anno.hello();
                String world = anno.world();

                System.out.println(hello + " , " + world); //Method hello , method world
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}