package com.daysun.javase.ioandfile.file;

import org.junit.Test;

import java.io.File;
import java.util.Date;

public class FileDemo {

    public static void main(String[] args) {

    }

    static String p = "E:\\JavaStudy\\JavaSeWeb\\src\\main\\java\\com\\daysun\\javase\\io\\file\\";

    /**
     * 为了方便我们对硬盘上的文件进行操作，比如：我要创建一个文件，我要删除文件，我要重命名文件。
     * java就提供了一个对应的类：File供我们使用。
     * 注意：这个File对象本身即可以表示文件，还可以表示文件夹。(目录)
     * <p>
     * File的构造方法：
     * File(String pathname):根据给定的路径构造File对象
     * File(String parent, String child):根据给定的父目录和子目录或者文件来构造File对象
     * File(File parent, String child):根据指定的父File对象和子目录或者文件来构造File对象
     */
    @Test
    public void f1() {
        // 方式1
        File file = new File("d:\\file\\a.txt");

        // 方式2
        File file2 = new File("d:\\file", "a.txt");

        // 方式3
        File file3 = new File("d:\\file");
        File file4 = new File(file3, "a.txt");
    }

    /**
     * 创建功能：
     * 创建文件：public boolean createNewFile()
     * 如果文件存在，就不创建，返回false。否则创建文件，返回true。
     * 创建文件夹：public boolean mkdir()
     * public boolean mkdirs()
     * 如果文件夹存在，就不创建，返回false。否则创建文件夹，返回true。
     * 路径问题：
     * 相对路径：不以盘符开始的路径。默认在当前的项目路径下。
     * 绝对路径：就是以盘符开始的路径。
     * <p>
     * 注意：
     * 骑白马的不一定是王子，可能是唐僧。
     * File对象表示的到底是文件还是文件夹，根据你创建时候的选择功能而定。
     */
    @Test
    public void f2() {
        try {
            String p = "E:\\JavaStudy\\JavaSeWeb\\src\\main\\java\\com\\daysun\\javase\\io\\file\\";
            // 创建一个File对象
            File file = new File(p + "a.txt");
            // 调用功能
            System.out.println("createNewFile:" + file.createNewFile());

            // 创建文件对象的时候，不小心把前面写掉了
            File fil2 = new File("a.txt"); //默认在当前的项目路径下。
            System.out.println("createNewFile:" + fil2.createNewFile());


            File file3 = new File("bbb"); //默认在当前的项目路径下。
            System.out.println("mkdir:" + file3.mkdir());


            // 方式2：多级目录创建
            File file4 = new File("bbb\\ccc");
            System.out.println("mkdirs:" + file4.mkdirs());


        } catch (Exception e) {

        }
    }


    /**
     * 删除功能：
     * 删除文件或者文件夹：public boolean delete()
     * 注意：
     * A:删除一个带内容的目录，必须先删除里面所有的内容，最后才能删除目录。
     * B:Java程序的删除不走回收站。
     */
    @Test
    public void f3() {
        File file = new File(p + "a.txt");
        System.out.println("del:" + file.delete()); // delete:ture


        File file2 = new File("a.txt");
        System.out.println("del:" + file2.delete()); // delete:ture

        // 删除不存在的文件
        File file3 = new File("bbb");
        System.out.println("delete:" + file3.delete());  //delete:false
    }

    /**
     * 判断功能：
     * 判断file对象是否存在：public boolean exists()
     * 判断file对象是否是文件：public boolean isFile()
     * 判断file对象是否是文件夹：public boolean isDirectory()
     * 判断file对象是否可读：public boolean canRead()
     * 判断file对象是否可写：public boolean canWrite()
     * 判断file对象是否隐藏：public boolean isHidden()
     */

