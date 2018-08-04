package com.daysun.javase.oopObject;

/*
 * 直接输出对象的名称，其实是调用了对象的toString()方法。
 * 任何对象输出，默认调用的都是该对象的toString()方法。
 *
 * 当我们使用了一个方法，而这个类本身并没有定义这个方法，我们就想到了这个方法来自于父类。
 * 任何类没有写父类的时候，其实都默认继承自Object类。
 *
 * Object:是所有类的超类。所有类都直接或者间接继承自该类。
 *
 * 要讲解的功能：
 * 		public String toString():返回该对象的字符串表示。
 * 		public boolean equals(Object obj):指示其他某个对象是否与此对象“相等”。
 *
 * 		protected void finalize():用于垃圾回收。
 * 		public final Class<?> getClass():返回此 Object 的运行时类。Class 类的实例表示正在运行的 Java 应用程序中的类和接口。是字节码文件对象。
 * 		public int hashCode():返回该对象的哈希码值。这个值是一个逻辑值。不是对象的真实地址值。
 *
 * public String toString():返回该对象的字符串表示。
 * 		组成：全路径类名+@+哈希值的十六进制表示形式
 * 			getClass().getName() + '@' + Integer.toHexString(hashCode())
 * 		这种组合方式对我们来说，是没有意义的。所以，一般我们重写该方法。
 *
 * public boolean equals(Object obj):指示其他某个对象是否与此对象“相等”。
 * 		默认情况下，比较的是两个对象的地址值。
 * 		一般来说，比较对象的地址值是没有意义的。所以我们重写该方法。
 * 		怎么重写该方法有意义呢?比较两个对象的值是否都相同就有意义了。
 * 		一般重写equals比较的是对象的内容是否相同。
 *
 *
 * ==可以比较什么?equals可以比较什么?
 * ==:
 * 		比较基本类型，比较的是基本类型的值是否相同。
 * 		比较引用类型，比较的是引用类型的地址值是否相同。
 * equals：
 * 		只能比较引用类型。默认比较的是地址值。
 * 		如果你想比较内容，那么，请你自己重写equals()方法。
 */
public class StudentTest {
    public static void main(String[] args) {
        // 创建对象
        Student s = new Student("林青霞",27);
        System.out.println(s);              // com.daysun.javase.oopObject.Student@6ff3c5b5
        System.out.println(s.toString());   // com.daysun.javase.oopObject.Student@6ff3c5b5

        System.out.println("-------------------");

        //Student s1 = new Student();
        //Student s2 = new Student();
        //Student s3 = s1;
        //System.out.println(s1.equals(s2)); //false
        //System.out.println(s1.equals(s3)); //true

        System.out.println("-------------------");

        Student s4 = new Student("张曼玉",21);
        Student s5 = new Student("张曼玉",21);


        System.out.println(s4);  //com.daysun.javase.oopObject.Student@3764951d
        System.out.println(s5);  // com.daysun.javase.oopObject.Student@4b1210ee

        System.out.println(s4.equals(s5)); //不同的对象 所以false 对象和值一样，所以需要重写equals

        Student s6 = s4;
        System.out.println(s4.equals(s6));
        System.out.println(s6.equals(s6));

        Demo d = new Demo();
        System.out.println(s6.equals(d));
    }
}

class Demo { }