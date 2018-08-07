package com.daysun.javase.adv.reflection.constructor;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;

import com.daysun.javase.adv.reflection.Person;

/*
 * 通过反射获取构造方法并使用。
 *
 * 反射最终能够使用，是因为它把构造方法，成员变量，以及成员方法都用对应的类进行了封装。
 * 构造方法：Constructor
 * 成员变量：Field
 * 成员方法：Method
 *
 */
public class ReflectDemo {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException {

    }


    /**
     * getName()：获得类的完整名字。
     * newInstance()：通过类的不带参数的构造方法创建这个类的一个对象。
     */
    @Test
    public void c() {
        try {
            Class c1 = String.class;
            Class c2 = Integer.class;
            Class c3 = void.class;
            System.out.println(c1);  //class java.lang.String
            System.out.println(c2);  //class java.lang.Integer
            System.out.println(c3);  //void

            Person p1 = new Person();

            Class cp1 = p1.getClass();
            Class cp2 = Person.class;
            Class cp3 = Class.forName("com.daysun.javase.adv.reflection.Person");

            System.out.println(cp1); //class com.daysun.javase.adv.reflection.Person
            System.out.println(cp2); //class com.daysun.javase.adv.reflection.Person
            System.out.println(cp3); //class com.daysun.javase.adv.reflection.Person

            //反射构造一个对象
            Constructor<Person> cons = cp3.getConstructor(String.class, int.class);
            Person person = cons.newInstance("小明", 8);
            System.out.println(person); //小明---8---null

        } catch (Exception e) {

        }
    }


    /**
     * 构造方法
     * getConstructors()                            所有公共构造方法
     * getDeclaredConstructors()                    所有构造方法(公有，私有)
     * getConstructor()                             单一构造方法
     * getConstructor(String.class, int.class);     对应的带参构造
     */
    @Test
    public void r1() throws ClassNotFoundException, NoSuchMethodException, SecurityException {

        // 获取字节码文件对象
        Class c = Class.forName("com.daysun.javase.adv.reflection.Person");

        // 所有公共构造方法
        Constructor[] cons = c.getConstructors();
        for (Constructor con : cons) {
            System.out.println(con);
        }

        /*
         public com.daysun.javase.adv.reflection.zjm.Person(java.lang.String,int)
         public com.daysun.javase.adv.reflection.zjm.Person()
         */

        System.out.println("-------------------------------");

        // 所有构造方法(公有，私有)
        Constructor[] allCons = c.getDeclaredConstructors();
        for (Constructor con : allCons) {
            System.out.println(con);
        }
         /*
            public com.daysun.javase.adv.reflection.zjm.Person(java.lang.String,int)
            com.daysun.javase.adv.reflection.zjm.Person(java.lang.String)
            public com.daysun.javase.adv.reflection.zjm.Person()
        */

        System.out.println("-------------------------------");

        //获取单一的构造方法

        //  Constructor con = c.getConstructor(null);
        Constructor con1 = c.getConstructor();
        System.out.println(con1);
        //public com.daysun.javase.adv.reflection.zjm.Person()

        Constructor con = c.getConstructor(String.class, int.class);
        System.out.println(con);
        //public com.daysun.javase.adv.reflection.zjm.Person(java.lang.String,int)
    }


    /**
     * 获取成员变量并使用。
     * getFields()             获取所有公共的成员变量
     * getDeclaredFields ()    获取所有的成员变量
     */
    @Test
    public void r3() {
        try {
            Class c = Class.forName("com.daysun.javase.adv.reflection.Person");

            //获取所有公共的成员变量
            Field[] fields = c.getFields();
            for (Field field : fields) {
                System.out.println(field);
                //public java.lang.String com.daysun.javase.adv.reflection.Person.address
            }

            //获取所有的成员变量
            Field[] AllFields = c.getDeclaredFields();
            for (Field field : AllFields) {
                System.out.println(field);
            }

            //private java.lang.String com.daysun.javase.adv.reflection.Person.name
            //int com.daysun.javase.adv.reflection.Person.age
            //public java.lang.String com.daysun.javase.adv.reflection.Person.address

            //获取指定的成员
            // 获取字节码文件对象
            Constructor<Person> con = c.getConstructor();
            Person xm = con.newInstance();

            Field addressField = c.getField("address");
            addressField.set(xm, "上海");


            Field nameField = c.getDeclaredField("name");
            nameField.setAccessible(true);
            nameField.set(xm, "小明");


            Field ageField = c.getDeclaredField("age");
            ageField.setAccessible(true);
            ageField.set(xm, 8);

            System.out.println(xm); // 小明---8---上海

        } catch (Exception e) {

        }
    }

    /**
     * 获取成员方法
     */
    @Test
    public void r4() {
        try {
            // 获取字节码文件对象
            Class c = Person.class;

            // 创建对象
            Constructor<Person> con = c.getConstructor();
            Person person = con.newInstance();

            // 获取方法
            // Method[] methods = c.getMethods();        // 获取本类及其父类的所有公共方法
            Method[] methods = c.getDeclaredMethods();   // 获取本类的所有方法
            for (Method m : methods) {
                System.out.println(m);
            }

            // 获取单独的方法
            // 无返回值无参数
            Method m = c.getMethod("show");
            //invoke 调用此Method对象表示的底层方法
            m.invoke(person); //show

            //带参数无返回值
            Method m2 = c.getMethod("print", String.class); //后面是参数
            m2.invoke(person, "hello");
            System.out.println("---------------------------");

            //带参数带返回值
            Method m3 = c.getMethod("method", String.class, int.class);
            Object o = m3.invoke(person, "world", 20);
            System.out.println(o);
            System.out.println("---------------------------");

            //私有方法
            Method m4 = c.getDeclaredMethod("function");
            m4.setAccessible(true);
            m4.invoke(person);

        } catch (Exception e) {

        }
    }

    /**
     * 通过反射获取构造方法并使用。
     * <p>
     * 作业：我要你使用带两个参数的构造，并给name赋值为"林青霞",age赋值为"27"
     */
    @Test
    public void r2() throws ClassNotFoundException, NoSuchMethodException, SecurityException {
        try {
            //以前的作法

            Person p = new Person("林青霞", 27);
            System.out.println(p); //林青霞---27---null

            Class c = Class.forName("com.daysun.javase.adv.reflection.Person");

            //获取带参构造
            Constructor con = c.getConstructor(String.class, int.class);

            Object obj = con.newInstance("林青霞", 27);
            System.out.println(obj); //林青霞---27---null

            // 私有的带参造
            Constructor con2 = c.getDeclaredConstructor(String.class);

            // 暴力访问, 不加就会异常，访问权限问题private
            // 值为 true 则指示反射的对象在使用时应该取消 Java 语言访问检查。
            con2.setAccessible(true);

            obj = con2.newInstance("林青霞");
            System.out.println(obj); //林青霞---0---null


        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 需求：请把这样的集合中添加几个字符串。
     * ArrayList<Integer> array = new ArrayList<Integer>();
     * <p>
     * 反射可以越过泛型检查。
     */

    @Test
    public void r5() {
        try {
            ArrayList<Integer> array = new ArrayList<Integer>();

            // array.add("hello"); 字符串类型

            // 获取ArrayList的字节码文件对
            Class c = array.getClass();

            Method m = c.getMethod("add", Object.class); //参数Object类型
            m.invoke(array, "hello");
            m.invoke(array, "world");
            m.invoke(array, "jaava");

            System.out.println(array); //[hello, world, jaava]


        } catch (Exception e) {
        }
    }
}
