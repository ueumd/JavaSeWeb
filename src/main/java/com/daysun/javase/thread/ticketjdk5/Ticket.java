package com.daysun.javase.thread.ticketjdk5;


import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/*
 * JDK5以后的新同步操作。
 *
 * JDK5以后的操作有一个接口和一个类：
 *      lock
 *      ReentrantLock
 */
public class Ticket implements Runnable{
    private int tickets = 100;
    private Object obj = new Object();

    //创建锁对象
    private Lock ck = new ReentrantLock();

    @Override
    public void run() {
        while (true) {
            // 获取锁
            ck.lock();
            try {
                if (tickets > 0) {
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                        System.out.println(e);
                    }
                    System.out.println(Thread.currentThread().getName() + "正在出售第" + (tickets--));
                }
            } finally {
                // 释放锁
                ck.unlock();
            }
        }
    }

}