    @Test
    public void f4() {
        // 创建File对象
        try {
            File file = new File("a.txt");
            System.out.println("create:" + file.createNewFile());

            System.out.println("exists:" + file.exists());// true
            System.out.println("isFile:" + file.isFile());// true
            System.out.println("isDirectory:" + file.isDirectory());// false
            System.out.println("canRead:" + file.canRead());// true
            System.out.println("canWrite:" + file.canWrite());// true
            System.out.println("isHidden:" + file.isHidden());// false
        } catch (Exception e) {
        }
    }

    /**
     * 重命名功能：
     * public boolean renameTo(File dest):把当前File对象的表示为新的file对象。
     * <p>
     * 当两次的File对象在同一个路径下，就是重命名。
     * 当两次的File对象不在同一个路径下，其实就是把第一个的文件名称改变，并存储到新的路径下。其实就是剪切功能。
     */

    @Test
    public void f5() {
        // 创建File对象
        try {
            // 需求：我要把test.txt文件的名称改为demo.txt
            // 封装旧路径
            // File file = new File("test.txt");
            // File newFile = new File("demo.txt");
            // System.out.println("renameTo:" + file.renameTo(newFile));

            File oldFile = new File("demo.txt");
            File newFile = new File("test.txt");
            System.out.println("renameTo:" + oldFile.renameTo(newFile));
        } catch (Exception e) {
        }
    }

    /**
     * 获取功能：
     * 获取file对象的绝对路径：public String getAbsolutePath()
     * 获取file对象的相对路径：public String getPath()
     * 获取file对象名称：public String getName()
     * 获取file文件的大小：public long length()
     * 获取file对象最后一次修改时间的毫秒值：public long lastModified()
     */

    @Test
    public void f6() {
        // 创建File对象
        try {
            // 创建File对象
            File file = new File(p + "hello.txt");

            if (!file.exists()) {
                file.createNewFile();
            }

            System.out.println("getAbsolutePath:" + file.getAbsolutePath());
            System.out.println("getPath:" + file.getPath());
            System.out.println("getName:" + file.getName());
            System.out.println("length:" + file.length());
            System.out.println("lastModified:" + file.lastModified()); // 1396344480598

            Date d = new Date(file.lastModified());
            System.out.println(d);
        } catch (Exception e) {
        }
    }

    /**
     * 高级获取功能：
     * public static File[] listRoots()：返回盘符根目录。
     * public String[] list()：返回指定路径下所有文件或者文件夹的名称数组。     //list()方法存储的是文件名或文件夹名
     * public File[] listFiles()：返回指定路径下所有文件或者文件夹的File数组   //
     */

    @Test
    public void f7() {
        String p = "E:\\JavaStudy\\JavaSeWeb\\src\\main\\java\\com\\daysun\\javase\\io\\";
        // 创建File对象
        try {
            //返回盘符根目录。
            File[] rootArray = File.listRoots();
            for (File file : rootArray) {
                System.out.println(file);
            }
            System.out.println("-------------");

            File file = new File(p);
            // public String[] list()
            String[] strArray = file.list();
            for (String str : strArray) {
                System.out.println(str);
            }

            /*
            file
            test
            总结.txt
            */
            System.out.println("-------------");

            // 需求：我要获取指定目录下所有文件的名称
            // 这个时候，我们需要一个判断，判断file是否是文件。
            // 那么，你想判断file，你得先获取到file。
            // public File[] listFiles()
            ////listFiles()方法存储的是文件的完整路径，因此在遍历文件夹以及子文件夹中所有文件时必须使用listFiles()方法
            File[] fileArray = file.listFiles();
            for (File f : fileArray) {
                System.out.println(f);
                /*
                 E:\JavaStudy\JavaSeWeb\src\main\java\com\daysun\javase\io\file
                 E:\JavaStudy\JavaSeWeb\src\main\java\com\daysun\javase\io\test
                 E:\JavaStudy\JavaSeWeb\src\main\java\com\daysun\javase\io\总结.txt
                 */
                if (f.isFile()) {
                    System.out.println(f.getName());  //总结.txt 只有这一个是文件，其他是文件夹
                }
            }
        } catch (Exception e) {
        }
    }

}
