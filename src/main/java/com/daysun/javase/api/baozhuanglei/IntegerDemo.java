package com.daysun.javase.api.baozhuanglei;
/*
 * 我们针对基本数据类型，只能做一些简单的算术操作，如果我们想对其进行复杂的操作，目前做不了。
 * java就针对基本数据类型提供了对应的包装类。好处:这个时候，就有了很的属性和方法可供我们使用。
 * 那么， 每种基本类型对应的包装类：
 * 		byte		Byte
 * 		short		Short
 * 		int			Integer
 * 		long		Long
 * 		float		Float
 * 		double		Double
 * 		char		Character
 * 		boolean		Boolean
 * 
 * 我们将以Integer举例说包装类的应用。
 * 
 * int范围的最大值，最小值。
 * 进制问题。
 */
public class IntegerDemo {
	public static void main(String[] args) {
		// int范围内的最大值，最小值
		// public static final int MAX_VALUE
		// public static final int MIN_VALUE
		System.out.println(Integer.MAX_VALUE); // 2147483647
		System.out.println(Integer.MIN_VALUE); // -2147483648

		// 进制问题
		// public static String toBinaryString(int i)
		// public static String toOctalString(int i)   8进制
		// public static String toHexString(int i)
		System.out.println(Integer.toBinaryString(60));// 111100
		System.out.println(Integer.toOctalString(60)); // 74
		System.out.println(Integer.toHexString(60));// 3c

		// public static String toString(int i,int radix)
		System.out.println(Integer.toString(10, 2));
		System.out.println(Integer.toString(10, 8));
		System.out.println(Integer.toString(10, 16));
		System.out.println(Integer.toString(10, 7));
		System.out.println(Integer.toString(100, 36));
	}
}
