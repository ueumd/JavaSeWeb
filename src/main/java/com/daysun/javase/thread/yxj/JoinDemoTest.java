package com.daysun.javase.thread.yxj;

/*
 * public final void join():等待该线程终止。
 * 其他线程必须等待，加入线程执行完毕后才能执行。
 * 注意：加入线程是必须在开启后做的动作。
 */
public class JoinDemoTest {
    public static void main(String[] args) {
        JoinDemo jd = new JoinDemo();

        Thread t1 = new Thread(jd, "杨幂");
        Thread t2 = new Thread(jd, "文章");
        Thread t3 = new Thread(jd, "杨龙好");

        // 顺序不能错了 没有开启，就没有加入
        t3.start();
        try {
            t3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        t1.start();
        t2.start();
        // t3.start();
    }
}