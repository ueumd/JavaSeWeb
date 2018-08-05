package com.daysun.javase.api.baozhuanglei;

/*
 * Integer类的构造方法：
 * 		Integer(int value)：把一个int类型包装成一个Integer类型
 * 		Integer(String s)：把一个String类型包装成一个Integer类型
 * 						  注意：这里的字符串必须是由数字字符组成。
 */
public class IntegerDemo2 {
	public static void main(String[] args) {
		// 方式1
		int num = 10;
		Integer i = new Integer(num);
		System.out.println(i);

		// 方式2
		// java.lang.NumberFormatException: For input string: "a10"
		String s = "10";
		Integer ii = new Integer(s);
		System.out.println(ii);
	}
}
