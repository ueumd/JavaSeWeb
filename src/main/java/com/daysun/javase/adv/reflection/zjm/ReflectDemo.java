package com.daysun.javase.adv.reflection.zjm;
/*
 * 反射：通过class文件，去使用构造方法，成员变量，成员方法。
 *
 * 如果我们想通过反射解剖一个类，我们首先应该做到的事情就是获取该class文件对应的对象。字节码文件对象。
 * 既然是一个对象，那么，该对象应该有对应的类。是谁呢? Class类。
 *
 * 如何获取字节码文件对象?
 * A:根据Object类的getClass()方法。
 * B:数据类型的静态class属性。
 * C:通过Class类的静态方法forName()
 *
 * 自己写程序玩，这三种可以任选其一。
 * 但是，开发中，用的是第三种。
 * 原因是?第三种方式可以运行配置文件中配置的内容。
 */

import com.daysun.javase.adv.reflection.Person;

public class ReflectDemo {
    public static void main(String[] args) {
       try{
           // 方式1
           Person p1 = new Person();
           Class c1 = p1.getClass();

           Person p2 = new Person();
           Class c2 = p2.getClass();

           System.out.println(p1 == p2);    // false
           System.out.println(c1 == c2);    // true

           System.out.println(p1);  // null---0---null
           System.out.println(p2);  // null---0---null

           System.out.println(c1);  //class com.daysun.javase.adv.reflection.zjm.Person
           System.out.println(c2);  //class com.daysun.javase.adv.reflection.zjm.Person

           System.out.println("----------------------");

           // 方式2
           Class c3 = Person.class;
           System.out.println(c1 == c3);    // true

           // 方式3
           Class c4 = Class.forName("com.daysun.javase.adv.reflection.Person");
           System.out.println(c1 == c4);    // true

       } catch (Exception e) {
            e.printStackTrace();
       }
    }
}
