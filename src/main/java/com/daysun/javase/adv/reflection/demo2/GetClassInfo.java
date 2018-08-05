package com.daysun.javase.adv.reflection.demo2;

import javax.swing.*;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 *  Java反射的作用
 *  http://blog.csdn.net/ritterliu/article/details/7764849
 *
 *
 getName()：获得类的完整名字。
 newInstance()：通过类的不带参数的构造方法创建这个类的一个对象。

 getFields()：获得类的public类型的属性。
 getDeclaredFields()：获得类的所有属性。

 getMethods()：获得类的public类型的方法。
 getDeclaredMethods()：获得类的所有方法。
 getMethod(String name, Class[] parameterTypes)：获得类的特定方法。

 getModifiers()和Modifier.toString()：获得属修饰符，例如private，public，static等
 getReturnType()：获得方法的返回类型
 getParameterTypes()：获得方法的参数类型

 getConstructors()：获得类的public类型的构造方法。
 getConstructor(Class[] parameterTypes)：获得类的特定构造方法。

 getSuperclass()：获取某类的父类
 getInterfaces()：获取某类实现的接口
 *
 */
public class GetClassInfo {
    public GetClassInfo(){
        String classInfo= JOptionPane.showInputDialog(null,"输入类路径");
        try {
            Class cla=Class.forName(classInfo);


            System.out.println("===================="+cla.getName()+" 的方法============================");

            Method[] methods=cla.getDeclaredMethods();
            for(Method me:methods){
                System.out.println(me.toString());
            }

            System.out.println("===================="+cla.getName()+" 的属性============================");

            Field[] fields=cla.getDeclaredFields();
            for(Field me:fields){
                System.out.println(me.toString());
            }

        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new GetClassInfo();
    }
}
