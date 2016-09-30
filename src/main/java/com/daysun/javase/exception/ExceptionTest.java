package com.daysun.javase.exception;

/**
 * Created by Administrator on 2016/9/24.
 * checked exception
 * unchecked exception
 */
public class ExceptionTest {
    public static void main(String[] args) {
        int c=0;
        try {
            int a=3;
            int b=0;
            c=a/b; //如果b=0时这句会有异常的,如果有后面语不会被执行,进入
            //catch和finally

            //如果上面有异常，这句是不会执行的
            System.out.println("is Exception");
        }
        //有执行catch没有不执行
        catch (ArithmeticException e){
            //如果出现异常会抛出
            e.printStackTrace();
        }finally {
            //不管有没有异常这里都会被执行
            System.out.println("final welcome");
        }

        System.out.println(c);
    }
}
