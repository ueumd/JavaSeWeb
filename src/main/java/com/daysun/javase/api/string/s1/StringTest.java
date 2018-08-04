package com.daysun.javase.api.string.s1;

import org.junit.Test;

/**
 * 面试题：
 * 		1：字符串一旦初始化就不可以被改变
 * 			内容不变，但是引用可变。
 *
 * 		2:String s1 = new String(“abc”);String s2 = “abc”;有区别吗？
 * 			有。
 * 			第一种方式，在内存中有两个对象。第二种方式只有一个对象。
 *
 * 		3:看程序，写结果
 * 			请注意：如果直接赋值，是从常量池里先找，如果有，就用。否则，就造一个。
 * 				String s1 = new String("hello");
 *				String s2 = new String("hello");
 *				System.out.println(s1 == s2); // false
 *				System.out.println(s1.equals(s2)); // true

 *				String s3 = "hello";
 *				String s4 = "hello";
 *				System.out.println(s3 == s4); // true
 *				System.out.println(s3.equals(s4)); // true

 *				String s5 = new String("hello");
 *				String s6 = "hello";
 *				System.out.println(s5 == s6); // false
 *				System.out.println(s5.equals(s6)); // true
 *
 * 		4:看程序，写结果
 * 			如果是变量，直接造。
 * 			如果是常量，先找，有就用。没有就造。
 */
public class StringTest {
    public static void main(String[] args) {

        /**
         * （1）equals：比较两个String对象的值是否相等
         * （2）= =：比较两个String对象的指向的内存地址是否相等。
         */
    }

    /**
     *  1：字符串一旦初始化就不可以被改变
     *    内容不变，但是引用可变。
     */
    @Test
    public void mst1(){
        String s = "hello";
        s+=" wolrd";
        System.out.println(s); // hellowolrd
    }

    /**
     * 2:String s1 = new String(“abc”);String s2 = “abc”;有区别吗？
     *   	有。
     *   	第一种方式，在内存中有两个对象。第二种方式只有一个对象。
     */
    @Test
    public void mst2(){
        String s1 = new String("hello");
        String s2 = new String("hello");
        System.out.println(s1 == s2);       // false  比较的是地址 内存地址是不一样的，引用是一样的
        System.out.println(s1.equals(s2));  // true   比较的是内容

        // 请注意：如果直接赋值，是从常量池里先找，如果有，就用。否则，就造一个。
        String s3 = "hello";
        String s4 = "hello";

        System.out.println(s3 == s4);       // true 直接从常量区拿数据， 两个内存地址是一样的
        System.out.println(s3.equals(s4));  // true


        String s5 = new String("hello");
        String s6 = "hello";
        System.out.println(s5 == s6); // false
        System.out.println(s5.equals(s6)); // true
        System.out.println("****************************");

        String s7 = "hello";
        String s8 = "world";
        String s9 = "helloworld";
        System.out.println(s9 == s7 + s8);                  // false 如果是变量，直接造。
        System.out.println(s9.equals(s7 + s8));             // true
        System.out.println(s9 == "hello" + "world");        // true  如果是常量，先找，有就用。没有就造。
        System.out.println(s9.equals("hello" + "world"));   // true  如果是常量，先找，有就用。没有就造。

    }
}
