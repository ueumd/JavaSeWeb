package com.daysun.javase.api.baozhuanglei;

/*
 * int类型和String类型的转换。
 * 
 * int -- String
 * 			String.valueOf(int x)
 * 			Integer.toString(int x)
 * 
 * String -- int
 * 			Integer.parseInt(String s)
 */
public class IntegerDemo3 {
	public static void main(String[] args) {
		// int -- String
		int number = 10;
		// 方式1
		String s = number + "";
		System.out.println(s);
		//方式2
		String s2 = String.valueOf(number);
		System.out.println(s2);
		//方式3
		//int -- Integer -- String
		Integer i = new Integer(number);
		String s3 = i.toString();
		System.out.println(s3);
		//方式4
		//public static String toString(int i)
		String s4 = Integer.toString(number);
		System.out.println(s4);
		System.out.println("--------------");
		
		//String -- int
		//方式1
		//String -- Integer -- int
		String ss = "100";
		Integer ii = new Integer(ss);
		//public int intValue()
		int n = ii.intValue();
		System.out.println(n);
		
		//方式2
		//public static int parseInt(String s)
		int nn = Integer.parseInt(ss);
		System.out.println(nn);
		
	}
}
