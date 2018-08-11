package com.daysun.javase.io.stream;

import org.junit.Test;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {

    @Test
    public void show() throws IOException {
        FileReader fr = new FileReader("a.txt");
        // 读取数据
        // int read()

        // read()  0 - 65535之间
         int num1 = fr.read();
         System.out.println(num1);
         System.out.println((char) num1);
        //
        // int num2 = fr.read();
        // System.out.println(num2);
        // System.out.println((char) num2);

        // read()会自动移动到下一个位置。
        // 如果有很多个，你肯定也是按照这种步骤读取。
        // 这样我们就发生了有代码的重复。
        // 除了变化的数据以外，其他的都是一样的，所以用循环改进
        // 问题是：循环判断条件是什么?
        // int num3 = fr.read();
        // System.out.println(num3);
        //
        // int num4 = fr.read();
        // System.out.println(num4);
        // 当读取到的数据返回的是-1的时候，说明读取到了文件的末尾。

        // int num = fr.read();
        // while (num != -1) {
        // System.out.print((char) num);
        // num = fr.read();
        // }

        // 最终版代码
        int num = 0;
        // 读取，赋值，判断三句变一句
        while ((num = fr.read()) != -1) {
            System.out.print((char) num);
        }

        // 释放资源
        fr.close();

    }

    /**
     * int read(char[] cbuf):返回的int值其实是实际去读字符的个数，把数据读取到数组中。
     */

    @Test
    public void show2() throws IOException {
        // 创建字符输入流对象
//		FileReader fr = new FileReader("fw.txt");
        FileReader fr = new FileReader("FileWriterDemo.java");


        // 读取数据
        // 定义字符数组，其实就是定义了一个容器,你想一次读取多少，你这里就定义多大。
//		char[] chs = new char[5];
//		int num = fr.read(chs); // 把数据读取5个存储到数组中
//		System.out.println(num); // 5
//		System.out.println(String.valueOf(chs)); // hello
//
//		num = fr.read(chs); // 再次读取5个数据存储到数组中
//		System.out.println(num); // 5
//		System.out.println(String.valueOf(chs)); // \r\nwor
//
//		num = fr.read(chs); // 再次读取5个数据存储到数组中
//		System.out.println(num); // 5
//		System.out.println(String.valueOf(chs)); // ld\r\nj
//
//		num = fr.read(chs); // 再次读取5个数据存储到数组中
//		System.out.println(num); // 5
//		System.out.println(String.valueOf(chs,0,num)); // ava\nj

//		num = fr.read(chs); // 再次读取5个数据存储到数组中
//		System.out.println(num); // -1
//		System.out.println(String.valueOf(chs)); // ava\r\n
//
//		num = fr.read(chs); // 再次读取5个数据存储到数组中
//		System.out.println(num); // -1
//		System.out.println(String.valueOf(chs)); // ava\r\n

        //过渡版
//		char[] chs = new char[5];
//		int len = fr.read(chs);
//		while(len!=-1){
//			System.out.print(String.valueOf(chs,0,len));
//			len = fr.read(chs);
//		}

        //最终版
        char[] chs = new char[1024]; //1024的整数倍
        int len = 0;
        while((len=fr.read(chs))!=-1){
            System.out.print(String.valueOf(chs,0,len));
        }

        // 释放资源
        fr.close();
    }
}
