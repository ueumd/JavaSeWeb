package com.daysun.javase.api.baozhuanglei;

/*
 * JDK5以后的新特性。
 * 自动装箱：从int--Integer
 * 自动拆箱：从Integer--int
 * 
 * 注意：自动装箱和拆箱确实简化了操作，但是有一个隐含问题，就是最好要先做对象不为null的判断。
 */
public class IntegerDemo4 {
	public static void main(String[] args) {
		// JDK4以前的做法
		// Integer i = new Integer(100);
		// i = new Integer(i.intValue()+200);

		// JDK5以后的做法
		Integer i = 100; // 自动装箱。等价于 Integer i = new Integer(100);
		i = i + 200;
		// i + 200,参与运算，要求类型一致。所以，它们肯定有一个转换类类型。
		// 那么是谁转换了呢?肯定是i变成了基本类型。i.intValue() 自动拆箱。
		// i = i.intValue()+200 自动装箱。
		System.out.println(i);

		// 怎么测试一下，能够知道这里肯定是真的调用方法了呢?
		// Integer ii = null;
		// // java.lang.NullPointerException
		//
		// // 遇到使用对象，请先判断是否为null
		// if (ii != null) {
		// ii = ii + 200;
		// System.out.println(ii);
		// }
		
		// int j;

		// break;
		// return;
		// System.out.println("hello");
	}
}
