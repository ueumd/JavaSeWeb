package com.daysun.javase.io.stream;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamDemo {
    @Test
    public void show() throws IOException {
        // 创建字节输入流对象
        FileInputStream fis = new FileInputStream("fos.txt");


        // byte[] b = "同学们爱Java,老师爱林青霞".getBytes();
        // System.out.println(Arrays.toString(b));

        // byte[] b = "中国".getBytes();
        // System.out.println(Arrays.toString(b));
        // [-42, -48, -71, -6]

        // byte[] b = "abcde".getBytes();
        // System.out.println(Arrays.toString(b));
        // [97, 98, 99, 100, 101]

        // System.out.println((char)-42);
        // System.out.println((char)-48);
        // System.out.println((char)-71);
        // System.out.println((char)-6);

        // 调用read()方法，并把数据显示
        // 方式1：一次读取一个字节
        // public int read()
        // int by = 0;
        // while ((by = fis.read()) != -1) {
        // System.out.print((char) by);
        // }

        System.out.println("----------------------");

        // 方式2：一次读取一个字节数组
        // public int read(byte[] b)
        byte[] bys = new byte[1024];
        int len = 0;
        while ((len = fis.read(bys)) != -1) {
            System.out.print(new String(bys, 0, len));
        }

        // 释放资源
        fis.close();
    }
}
