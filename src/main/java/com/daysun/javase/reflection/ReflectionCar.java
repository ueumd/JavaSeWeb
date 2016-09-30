package com.daysun.javase.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 *访问类的私有方法和属性
 */
public class ReflectionCar {
    public static void main(String[] args) throws Exception {
        Car car=new Car();
        Class<?> classType=car.getClass();

/*
        getMethods()：获得类的public类型的方法。
        getDeclaredMethods()：获得类的所有方法。*/
        Method method=classType.getDeclaredMethod("showCar",new Class[]{String.class});
        method.setAccessible(true);//压制Java的访问控制检查 不压制报错
        String value=(String) method.invoke(car,new String[]{"宝马"});
        System.out.println(value);

        Field field=classType.getDeclaredField("color");
        field.setAccessible(true);
        field.set(car,"blue");

        System.out.println(car.getColor());

    }
}
