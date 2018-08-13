package com.daysun.javase.thread.yxj;

public class DaemonDemo implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println(Thread.currentThread().getName() + "---" + i);
        }
    }

}