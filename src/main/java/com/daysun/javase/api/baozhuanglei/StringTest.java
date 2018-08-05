package com.daysun.javase.api.baozhuanglei;

import java.util.Arrays;

/*
 * 需求：
 * 		我有这样的一个字符串"34 -12 56 93 27"
 * 	             请想办法实现把字符串中的数据进行排序。
 * 举例：
 * 	   	有： "34 -12 56 93 27"
 * 		 结果："-12 27 34 56 93"	
 * 
 * 思路：  
 * 		A:定义一个字符串
 * 		B:把字符串按照空格进行分割得到一个字符串数组
 * 		C:把字符串数组转成成int数组
 * 		D:对int数组排序
 * 		E:在把排序后的int数组转换成String
 * 	
 *  */
public class StringTest {
	public static void main(String[] args) {
		//定义一个字符串
		String s = "34 -12 56 93 27";
		
		//把字符串按照空格进行分割得到一个字符串数组
		String[] strArray = s.split(" ");
		
		//把字符串数组转成成int数组
		int[] arr = new int[strArray.length];
		
		for(int x=0; x<arr.length; x++) {
			arr[x] = Integer.parseInt(strArray[x]);
		}
		
		//对int数组排序
		Arrays.sort(arr);
		
		//在把排序后的int数组转换成String
//		StringBuilder builder = new StringBuilder();
//		for(int x=0; x<arr.length; x++) {
//			builder.append(arr[x]).append(" ");
//		}
//		String result = builder.toString().trim();
		
		//调用功能
		String result = arrayToString(arr);
		
		System.out.println(result);
	}
	
	/*
	 * 返回值类型：String
	 * 参数类别：int[] arr
	 */
	public static String arrayToString(int[] arr) {
		StringBuilder builder = new StringBuilder();
		
		for(int x=0; x<arr.length; x++) {
			builder.append(arr[x]).append(" ");
		}
		
		return builder.toString().trim();
	}
	
}
