package com.daysun.javase.thread.lock;

public class DeadLockDemo {
    public static void main(String[] args) {
        DeadLock d1 = new DeadLock(true);
        DeadLock d2 = new DeadLock(false);

        d1.start();
        d2.start();
    }
}
