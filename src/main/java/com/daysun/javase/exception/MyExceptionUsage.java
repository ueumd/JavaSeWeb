package com.daysun.javase.exception;

/**
 * Created by Administrator on 2016/9/24.
 */
public class MyExceptionUsage {
    public void methodTo(String str) throws MyException, MyException2 {
        if (null == str) {
            throw new MyException("传入的字符串参数不能为空");
        } else if ("hello".equals(str)) { //将常量放在前面
            throw new MyException2("传入的字符串参数不能为hello");
        } else {
            System.out.println(str);
        }
    }

    public static void main(String[] args) throws MyException, MyException2 {
        //第二种
     /*   MyExceptionUsage test=new MyExceptionUsage();
        test.methodTo("hello");*/

        //第一种 每一个catch捕获一个异常
        try {
            MyExceptionUsage test = new MyExceptionUsage();
            test.methodTo("hello");
        } catch (MyException e) {
            System.out.println("MyException");
            e.printStackTrace();
        } catch (MyException2 e) {
            System.out.println("MyException2");
            e.printStackTrace();
        } finally {
            System.out.println("异常处理完毕");
        }
        System.out.println("程序出理完毕");

    }
}
