package com.daysun.javase.api.stringBuffer;
/*
 * 替换功能：
 * 		public StringBuffer replace(int start, int end, String str)：
 * 							把从指定位置开始到指定位置结束的内容用一个新的字符串替换，返回当前对象的引用。
 * 截取功能：
 * 		public String substring(int start)：截取从指定位置开始到末尾的数据并返回。 
 *		public String substring(int start, int end):截取从指定位置开始到指定位置结束的数据并返回。 
 *
 * 反转功能：
 * 		public StringBuffer reverse():把字符串缓冲区对象的数据反转。
 * 
 * 字符串和字符串缓冲区的相互转换：
 * 		String -- StringBuffer
 * 			A:StringBuffer buffer = new StringBuffer(String s);
 * 			B:StringBuffer buffer = new StringBuffer();
 * 			  buffer.append(String s);
 * 		
 * 		StringBuffer -- String
 * 			A:String s = new String(StringBuffer sb);
 * 			B:String s = (StringBuffer s).toString();
 */
public class StringBufferDemo4 {
	public static void main(String[] args) {
		// 创建字符串缓冲区对象
		StringBuffer buffer = new StringBuffer();
		buffer.append("hello").append("world").append("java");

		//public StringBuffer replace(int start, int end, String str)：
		buffer.replace(5, 10, "love"); 
		//hellolovejava
		
		//public String substring(int start)
		String s = buffer.substring(5);
		System.out.println(s);
		
		//public StringBuffer reverse():把字符串缓冲区对象的数据反转。
		buffer.reverse();

		System.out.println(buffer); //hellolovejava
	}
}
