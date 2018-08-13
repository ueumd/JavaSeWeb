package com.daysun.javase.io.copy;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyDemo {
    /**
     * 需求：把d:\\cxy.bmp复制到当前项目路径下的copy.bmp中。
     *
     * 数据源：
     * 		d:\\cxy.bmp	-- 字节流 -- 字节输入流 -- FileInputStream
     * 目的地：
     * 		copy.bmp -- 字节流 -- 字节输出流 -- FileOutputStream
     */

    @Test
    public void copyimg() throws IOException {
        // 封装数据源
        FileInputStream fis = new FileInputStream("d:\\cxy.bmp");
        // 封装目的地
        FileOutputStream fos = new FileOutputStream("copy.bmp");

        // 基本读写
        int by = 0;
        while ((by = fis.read()) != -1) {
            fos.write(by);
        }

        // 释放资源
        fos.close();
        fis.close();
    }

    @Test
    public void copyMp3() throws IOException {
        // 封装数据源
        FileInputStream fis = new FileInputStream("d:\\在那遥远的地方.mp3");
        // 封装目的地
        FileOutputStream fos = new FileOutputStream("copy.mp3");

        // 一次一个字节数组
        byte[] bys = new byte[1024];
        int len = 0;
        while ((len = fis.read(bys)) != -1) {
            fos.write(bys, 0, len);
        }

        // 释放资源
        fos.close();
        fis.close();
    }
}
