package com.daysun.javase.thread.yxj;


/*
 * 线程优先级：
 * public final void setPriority(int newPriority)
 * public final int getPriority()
 *
 * 线程默认优先级是：5
 * 线程优先级范围是：1-10
 *
 * 线程的优先级，一般情况下效果不大。
 * 在次数特别多的情况下，线程优先级高的对象可能比线程优先级的先获取到执行权。
 */
public class PriorityDemoTest {
    public static void main(String[] args) {
        PriorityDemo pd = new PriorityDemo();

        Thread t1 = new Thread(pd, "甄姬");
        Thread t2 = new Thread(pd, "曹丕");
        Thread t3 = new Thread(pd, "曹操");

        // public final int getPriority()

        //默认优先级是5
         System.out.println(t1.getPriority()); //5
         System.out.println(t2.getPriority()); //5
         System.out.println(t3.getPriority()); //5

        // public final void setPriority(int newPriority)
        // IllegalArgumentException:参数不合法。
        // t1.setPriority(1000000);

        t1.setPriority(10);
        t3.setPriority(1);

        t1.start();
        t2.start();
        t3.start();
    }
}
