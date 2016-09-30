package com.daysun.javase.io;

import org.junit.Test;

import java.io.File;
import java.io.FilenameFilter;

/**
    File f=new File("D:\\hello");创建一个文件夹
    File f=new File("D:\\hello.txt");
    f.createNewFile();创建一个文件
    f.exists() 判断文件存在
    f.delete(); 删除文件
    f.list();列出文件夹下面所有文件
    f.isDirectory() 判断一个指定的路径是否为目录
 */
public class FileTest {
    @Test
    public void test1(){
        File file=new File("d:\\myfile\\");
        String[] names=file.list(new FilenameFilter() {
            //只显示出扩展名为.txt文件
            public boolean accept(File dir, String name) {
                if(name.endsWith(".txt")){
                    return true;
                }
                return false;
            }
        });
        for(String name:names){
            System.out.println(name);
        }

        File[] names2=file.listFiles();//输出的是完整路径
        for (int i = 0; i < names2.length; i++) {
            System.out.println(names2[i]);
        }

        System.out.println(file.isDirectory());

        System.out.println(File.separator);// \
        System.out.println(File.pathSeparator);// ;
    }

    /**
     * file\\test\hello\main
     * mkdir只能创建前一个目录必须存在 创建main flase
     * mkdirs可以直接创建             创建main true
     */

    @Test
    public void makedir(){
        File file=new File("file\\test");
        if(file.mkdir()){
            System.out.println("文件夹创建成功");
        }else{
            if(file.exists()){
                System.out.println("文件夹已存在不用创建");
            }else{
                System.out.println("文件夹创建失败");
            }
        }
    }

    @Test
    public void AboutFile(){
        File file=new File("file\\test.txt");

        //判断文件是否存在
        System.out.println(file.exists());

        //文件名称
        System.out.println(file.getName());

        //文件路径
        System.out.println(file.getPath());

        //文件绝对路径
        System.out.println(file.getAbsolutePath());


        //父级路径
        System.out.println(new File(file.getAbsolutePath()).getParent());

        //文件大小 file.length() 字节
        System.out.println((float)file.length()/100+"kb");

        //是否被隐藏
        System.out.println(file.isHidden());

        //是否可读
        System.out.println(file.canRead());

        //可写
        System.out.println(file.canWrite());

        //是否是一个文件夹
        System.out.println(file.isDirectory());
    }

    //输出一个目录结构  递归
    public static  void printFiles(File dir,int tab){
        if(dir!=null){
            if(dir.isDirectory()){//是否是目录
                File next[]=dir.listFiles();
                for(int i=0;i<next.length;i++){

                    for (int j=0;j<tab;j++){
                        System.out.print("|----");
                    }

                    System.out.println(next[i].getName());
                    if(next[i].isDirectory()){//isFile判断是否是文件
                        printFiles(next[i],tab+1);
                    }
                }
            }
        }

    }

    public static void main(String[] args) {
        File file=new File("../JavaSeStudy/src/main/java");
        printFiles(file,1);
    }
}
