package com.daysun.javase.thread;
/*
 * 为什么要继承Thread类?
 * 因为继承类Thread类以后，我的自定义类就是一个线程类。
 *
 * 为什么要重写run()方法?
 * 因为我们自己的哪些代码需要被多线程执行，Java设计者在一开始并不清楚。
 * 它就得提供一个入口，让我们自己去写我们需要被多线程执行的代码。
 * 那么，这个入口方法就是run()。
 * 也就是说run()方法里面封装的其实是被多线程执行的代码。
 *
 * 为什么要调用start()方法呢?
 * 因为start()方法，它首先的作用，就是启动线程，其次才是自动调用run()方法。
 *
 * 面试题：
 * 启动线程调用的是run()还是start()?
 * 		start()
 * run()和start()方法的区别?
 * 		直接使用run()仅仅是普通方法的调用。
 * 		start()做了两件事情：启动线程，自动调用run()。
 */
public class MyThread extends Thread{
    @Override
    public void run () {
        for(int x = 0;x<100;x++){
            System.out.println(getName() + "--------" + x);
        }
    }
}
