package com.daysun.javase.thread.lock;

/*
 * 思路：
 * 		就是多个线程使用多把锁，相互等待。
 * 死锁代码：
 */
public class DeadLock extends Thread {
    private boolean flag;

    public DeadLock(boolean flag) {
        this.flag = flag;
    }

    @Override
    public void run(){
        // t1-true,t2-false
        if(flag) {
            synchronized (MyLock.objA) {
                System.out.println("if objA");// t2抢到了执行权
                synchronized (MyLock.objB) {
                    System.out.println("if objB");
                }
            }
        } else {
            synchronized (MyLock.objB) {
                System.out.println("else objB");// t1抢到了执行权，或者t2继续
                synchronized (MyLock.objA) {
                    System.out.println("else objA");
                }
            }
        }
    }

    /**
     * else objB
     * else objA
     * if objA
     * if objB
     */
}
