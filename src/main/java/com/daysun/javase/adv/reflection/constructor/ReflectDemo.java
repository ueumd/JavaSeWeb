package com.daysun.javase.adv.reflection.constructor;

import org.junit.Test;

import java.lang.reflect.Constructor;
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
     * 通过反射获取构造方法并使用。
     * <p>
     * 作业：我要你使用带两个参数的构造，并给name赋值为"林青霞",age赋值为"27"
     *
     */
    @Test
    public void r2() throws ClassNotFoundException, NoSuchMethodException, SecurityException {
       try{
          //以前的作法

           Person p = new Person("林青霞",27);
           System.out.println(p); //林青霞---27---null

           Class c = Class.forName("com.daysun.javase.adv.reflection.Person");

           //获取带参构造
           Constructor con = c.getConstructor(String.class, int.class);

           Object obj = con.newInstance("林青霞",27);
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
}
