package com.daysun.javase.api.string.s2;

import org.junit.Test;

/**
 * int length():返回该字符串对象的长度。
 * char charAt(int index):返回指定索引处的字符。
 * int indexOf(int ch):返回指定字符第一次出现的索引位置。   97,'a'
 * int indexOf(String str):返回指定字符串第一次出现的索引位置。
 * int indexOf(int ch,int fromIndex):从指定位置开始，返回指定字符第一次出现的索引位置。
 * int indexOf(String str,int fromIndex):从指定位置开始，返回指定字符串第一次出现的索引位置。
 * String substring(int start):从指定位置开始截取字符串。
 * String substring(int start,int end):从指定位置开始，到指定位置结束截取字符串。 包左不包右。
 */

public class MetCharAtIndexOf {
    public static void main(String[] args) {
        // 创建字符串对象
        String s = "helloworld";

        // System.out.println(s.charAt(0));
        // System.out.println(s.charAt(1));
        // System.out.println(s.charAt(2));
        // System.out.println(s.charAt(3));
        // System.out.println(s.charAt(4));
        // System.out.println(s.charAt(5));
        // System.out.println(s.charAt(6));
        // System.out.println(s.charAt(7));
        // System.out.println(s.charAt(8));
        // System.out.println(s.charAt(9));

        // 如果字符串太长，这样就麻烦了。并且，我们发现这个操作的语句重复度过高。
        // 只有一个地方是变化的，其他的都是固定的。
        // 从0-9是变化的，所以，我决定想办法获取到0-9的数据
        // for(int x=0; x<10; x++){
        // System.out.println(s.charAt(x));
        // }
        // 这次的范围是我们数的，而将来别人给的一个字符串，我们不知道有多少个字符，怎么办呢?
        // 字符串有一个获取长度的方法，叫length()

//        for (int x = 0; x < s.length(); x++) {
//            //System.out.println(s.charAt(x));
//            char ch = s.charAt(x);
//            System.out.println(ch);
//        }

        for (int i = 0; i <s.length() ; i++) {
             char ch = s.charAt(i);
            System.out.print(ch);  // helloworld
        }
    }


    /**
     * int indexOf(int ch):返回指定字符第一次出现的索引位置。
     * int indexOf(String str):返回指定字符串第一次出现的索引位置。
     */
    @Test
    public void testIndexOf(){
        //创建对象
        String s = "helloworld";

        System.out.println(s.length()); // 10
        System.out.println("charAt:"+s.charAt(5)); //w

        System.out.println("indexOf:"+s.indexOf('l'));  //2
        System.out.println("indexOf:"+s.indexOf("wor")); // 5
        System.out.println("indexOf:"+s.indexOf("ak")); // -1 没找到


        //int indexOf(int ch,int fromIndex):从指定位置开始，返回指定字符第一次出现的索引位置。
        //int indexOf(String str,int fromIndex):从指定位置开始，返回指定字符串第一次出现的索引位置。
        System.out.println("indexOf:"+s.indexOf('l', 4)); //8  从第4个位置开始找第一次l

        //String substring(int start):从指定位置开始截取字符串。
        System.out.println("substring:"+s.substring(5)); //world
        //System.out.println(s);
        //String substring(int start,int end):从指定位置开始，到指定位置结束截取字符串。
        System.out.println("substring:"+s.substring(3,8)); //lowor

    }
}
