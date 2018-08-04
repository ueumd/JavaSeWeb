package com.daysun.javase.api.scanner;

import java.util.Scanner;

/**
 * Scanner:在JDK5以后，用于帮助我们接受键盘录入的数据。
 *
 * 创建对象：
 * 		Scanner sc = new Scanner(System.in);
 *
 * 		分析：在System类下面有一个静态的成员变量：in
 * 			public static final InputStream in：表示一个标准的键盘输入流，代表键盘输入。
 * 			Scanner仅仅是对其进行了一次包装，由Scanner去实现各种转换，最终按照Scanner的方式提供你要的数据。
 *
 * 要掌握的功能：
 * 		int：返回一个int类型的数据
 * 			public int nextInt()
 * 		String：返回一个String类型的数据
 * 			public String nextLine()
 *
 *
 * String -- String：没有问题。
 * String -- int：没有问题。
 * int -- int：没有问题。
 * int -- String：有问题。这个时候是把换行符给了String。在windows下换行符是：\r\n
 * 				 转义字符：有些字符本身有自己的意思，但是为了表达特殊的含义，就用\进行了转义。
 * 						\r:回车符
 * 						\n:换行符
 *
 * 				如果就想先获取int，在获取String：这个时候，
 * 					A:你可以重新创建一个对象即可。
 * 					B:把所有的数据都当做String类型来看，将来你要什，我就给你转换成什么。
 * 						String -- int
 */
public class ScannerTest {

    public static void main(String[] args) {
        // 封装键盘录入
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        System.out.println(num);

        // 使用功能


         String s = sc.nextLine();
         System.out.println(s);

        //String s1 = sc.nextLine();
        //String s2 = sc.nextLine();

        //int s1 = sc.nextInt();
        //int s2 = sc.nextInt();
        //String s2 = sc.nextLine();
        //System.out.println("***" + s1 + "---" + s2 + "***");

        //System.out.println("\r\n");
        //System.out.println("");
    }
}
