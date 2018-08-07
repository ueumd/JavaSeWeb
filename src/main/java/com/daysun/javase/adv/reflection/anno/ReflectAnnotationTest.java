package com.daysun.javase.adv.reflection.anno;


import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

@FieldTypeAnnotation(type = "class", hobby = {"hahaha..."})
public class ReflectAnnotationTest {

    @FieldTypeAnnotation(hobby = {"sleep", "play"})
    private String xiaoming;

    @FieldTypeAnnotation(hobby = {"phone", "buy"}, age = 27, type = "normal")
    private String zs;

    @MethodAnnotation()
    public void m1() {
    }

    @MethodAnnotation(desc = "m2")
    public void m2() {
    }

    public static void main(String[] args) {

        // 获取字节码
        Class clz = ReflectAnnotationTest.class;

        // 判断类上是否有次注解
        boolean clzHasAnno = clz.isAnnotationPresent(FieldTypeAnnotation.class);

        if(clzHasAnno) {
            // 获取类上的注解
            FieldTypeAnnotation annotation =(FieldTypeAnnotation) clz.getAnnotation(FieldTypeAnnotation.class);

          //  System.out.println(annotation);
            // 输出注解上的属性

            int age = annotation.age();
            String[] hobby = annotation.hobby();
            String type = annotation.type();

            System.out.println(clz.getName());
            System.out.println("age =" + age + ", hobby = " + Arrays.asList(hobby).toString()+ " type = "+ type);
           //com.daysun.javase.adv.reflection.anno.ReflectAnnotationTest
           //age =20, hobby = [hahaha...] type = class
        }

        System.out.println("--------------------------------------------\n");

        // 解析字段上是否有注解
        // ps：getDeclaredFields会返回类所有声明的字段，包括private、protected、public，但是不包括父类的
        // getFields:则会返回包括父类的所有的public字段，和getMethods()一样

        Field[] fields = clz.getDeclaredFields();

        for (Field field : fields) {
            boolean fieldHasAnno = field.isAnnotationPresent(FieldTypeAnnotation.class);
            if(fieldHasAnno) {
                FieldTypeAnnotation fieldAnno  = (FieldTypeAnnotation) field.getAnnotation(FieldTypeAnnotation.class);
                int age = fieldAnno .age();
                String[] hobby = fieldAnno.hobby();
                String type = fieldAnno .type();
                System.out.println(field.getName()+ " age =" + age + ", hobby = " + Arrays.asList(hobby).toString()+ " type = "+ type);

                //xiaoming age =20, hobby = [sleep, play] type = ignore
                //zs age =27, hobby = [phone, buy] type = normal
            }
        }

        System.out.println("--------------------------------------------\n");

        Method[] methods = clz.getDeclaredMethods();
        for(Method method : methods) {
            boolean metodHasAnno = method.isAnnotationPresent(MethodAnnotation.class);
            if(metodHasAnno) {
                //得到注解
                MethodAnnotation methodAnnotation = (MethodAnnotation) method.getAnnotation(MethodAnnotation.class);
                //输出注解属性
                String desc = methodAnnotation.desc();
                System.out.println(method.getName() + " desc = " + desc);

//                m2 desc = m2
//                m1 desc = method1

            }
        }
    }

}
