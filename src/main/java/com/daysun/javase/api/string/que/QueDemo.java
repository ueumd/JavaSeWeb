package com.daysun.javase.api.string.que;

import org.junit.Test;

import java.util.Scanner;

public class QueDemo {
    public static void main(String[] args) {
        QueDemo q = new QueDemo();
        q.que3();
    }

    /**
     * 获取一个字符串中指定子串出的次数。比如说“ha nba sdnbafllg nba hjnbakqqqql nba xi” 在这个字符串中，多有个nba？
     *
     * 思路：
     * 		A:定义一个字符串。
     * 		B:把字符串按照nba进行分割。得到一个字符串数组。
     * 		C:把数组长度-1即可。
     */
    @Test
    public void que1() {
        String s = "ha nba sd nba fllg nba hj nba kqqqql nba xi";

        //	// 把字符串按照nba进行分割。得到一个字符串数组。
        String[] strArry = s.split("nba");

        int len;

        for (int i = 0; i <strArry.length ; i++) {
            System.out.print(strArry[i]); // ha  sd  fllg  hj  kqqqql  xi
        }


        System.out.println("\n----------------------");
        System.out.println("endsWith:" + s.endsWith("nba")); // false

        if(s.endsWith("nba")) {
            len = strArry.length;
        } else {
            // 数组长度-1
            len = strArry.length -1;
        }
        System.out.println("\n"+len);
    }

    /**
     * 获取大串中小串出现的次数。
     *
     * 思路：
     * 		A:分别定义大串和小串。
     * 		B:定义统计变量
     * 		C:在大串中查找小串一次，
     * 			如果返回值是-1，就返回统计变量。
     * 			如果返回值不是-1，就统计变量++。
     * 		D:把大串中截取掉找到以后的字符串重新赋值给大串。
     * 		     返回C，继续。
     *
     * 字符串：是一个常量池里面的值。在参数传递中你可以把它理解和基本数据类型一致。
     *
     */
    @Test
    public void que2(){
        // 分别定义大串和小串。
        String maxString = "hanbasdnbafllgnbahjnbakqqqqlnbaxi";
        String minString = "nba";

         // 定义统计变量
         int count = 0;
         // 在大串中查找小串一次
         int index = maxString.indexOf(minString);
         while (index != -1) {
             count++;
             // 截取并重新赋值给大串
             maxString = maxString.substring(index + minString.length());
             index = maxString.indexOf(minString);
         }
         System.out.println(count); // 5

        // 写一个功能实现

        String maxString2 = "hanbasdnbafllgnbahjnbakqqqqlnbaxi";
        String minString2 = "nba";

        int count2 = getCount(maxString2, minString2);
        System.out.println(count2); // 5
    }

    public static int getCount(String maxString, String minString) {
        int count = 0;

        int index = 0;
        // 查找，赋值，判断放在一起了
        while ((index = maxString.indexOf(minString)) != -1) {
            count++;
            maxString = maxString.substring(index + minString.length());
        }

        return count;
    }

    /**
     * 注意事项：
     * 		A:不要忘了main方法。
     *
     * 需求：键盘任意录入一个字符串。(只包含大小写英文字母以及数字字符。)
     * 		举例：Hello1234World
     * 		请统计出大写字母，小写字母，以及数字字符分别有多少个。
     * 			大写：2
     * 			小写：8
     * 			数字：4
     *
     * 		思路：
     * 			A:键盘录入一个字符串。
     * 			B:定义三个统计变量。
     * 			C:遍历字符串，获取到字符串中的每一个字符。
     * 			D:对该字符进行判断，属于那种类型，就在对应的类型统计变量上++。
     * 				如何判断呢?
     * 					如果是数字：ch>='0' && ch<='9'
     * 					如果是大写字母：ch>='A' && ch<='Z'
     * 					如果是小写字母：ch>='a' && ch<='z'
     * 			E:输出三个统计变量值即可。
     */

    public void que3() {
    // 键盘录入一个字符串。
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入一个字符串：");
        String line = sc.nextLine();

        // 定义三个统计变量。
        int bigCount = 0;
        int smallCount = 0;
        int numberCount = 0;

        // 遍历字符串，获取到字符串中的每一个字符。
        for (int i = 0; i < line.length(); i++) {
            char ch = line.charAt(i);

            // 对该字符进行判断，属于那种类型，就在对应的类型统计变量上++。
            if (ch >= '0' && ch <= '9') {
                numberCount++;
            } else if (ch >= 'A' && ch <= 'Z') {
                bigCount++;
            } else if (ch >= 'a' && ch <= 'z') {
                smallCount++;
            }
        }

        //输出三个统计变量值即可。
        System.out.println("大写字母："+bigCount+"个");
        System.out.println("小写字母："+smallCount+"个");
        System.out.println("数字字符："+numberCount+"个");
    }
}
