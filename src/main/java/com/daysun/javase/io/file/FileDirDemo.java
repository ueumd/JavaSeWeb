package com.daysun.javase.ioandfile.file;

import org.junit.Test;

import java.io.File;

public class FileDirDemo {
    public static void main(String[] args) {

    }

    static String p = "E:\\JavaStudy\\JavaSeWeb\\src\\main\\java\\com\\daysun\\javase\\io\\file";

    /**
     * 请输出d盘跟目录下以.java结尾的文件名称。
     * <p>
     * 分析：
     * A:封装目录，变成一个File对象。
     * B:获取指定目录下所有File数组。
     * C:遍历File数组，获取到每一个File对象
     * D:判断获取到的File对象是否是文件
     * 是：继续判断是否以.java结尾
     * 是：就输出名称
     * 否：不搭理他。
     * 否：不搭理他。
     */

    @Test
    public void f1() {
        try {
            // 封装目录，变成一个File对象。
            File file = new File(p);

            // 获取指定目录下所有File数组。
            File[] fileArray = file.listFiles();

            // 遍历File数组，获取到每一个File对象
            for (File f : fileArray) {
                // 判断获取到的File对象是否是文件
                if (f.isFile()) {
                    // 继续判断是否以.java结尾
                    if (f.getName().endsWith(".java")) {
                        System.out.println(f.getName());
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * public File[] listFiles(FilenameFilter filter):根据过滤器获取指定目录下所有File数组。
     * public String[] list(FilenameFilter filter):根据过滤器获取指定目录下所有名称数组。
     */
    @Test
    public void f2() {
        try {
            // 封装目录
            File srcFile = new File(p);

            File[] fileArray = srcFile.listFiles(new MyFilenameFilter());
            for (File file : fileArray) {
                System.out.println(file.getName());
            }

            String[] strArray = srcFile.list(new MyFilenameFilter());
            for (String str : strArray) {
                System.out.println(str);
            }


//            String[] strArray = srcFile.list(new FilenameFilter() {
//                @Override
//                public boolean accept(File dir, String name) {
//                    return new File(dir, name).isFile() && name.endsWith(".java");
//                }
//            });
//            for (String str : strArray) {
//                System.out.println(str);
//            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    /**
     * 需求：把指定目录下所有文件的名称按照某种规则改名。
     *
     * 分析：
     * 		A:封装目录
     * 		B:获取指定目录下所有File数组。
     * 		C:遍历File数组。获取到每一个File对象。
     * 		D:对每一个File对象改名。
     * 			旧名称：d:\\笑傲江湖\\[helloworld-java-android]笑傲江湖吐槽1.f4v
     * 			新名称：d:\\笑傲江湖\\笑傲江湖吐槽1.f4v
     */

    @Test
    public void f3() {
        try {
            // A:封装目录
            File srcFile = new File("d:\\笑傲江湖");

            // 获取指定目录下所有File数组。
            File[] fileArray = srcFile.listFiles();

            // 遍历File数组。获取到每一个File对象。
            for (File file : fileArray) {
                // 对每一个File对象改名。
                String oldName = file.getName();
                int index = oldName.indexOf(']');
                String newName = oldName.substring(index + 1);
                File newFile = new File(srcFile, newName);
                file.renameTo(newFile);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
