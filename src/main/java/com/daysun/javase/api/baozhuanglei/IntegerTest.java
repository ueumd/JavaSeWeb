package com.daysun.javase.api.baozhuanglei;

/*
 * 面试题：byte常量池。
 * 自从有了自动装箱后，在byte范围内的值直接赋值给包装类的时候，是从常量池里获取的。
 */
public class IntegerTest {
	public static void main(String[] args) {
		Integer i1 = new Integer(127);
		Integer i2 = new Integer(127);
		System.out.println(i1 == i2);// false
		System.out.println(i1.equals(i2));// true

		Integer i3 = new Integer(128);
		Integer i4 = new Integer(128);
		System.out.println(i3 == i4);// false
		System.out.println(i3.equals(i4)); // true

		Integer i5 = 127;
		Integer i6 = 127;
		System.out.println(i5 == i6); // ??? -- true
		System.out.println(i5.equals(i6));// true

		Integer i7 = 128;
		Integer i8 = 128;
		System.out.println(i7 == i8); // ??? --false   //超出了byte范围，进行了new动作
		System.out.println(i7.equals(i8)); // true
	}
}
