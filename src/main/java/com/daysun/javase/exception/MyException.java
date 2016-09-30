package com.daysun.javase.exception;

/**
 * Created by Administrator on 2016/9/24.
 * 自定义异常
 */
public class MyException extends Exception {
    public MyException(){
        super();
    }

    public MyException(String message){
        super(message);
    }
}
