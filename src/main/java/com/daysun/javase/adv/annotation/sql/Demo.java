package com.daysun.javase.adv.annotation.sql;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

public class Demo {
    public static void main(String[] args) {
        try {
            Class clazz = Class.forName("com.daysun.javase.adv.annotation.sql.SxtStudent");

            //获得 类 的所有有效注解
            Annotation[] animations = clazz.getAnnotations();
            for (Annotation a: animations) {
                System.out.println(a);
                //@com.daysun.javase.adv.annotation.customize.demo2.SxtTable(value=tb_student)
            }

            //获得 类 指定的注解
            SxtTable st = (SxtTable) clazz.getAnnotation(SxtTable.class);
            System.out.println(st.value()); //tb_student


            //获得 类 的属性的注解
            Field f = clazz.getDeclaredField("studentName");

            SxtField sxtField = f.getAnnotation(SxtField.class);
            System.out.println(sxtField.columnName()+"--"+sxtField.type()+"--"+sxtField.length());  //sname--varchar--10

            //根据获得的表名、字段的信息，拼出DDL语句，然后，使用JDBC执行这个SQL，在数据库中生成相关的表


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
