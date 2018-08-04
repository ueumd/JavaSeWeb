package com.daysun.javase.adv.proxy;

/**
 * Created by Administrator on 2016/9/26.
 */
public class Client {
    public static void main(String[] args) {
        Subject subject=new ProxySubject();

        subject.request();
    }
}
