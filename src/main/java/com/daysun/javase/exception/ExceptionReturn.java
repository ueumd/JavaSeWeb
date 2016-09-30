package com.daysun.javase.exception;

/**
 * Created by Administrator on 2016/9/24.
 */
public class ExceptionReturn {
    /**
     * 如果try中存在return语句，那么首先也需要将finally块中的代码执行完毕，然后方法再返回
     * 如果有System.exit(0) 不会执行finally 因为会终止当前运行的Java虚拟机，程序会在虚拟机终止前结束执行
     */
    public void method(){
        try{
            System.out.println("hello");
            return;
        }catch (Exception e){
            e.printStackTrace();
        }finally{
            System.out.println("finally");
        }

        //try中有return 此处不会被执行
        System.out.println("异常处理后续的代码");
    }

    public static void main(String[] args) {
        ExceptionReturn er=new ExceptionReturn();
        er.method();
    }
}
