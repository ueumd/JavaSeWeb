package com.daysun.javase.api.stringBuffer;

/*
 * 删除功能：
 * 		public StringBuffer delete(int start,int end):删除从指定位置开始到指定位置技术的数据，返回当前对象的引用。
 * 		public StringBuffer deleteCharAt(int index):删除指定索引处的一个字符，返回当前对象的引用。
 */
public class StringBufferDemo3 {
	public static void main(String[] args) {
		// 创建字符串缓冲区对象
		StringBuffer buffer = new StringBuffer();

		buffer.append("helloworld").append(true);

		// public StringBuffer delete(int start,int end)
		// 我要把world删除掉
		buffer.delete(5, 10); // 包左不包右。
		
		//public StringBuffer deleteCharAt(int index)
		//buffer.deleteCharAt(2);
		
		//我要把数据清空
		// buffer = new StringBuffer();
		buffer.delete(0, buffer.length());

		System.out.println("buffer:"+buffer);
	}
}
