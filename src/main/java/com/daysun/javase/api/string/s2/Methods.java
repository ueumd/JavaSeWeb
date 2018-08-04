package com.daysun.javase.api.string.s2;

/**
 * 字符串的判断功能：
 * 		boolean equals(Object obj):             比较字符串的内容是否相同。
 *		boolean equalsIgnoreCase(String str):   比较字符串的内容是否相同，不区分大小写。
 *		boolean contains(String str):           判断该字符串对象是否包含给定的字符串。
 *		boolean startsWith(String str):         判断该字符串对象是否以给定的字符串开头。
 *		boolean endsWith(String str):           判断该字符串对象是否以给定的字符串结束。
 *		boolean isEmpty():                      判断该字符串对象是否为空。到底指的是内容("")，不是地址(null)。
 */
public class Methods {
    public static void main(String[] args) {
        String s = "HelloWorld";

        //boolean equals(Object obj):比较字符串的内容是否相同。
        System.out.println("equals:"+s.equals("HelloWorld")); //true
        System.out.println("equals:"+s.equals("helloworld")); //false
        System.out.println("------------------------------");

        //boolean equalsIgnoreCase(String str):比较字符串的内容是否相同，不区分大小写。
        System.out.println("equalsIgnoreCase："+s.equalsIgnoreCase("HelloWorld"));   //true
        System.out.println("equalsIgnoreCase："+s.equalsIgnoreCase("helloWorld"));   //true
        System.out.println("------------------------------");

        //boolean contains(String str):判断该字符串对象是否包含给定的字符串。
        System.out.println("contains:"+s.contains("wor"));  //false
        System.out.println("contains:"+s.contains("Hell")); //true
        System.out.println("------------------------------");

        //boolean startsWith(String str):判断该字符串对象是否以给定的字符串开头。
        System.out.println("startsWith:"+s.startsWith("H"));    //true
        System.out.println("startsWith:"+s.startsWith("Hell")); //true
        System.out.println("startsWith:"+s.startsWith("ell"));  //false
        System.out.println("------------------------------");

        //boolean endsWith(String str):判断该字符串对象是否以给定的字符串结束。

        //留给自己测试，有问题单独问我。

        //boolean isEmpty():判断该字符串对象是否为空。指的是内容("")
        System.out.println("isEmpty:"+s.isEmpty()); // fasle
        System.out.println("isEmpty:"+"".isEmpty()); //true

         String ss = null;
         //isEmpty
         System.out.println("isEmpty:"+ss.isEmpty());
    }
}
