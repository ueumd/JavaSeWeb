package com.daysun.javase.api.stringBuffer;

/*
 * 添加元素功能：
 * 		A:添加功能
 * 			public StringBuffer append(String str):在后面追加元素，返回当前对象的引用。
 * 
 *		B:插入功能
 *			public StringBuffer insert(int offset,String str):在指定位置插入元素，返回当前对象的引用。
 *
 * JDK升级：
 * 		安全
 * 		效率
 * 		简化书写
 * 
 * StringBuffer和StringBuilder的区别?
 * 后者更高效。
 * 
 * 线程：线程安全问题。
 * 		安全了，效率就低了。
 * 		效率高了，可能就不安全了。
 * 
 */
public class StringBufferDemo2 {
	public static void main(String[] args) {
		// 创建对象
		StringBuffer buffer = new StringBuffer();
		// 添加数据
		// StringBuffer buffer2 = buffer.append("hello");
		// System.out.println(buffer == buffer2);// true

		// 可以把任意类型转换成字符串
		// buffer.append("hello");
		// buffer.append(true);
		// buffer.append(12345);
		// buffer.append(23.567);
		// 链式编程
		buffer.append("hello").append(true).append(12345).append(23.567);

		buffer.insert(5, "world"); // 从索引5开始，插入一个字符串：world

		System.out.println(buffer);

	}
}
