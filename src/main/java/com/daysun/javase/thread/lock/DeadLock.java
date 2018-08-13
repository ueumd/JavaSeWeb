package com.daysun.javase.thread.lock;

/*
 * ˼·��
 * 		���Ƕ���߳�ʹ�ö�������໥�ȴ���
 * �������룺
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
                System.out.println("if objA");// t2������ִ��Ȩ
                synchronized (MyLock.objB) {
                    System.out.println("if objB");
                }
            }
        } else {
            synchronized (MyLock.objB) {
                System.out.println("else objB");// t1������ִ��Ȩ������t2����
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
