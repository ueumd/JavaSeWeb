package com.daysun.javase.api.regexp;

import org.junit.Test;

import java.util.Scanner;

/*
 * 正则表达式：符合一定规则的字符串。
 *
 * 举例：校验qq号码。
 *		1:要求必须是5-15位数字
 *		2:0不能开头
 */
public class RegexDemo {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("请输入QQ号码：");

		String qq = sc.nextLine();
		boolean flag = checkQQ(qq);
		System.out.println(flag);

		//使用正则表达式来实现。
		boolean flag2 = checkQQ2(qq);
		System.out.println(flag2);
	}

	public static boolean checkQQ2(String qq) {
//		//定义一个正则表达式
//		String regex = "[1-9][0-9]{4,14}";
//		//public boolean matches(String regex)
//		boolean flag = qq.matches(regex);
//		return flag;
		return qq.matches("/^[1-9][0-9]{4,14}$/");
	}

	/*
	 * 返回值类型：boolean 参数列表：String qq
	 */
	public static boolean checkQQ(String qq) {
		boolean flag = true;

		// 判断长度
		if (qq.length() >= 5 && qq.length() <= 15) {
			// 0不能开头
			if (!qq.startsWith("0")) {
				// 全是数字
				char[] chs = qq.toCharArray();
				for (int x = 0; x < chs.length; x++) {
					char ch = chs[x];
					if (!(ch >= '0' && ch <= '9')) {
						flag = false;
						break;
					}
				}
			} else {
				flag = false;
			}
		} else {
			flag = false;
		}

		return flag;
	}


	/**
	 * 分割功能：
	 * 		public String[] split(String regex)
	 */
	@Test
	public void test1(){
		// 切割字符串"aa.bb.cc";
		// 定义字符串
		String str = "aa,bb,cc";
		// 定义规则
		String regex = ",";
		String[] strArray = str.split(regex);

		for (int x = 0; x < strArray.length; x++) {
			System.out.println(strArray[x]);
		}
		System.out.println("--------------------");

		// 切割字符串"aa.bb.cc";
		// 定义字符串
		String str2 = "aa.bb.cc";
		// 定义规则
		String regex2 = "\\.";
		String[] strArray2 = str2.split(regex2);
		for (int x = 0; x < strArray2.length; x++) {
			System.out.println(strArray2[x]);
		}
		System.out.println("--------------------");

		// 切割字符串“-1 99 4 23”;
		// 定义字符串
		String str3 = "-1 99 4 23";
		// 定义规则
		String regex3 = " ";
		String[] strArray3 = str3.split(regex3);

		for (int x = 0; x < strArray3.length; x++) {
			System.out.println(strArray3[x]);
		}
		System.out.println("--------------------");

		// "-1   99 4     23";
		// 定义字符串
		String str4 = "-1 99   4                   23";
		// 定义规则
		String regex4 = " +";
		String[] strArray4 = str4.split(regex4);
		for (int x = 0; x < strArray4.length; x++) {
			System.out.println(strArray4[x]);
		}
		System.out.println("--------------------");
	}
}