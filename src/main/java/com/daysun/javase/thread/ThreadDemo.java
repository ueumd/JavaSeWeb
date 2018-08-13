package com.daysun.javase.thread;

import org.junit.Test;

/*
 * 通过查看API，我们知道，实现多线程程序有两种方案：
 * 方案1步骤：
 * 		A:自定义类继承Thread类
 * 		B:重写run()方法
 * 		C:创建自定义类对象
 * 		D:调用start()方法
 *
 * 通过查看结果，我们倒是看到了多线程效果。
 * 但是，我们不知道到底是谁执行了哪些数据?
 * 请问怎么才能知道?
 * 我们通过名字进行区分。
 * 获取线程名称功能：
 * 		public final String getName()：获取线程名称
 * 			默认名称：
 * 				Thread-编号。从0开始。
 * 		public final void setName(String name)：改变线程名称
 */
public class ThreadDemo {
    public static void main(String[] args) {
        // 创建两个线程对象
        MyThread my1 = new MyThread();
        MyThread my2 = new MyThread();

        my1.setName("林青霞");
        my2.setName("刘意");

        // my1.run();
        // my2.run();
        my1.start();
        my2.start();
    }

    @Test
    public void th1(){
        // 创建自定义类对象。
        MyRunnable my = new MyRunnable();

        // 创建Thread类对象。在创建过程中，把自定义类对象作为构造参数传递。
        Thread t1 = new Thread(my, "杨龙好");
        Thread t2 = new Thread(my, "苏晓霞");

        // set赋值
        // t1.setName("烧饼女神");
        // t2.setName("赵鹏冲");

        t1.start();
        t2.start();
    }
}
