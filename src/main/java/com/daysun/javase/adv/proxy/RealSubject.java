package com.daysun.javase.adv.proxy;

/**
 * Created by Administrator on 2016/9/26.
 */
public class RealSubject extends Subject{
    public void request(){
        System.out.println("From real subject.");
    }
}
