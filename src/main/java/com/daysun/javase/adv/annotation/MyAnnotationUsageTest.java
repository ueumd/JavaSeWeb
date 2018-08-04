package com.daysun.javase.adv.annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

/**
 * Created by Administrator on 2016/9/24.
 */
public class MyAnnotationUsageTest {
    public static void main(String[] args) throws Exception {
        MyAnnotationUsage myTest = new MyAnnotationUsage();

        Class<MyAnnotationUsage> c = MyAnnotationUsage.class;
        // Class c = Class.forName("study.com.annotation.MyAnnotationUsage");
        Method method = c.getMethod("output", new Class[]{});

        // 如果指定类型的注释存在于此元素上，则返回 true，否则返回 false。
        if (method.isAnnotationPresent(MyAnnotation.class)) { //RUNTIME
            //调用实例方法
            method.invoke(myTest, new Object[]{});  //output something!


            //获取myTest.output方法上MyAnnotation的注解
            MyAnnotation myAnnotation = method.getAnnotation(MyAnnotation.class);
            String hello = myAnnotation.hello();
            String world = myAnnotation.world();
            System.out.println(hello + " , " + world);//hello method , world method
        }

        Annotation[] annotations = method.getAnnotations();
        for (Annotation annotation : annotations) {
            System.out.println(annotation);
            System.out.println(annotation.annotationType().getName());
           /*
            @study.com.annotation.MyAnnotation(hello=hello method, world=world method)
            study.com.annotation.MyAnnotation
            @java.lang.Deprecated()
            java.lang.Deprecated
            */
        }
    }
}
