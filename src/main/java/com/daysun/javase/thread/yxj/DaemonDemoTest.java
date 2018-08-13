package com.daysun.javase.thread.yxj;

/*
 * public final void setDaemon(boolean on):守护线程。
 *
 *
 * 举例：
 * 		坦克大战。
 * 		大本营是一只老鹰，有两个坦克。
 */
public class DaemonDemoTest {
    public static void main(String[] args) {
        DaemonDemo dd = new DaemonDemo();

        Thread t1 = new Thread(dd, "张双良");
        Thread t2 = new Thread(dd, "孙俪");

        t1.setDaemon(true);
        t2.setDaemon(true);

        t1.start();
        t2.start();

        for (int x = 0; x < 10; x++) {
            System.out.println(Thread.currentThread().getName() + "---" + x);
        }
    }
}