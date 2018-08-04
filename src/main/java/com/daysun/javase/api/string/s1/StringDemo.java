package com.daysun.javase.api.string.s1;

/**
 * 字符串：由多个字符组成的一串数据。其实它的本质是字符数组。
 * 注意：所有的字符串字面值都可以看出是一个字符串对象。
 * 	        字符串是常量；它们的值在创建之后不能更改。
 *
 * 构造方法：
 * 		String():无参构造方法
 * 		String(byte[] bytes):把字节数组转成字符串
 * 		String(byte[] bytes, int startIndex, int length):把字节数组的一部分转成字符串
 * 		String(char[] value):把字符数组转成字符串
 * 		String(char[] value, int startIndex, int length):把字符数组的一部分转成字符串
 * 		String(String original):把字符串转成字符串。
 *
 * 介绍一个功能：
 * 		字符串的长度功能：public int length()
 */
public class StringDemo {
    public static void main(String[] args) {

        // 方式1 String():无参构造方法
        String s1 = new String();
        s1 ="hello";
        System.out.println(s1);
        System.out.println(s1.length());    //5
        System.out.println("---------------");

        //2 String(byte[] bytes):把字节数组转成字符串
        byte[] bys = {97,98,99,100,101};
        String s2 = new String(bys);    //ASCII码转成字母
        System.out.println(s2);         //abcde
        System.out.println(s2.length());
        System.out.println("---------------");

        //3 String(byte[] bytes, int startIndex, int length)
        String s3 = new String(bys,1,3); //包含1索引在内的三个元素。
        System.out.println(s3);          // bcd
        System.out.println(s3.length()); // 3
        System.out.println("---------");

        //4 String(char[] value):把字符数组转成字符串
        char[] chs = {'a','b','c','d','e','林','青','侠','爱','你','哦'};
        String s4 = new String(chs);
        System.out.println(s4);
        System.out.println(s4.length());
        System.out.println("---------");



        //方式5
        String s5 = new String(chs,5,5);
        System.out.println(s5);
        System.out.println(s5.length());
        System.out.println("---------");

        //方式6
        String s6 = new String("helloworld");
        System.out.println(s6);
        System.out.println(s6.length());
        System.out.println("---------");

        //方式7
        String s7 = "helloworld";
        System.out.println(s7);
        System.out.println(s7.length());
    }
}
