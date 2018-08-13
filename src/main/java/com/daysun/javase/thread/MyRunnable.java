package com.daysun.javase.thread;

/*
 * 1：这种情况下，如何获取线程名称呢？
 * public static Thread currentThread():返回当前正在执行的线程对象。
 */
public class MyRunnable implements Runnable {

    @Override
    public void run() {
        for (int x = 0; x < 100; x++) {
            System.out.println(Thread.currentThread().getName() + "---" + x);
        }
    }

}
