package com.daysun.javase.ioandfile.test;

import java.io.File;

/**
 * Created by Administrator on 2016/9/27.
 */
public class Recursion {

    public int compute(int number){
        int result=1;
        for(int i=number;i>0;i--){
            result*=i;
        }
        return result;
    }

    /**
     * 亦即n!=1×2×3×...×n。阶乘亦可以递归方式定义：0!=1，n!=(n-1)!×n。
     * 阶乘指从1乘以2乘以3乘以4一直乘到所要求的数
     * @param number
     * @return
     */
    public int recursionCompute(int number){
        if(1==number){
            return 1;
        }else{
            return number*(recursionCompute(number-1));
        }
    }

    //阶乘删除文件
    private static void deleteAllFile(File file){
        if(file.isFile() || file.list().length==0){
            file.delete();
        }else{
            File[] files=file.listFiles();

            for(File f:files){
                System.out.println(f);
                deleteAllFile(f);
                f.delete();
            }
        }
    }

    //递归打印目录下面所有的文件
    public static void print(File f){
        if(f!=null){
            if(f.isDirectory()){
                File[] fileArray=f.listFiles();
                if(fileArray!=null){
                    for (int i = 0; i < fileArray.length; i++) {
                        //递归调用
                        print(fileArray[i]);
                    }
                }
            }
            else{
                System.out.println(f);
            }
        }
    }

    public static void main(String[] args) {
        Recursion recursion=new Recursion();
        System.out.println( recursion.compute(5));
        System.out.println( recursion.recursionCompute(5));

        File file=new File("d:\\myfile");
        System.out.println(file.isFile());
        if(file.exists()){
            //deleteAllFile(file);
        }

        File tomcat=new File("D:\\javaconfig\\apache-tomcat-8.0.30");
        print(tomcat);
    }
}
