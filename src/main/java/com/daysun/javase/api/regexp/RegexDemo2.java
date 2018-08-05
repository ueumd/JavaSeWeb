package com.daysun.javase.api.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * Pattern:正则表达式的编译表示形式。
 *
 * 典型的调用步骤：
 * Pattern p = Pattern.compile("a*b");
 * Matcher m = p.matcher("aaaaab");
 * boolean b = m.matches();
 */
public class RegexDemo2 {
    public static void main(String[] args) {
        // 把正则表达式编译成模式对象
        // public static Pattern compile(String regex)
        // Pattern p = Pattern.compile("a*b");
        // // 通过模式对象创建匹配器对象
        // Matcher m = p.matcher("aaaaab");
        // // 调用匹配器对象的判断功能
        // boolean b = m.matches();
        // System.out.println(b);

        // 如果仅仅是做判断功能，用普通的字符串功能能实现吗?
        // String str = "aaaaab";
        // String regex = "a*b";
        // boolean flag = str.matches(regex);
        // System.out.println(flag);

        // 只所以讲上面那种方式，是为了使用它的获取功能。
        // String str = "da jia zhu yi le, ming tian bu fang jia, xie xie!";
        // 想要获取3个单词字符组成的单词 [a-zA-Z_0-9]
        // 定义字符串
        String str = "da jia zhu yi le, ming tian bu fang jia, xie xie!";
        String regex = "\\b[a-z]{3}\\b";

        // 得到模式对象
        Pattern p = Pattern.compile(regex);
        // 得到匹配器对象
        Matcher m = p.matcher(str);
        // 调用匹配器对象的功能
        // System.out.println(m.matches());

        // public boolean find()
        // public String group()

		/*
		System.out.println(m.find());
		// java.lang.IllegalStateException: No match found
		System.out.println(m.group());

		System.out.println(m.find());
		System.out.println(m.group());

		System.out.println(m.find());
		System.out.println(m.group());

		System.out.println(m.find());
		System.out.println(m.group());

		System.out.println(m.find());
		System.out.println(m.group());

		System.out.println(m.find());
		System.out.println(m.group());
		*/
        while(m.find()){
            System.out.println(m.group());
        }
    }
}
