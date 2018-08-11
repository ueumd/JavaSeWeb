package com.daysun.javase.ioandfile.file;

import java.io.File;

public class FileDirDemo2 {
    /**
     * 需求：所有java结尾的文件的绝对路径。
     *
     * 分析：
     * 		A:封装目录。
     * 		B:获取该目录下所有的File数组
     * 		C:遍历File数组，获取到每一个File
     * 		D:判断该File是否是文件夹：
     * 			是：回到B
     * 			否：判断该文件是否java结尾
     * 				是：输出该文件的绝对路径
     * 				否：不搭理它
     */
    public static void getFilePath(File srcFile) {
        try {

            // 获取该目录下所有的File数组

            File[] fileArray = srcFile.listFiles();

            // 遍历File数组，获取到每一个File
            for (File file : fileArray) {
                // 判断该File是否是文件夹：
                if (file.isDirectory()) {
                    // 是
                    getFilePath(file);
                } else {
                    // 判断该文件是否java结尾
                    if (file.getName().endsWith(".java")) {
                        // 输出该文件的绝对路径
                        System.out.println(file.getAbsolutePath());
                    }
                }
            }
        } catch (Exception e) {}
    }

    public static void deleteFile(File srcFile) {
        // 获取指定目录下所有File数组
        File[] fileArray = srcFile.listFiles();

        // 为了确保除非是系统自带的一些文件，其他的文件都可以删除。
        if (fileArray != null) {
            // 遍历File数组，获取到每一个File
            for (File file : fileArray) {
                if (file.isDirectory()) {
                    deleteFile(file);
                } else {
                    System.out.println(file.getName() + "---" + file.delete());
                }
            }

            // for循环删除的是文件
            System.out.println(srcFile.getName() + "---" + srcFile.delete());
        }
    }

    public static void main(String[] args) {
        File srcFile = new File("E:\\JavaStudy\\JavaSeWeb\\src\\main\\java\\com\\daysun\\javase");
        getFilePath(srcFile);
    }
}
