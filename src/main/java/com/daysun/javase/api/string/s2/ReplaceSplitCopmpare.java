package com.daysun.javase.api.string.s2;
/*
 * 其他功能：
 * 		替换功能：
 * 			String replace(char old,char new)：把该字符串中的指定字符用新的指定字符替换。
 *			String replace(String old,String new):把该字符串中的指定字符串用新的指定字符串替换。
 *
 *		分割功能：
 *			String[] split(String regex)：把字符串按照指定的标记分割成字符串数组。
 *
 *		去除字符串两端的空格：
 *			String trim()
 *
 *		按字典顺序比较两个字符串 ：
 *			int compareTo(String str)
 *			int compareToIgnoreCase(String str)
 */
public class ReplaceSplitCopmpare {
    public static void main(String[] args) {
        // 创建字符串对象
        String s = "helloworld";

        // String replace(char old,char new)：把该字符串中的指定字符用新的指定字符替换。
        String s1 = s.replace('l', 'k');
        System.out.println(s1);

        // String replace(String old,String new):把该字符串中的指定字符串用新的指定字符串替换。
        String s2 = s.replace("ll", "xixi");
        System.out.println(s2);

        // String trim()
        String s3 = " Hello World   ";
        String s4 = s3.trim();
        System.out.println("---" + s3 + "---");
        System.out.println("---" + s4 + "---");

        //String[] split(String regex)：把字符串按照指定的标记分割成字符串数组。
        //世纪佳缘，百合，珍爱，QQ
        //选项：20-30
        //age>=20 && age<=30
        //String -- int 后天讲。
        String ages = "20-30-35-45";
        String[] strArray = ages.split("-");
        for(int x=0; x<strArray.length; x++){
            System.out.println(strArray[x]);
        }

        //按字典顺序比较两个字符串 ：
        String s5 = "hello";
        String s6 = "Hello";
        String s7 = "ihello"; //abcdefghi...
        String s8 = "hello";
        //int compareTo(String str)
        //A 65,a 97
        System.out.println(s5.compareTo(s6));  //32
        System.out.println(s5.compareTo(s7));  //-1
        System.out.println(s5.compareTo(s8));  //0

        System.out.println(s5.compareToIgnoreCase(s6));  //0
    }
}
