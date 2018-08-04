package com.daysun.javase.api.stringBuffer;

import java.util.Scanner;

/*
 * 需求：从键盘录入一个字符串，反转后输出。
 * 举例：
 * 		录入：abc
 * 		结果：cba
 * 
 * 思路：
 * 		A:字符串本身实现
 * 			把字符串倒序输出。
 * 
 * 		B:字符串转换为字符串缓冲区类实现
 * 			String--StringBuffer--String
 */
public class StringBufferTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个字符串：");
		String line = sc.nextLine();
		
		//方式1
		String s1 = myReverse(line);
		System.out.println(s1);
		
		//方式2
		String s2 = myReverse2(line);
		System.out.println(s2);
	}
	
	public static String myReverse2(String line) {
//		StringBuffer sb = new StringBuffer(line);
//		sb.reverse();
//		return sb.toString();
		return new StringBuffer(line).reverse().toString();
	}

	/*
	 * 方式1：
	 * 返回值类型：String
	 * 参数列表：String s
	 */
	public static String myReverse(String s) {
		String result = "";
		for(int x=s.length()-1; x>=0; x--){
			result += s.charAt(x);
		}
		return result;
	}
}
