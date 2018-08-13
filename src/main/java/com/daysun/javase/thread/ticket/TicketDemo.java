package com.daysun.javase.thread.ticket;
/*
 * 格式：
 * 		synchronized(对象锁) {
 * 			需要被锁的代码。
 * 		}
 *
 * 问题：同步代码快的锁对象可以是什么?
 * 		同步代码块的锁对象是任意对象。
 *
 * 同步方法：
 * 		在方法上面加锁关键字。
 *
 * 同步方法的锁对象是谁呢?
 * 		this对象。
 *
 * 静态方法的锁是谁呢?
 * 		是当前类的字节码文件对象。
 * 		Ticket.class
 *
 * Class getClass()
 * Class 数据类型.class静态属性得到也是该数据类型对应的字节码文件对象。
 */
public class TicketDemo {
    public static void main(String[] args) {
        Ticket t = new Ticket();

        Thread t1 = new Thread(t, "窗口1");
        Thread t2 = new Thread(t, "窗口2");
        Thread t3 = new Thread(t, "窗口3");


        t1.start();
        t2.start();
        t3.start();
    }
}
