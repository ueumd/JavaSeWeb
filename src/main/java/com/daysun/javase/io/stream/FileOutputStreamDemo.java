package com.daysun.javase.io.stream;

import org.junit.Test;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo {

    @Test
    public void f1() throws IOException {
        // A:创建字节输出流对象
        // 注意：如果文件不存在，我就创建一个新文件。如果文件存在，就把内容清空。
        FileOutputStream fos = new FileOutputStream("fos.txt");

        // 调用对象的write()方法
        // void write(int b)
        // fos.write(97);

        // void write(byte[] b)
        // byte[] bys = {97,98,99,100,101};
        // byte[] bys = "abcde".getBytes();
        // fos.write(bys);
        // fos.write("abcde"); //错误的，没有写一个字符串的功能
        // fos.write("abcde".getBytes());

        // void write(byte[] b, int off, int len)
        // fos.write("abcde".getBytes(), 0, 2);

        fos.write("我们好".getBytes());

        // 释放资源
        fos.close();
    }
}
