package com.daysun.javase.io.stream;

import org.junit.Test;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyFile {

    /**
     * 请把当前项目路径下的a.java的内容复制到当前项目路径下的b.java中。
     *
     * 数据源：
     * 		FileWriterDemo.java -- 字符流 -- 字符输入流 -- Reader -- FileReader
     * 目的地：
     * 		Copy.java -- 字符流 -- 字符输出流 -- Writer -- FileWriter
     */

    @Test
    public void cp1() throws IOException {
        // 封装数据源
        FileReader fr = new FileReader("a.txt");
        // 封装目的地
        FileWriter fw = new FileWriter("b.txt");

        // 基本读写
//		int ch = 0;
//		int count = 0;
//		while (((ch = fr.read())) != -1) {
//			fw.write(ch);
//			if (++count % 10000 == 0) {
//				fw.flush();
//			}
//		}

        int ch = 0;
        while (((ch = fr.read())) != -1) {
            fw.write(ch);
        }

        // 释放资源
        fw.close();
        fr.close();
    }


    @Test
    public void cp2() throws IOException {
        // 封装数据源
        FileReader fr = new FileReader("FileWriterDemo.java");
        // 封装目的地
        FileWriter fw = new FileWriter("Copy.java");

        char[] chs = new char[1024];
        int len = 0;
        while ((len = fr.read(chs)) != -1) {
            // 重点强调了
            fw.write(chs, 0, len);
        }

        // 释放资源
        fw.close();
        fr.close();
    }
}
