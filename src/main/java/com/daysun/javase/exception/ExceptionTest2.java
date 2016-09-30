package com.daysun.javase.exception;

/**
 * Created by Administrator on 2016/9/24.
 */
public class ExceptionTest2 {
    //第2种方式处理
    public void method() throws Exception{
        System.out.println("hello world");

        throw new Exception();//执行完抛出异常
    }

    public static void main(String[] args) {
        ExceptionTest2 test=new ExceptionTest2();
        //如果main不 throws Exception则会报错 第2种
      //  test.method();

        //第1种方式
        try{
            test.method();
        }catch(Exception e){
            e.printStackTrace();
        }finally {
            System.out.println("aaa");
        }

    }
}
