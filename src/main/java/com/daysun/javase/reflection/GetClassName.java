package com.daysun.javase.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * Created by Administrator on 2016/9/23.
 */
public class GetClassName {
    public static void main(String[] args) throws Exception {

        Class c1 = int.class;//int 的类类型
        Class c2 = String.class;//String类的类类型
        Class c3 = void.class;

        System.out.println(c1.getName()); //int
        System.out.println(c2.getName()); //java.lang.String
        System.out.println(c3.getName()); //void

        //http://blog.csdn.net/struggle_lyh/article/details/7800592

        Person person = new Person(110, "张张张");


        Class classPerson = person.getClass();

        System.out.println(classPerson);  //class study.com.reflection.Person

        Class<Person> testp = Person.class;
        System.out.println("p2: " + testp);//p2: class study.com.reflection.Person


        System.out.println("\n" + "=====================" + classPerson.getName() + "的方法==================");

        Method[] methods = classPerson.getDeclaredMethods();
        for (Method method : methods) {
           /// System.out.println(method.toString());
            System.out.println(method.getName());
        }

        System.out.println("\n" + "=====================" + classPerson.getName() + "的属性成员==================");

        Field[] fields = classPerson.getDeclaredFields();
        for (Field field : fields) {
          //  System.out.println(field.toString());
            String name=field.getName();

            String firstLetter=name.substring(0,1).toUpperCase();//将首字母转为大写

            String getMethodName="get"+firstLetter+name.substring(1);
            String setMethodName="set"+firstLetter+name.substring(1);

            System.out.println("name:"+name);/*id  name*/
            System.out.println("type:"+field.getType());
            System.out.println(getMethodName+"----"+setMethodName);

            Method getMethod=classPerson.getMethod(getMethodName,new Class[]{});
            Method setMetod=classPerson.getMethod(setMethodName,new Class[]{field.getType()});

            Object value=getMethod.invoke(person);

            System.out.println("value:"+value); //张张张
        }

        System.out.println("\n" + "=============================================================================");
        //常规手段执行对象方法
        System.out.println(person.toString());

        // 通过反射的方式

        // 第一步，获取Class对象
        // 前面用的方法是：Class.forName()方法获取
        // 这里用第二种方法，类名.class
        Class clazz = Person.class;


        Person p1=null;
        Person p2=null;

        Constructor<Person> cons[] = clazz.getConstructors();
        try{
            p1= cons[0].newInstance();
            p2 =cons[1].newInstance(200, "红色");
        }catch (Exception e){
            e.printStackTrace();
        }

        System.out.println(p1 instanceof Person); // 输出true
        //通过反射调用Person类的showSelf方法

        Method showSelf=clazz.getMethod("showSelf");
        showSelf.invoke(p2); //{id=200, name=红色}

        Method showSelf2=clazz.getMethod("showSelf",int.class);
        showSelf2.invoke(p1,20); //a:20

    }
}
