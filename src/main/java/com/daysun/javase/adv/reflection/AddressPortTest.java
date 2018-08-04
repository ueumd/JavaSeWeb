package com.daysun.javase.adv.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/*
 * 参考文档
 * 理解Android中的注解与反射
 * http://www.jianshu.com/p/d4978bbce12a#
 */
public class AddressPortTest {
    public static void main(String[] args) throws Exception {
        Class classType=AddressPort.class;

        AddressPort addressPort=(AddressPort)classType.newInstance();

        Field[] fields=classType.getDeclaredFields();

        for(Field field:fields){
            if(field.isAnnotationPresent(BindPort.class)){
                BindPort bindPort=field.getAnnotation(BindPort.class);
                field.setAccessible(true);//成员类型为private
                field.set(addressPort,bindPort.value());
            }

            if(field.isAnnotationPresent(BindAddress.class)){
                BindAddress bindAddress=field.getAnnotation(BindAddress.class);
                field.setAccessible(true);
                field.set(addressPort,bindAddress.value());
            }
        }

        addressPort.info();


        Method[] methods=classType.getDeclaredMethods();
        for(Method method:methods){
            if(method.isAnnotationPresent(BindGet.class))//如果指定类型的注释存在于此元素上，则返回 true，否则返回 false。
            {
                BindGet bindGet=method.getAnnotation(BindGet.class);//  如果存在该元素的指定类型的注释，则返回这些注释，否则返回 null。
                String param=bindGet.value();
                method.invoke(addressPort,param);//反射调用方法
            }
        }
    }
}
