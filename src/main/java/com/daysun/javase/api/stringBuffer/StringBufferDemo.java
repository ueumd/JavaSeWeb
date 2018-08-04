package com.daysun.javase.api.stringBuffer;
/*
 * StringBuffer:字符串缓冲区类。
 * 
 * 特点：
 * StringBuffer:在原来的空间是可以扩充的，被称为字符串缓冲区。
 * String:是固定的，一旦拼接，就会产生一个新的字符串，以前的就会浪费掉。
 * 
 * 构造方法：
 * 		A:StringBuffer() 初始容量16
 * 		B:StringBuffer(int capacity) 指定容量
 * 		C:StringBuffer(String str) 容量是???
 * 
 * 要掌握的方法：
 * 		A:public int length() 实际存储值
 * 		B:public int capacity() 理论存储值
 */
public class StringBufferDemo {
	public static void main(String[] args) {
		// 方式1 (散步，上班，随便)
		StringBuffer sb = new StringBuffer();
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		System.out.println("--------------");

		// 方式2
		StringBuffer sb2 = new StringBuffer(50); //初始化容量50
		System.out.println(sb2.length());
		System.out.println(sb2.capacity());
		System.out.println("--------------");

		// 方式3
		// 把String转换为StringBuffer的方式。
		//相反：把StringBuffer转换为字符串：String(StringBuffer buffer) 
		//很多时候，我们会看到类之间的相互转换，请问为什么要转换?就是为了用别人的方法。
		StringBuffer sb3 = new StringBuffer("helloworld");
		System.out.println(sb3.length());
		System.out.println(sb3.capacity());
	}
}
