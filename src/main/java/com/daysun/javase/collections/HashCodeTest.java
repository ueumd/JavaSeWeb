package com.daysun.javase.collections;

/**
 * Created by Administrator on 2016/9/25.
 */
public class HashCodeTest {
    public static void main(String[] args) {
        String str1="hello";
        String str2=new String("hello");
        System.out.println("str1==str2 : "+str1==str2);
        System.out.println("str1 is hashcode: "+str1.hashCode());
        System.out.println("str2 is hashcode: "+str2.hashCode());
        /*
        false
        str1 is hashcode: 99162322
        str2 is hashcode: 99162322

        HashCode默认情况下表示的是内存地址，
        String类已经重写了Object的hashCode方法  丙个字符串内容一致，hashcode也是一致
        */
    }
}
