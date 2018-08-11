package com.daysun.javase.ioandfile.test;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

/**
 * 本课时讲解使用Apache IO库操作IO与文件，
 * Apache IO库是一个强大的IO操作库，
 * 提供了对于IO与文件大量精简高效的操作方法，文件的读写、拷贝有时候仅需一行代码就可完成。
 */
public class ApacheIo {

    private static void output(){
        File file = new File("file\\hello.txt");

        try {
            String input=FileUtils.readFileToString(file,"UTF-8");

            System.out.println(input);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    private static void copyFile(){
        File file = new File("file\\hello.txt");
        File file2 = new File("file\\hello2.txt");
        try {
            FileUtils.copyFile(file,file2);
            String input=FileUtils.readFileToString(file2,"UTF-8");

            System.out.println(input);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static void main(String[] args) {
       // output();
        copyFile();
    }
}
