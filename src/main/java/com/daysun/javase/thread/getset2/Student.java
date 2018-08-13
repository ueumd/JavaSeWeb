package com.daysun.javase.thread.getset2;

public class Student {
    private String name;
    private int age;
    private boolean flag = false; // 如果这个标记是true，就表示有数据。是false，就表示没有数据。

    public synchronized void set(String name, int age) {
        if (this.flag) {
            try {
                this.wait(); // t1等待了。t2醒的，所以，t2抢到了。
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        this.name = name;
        this.age = age;

        // 有数据就改标记
        this.flag = true;
        this.notify();
    }

    public synchronized void get() {
        if (!this.flag) {
            try {
                this.wait(); // t2等待了,t1抢到了
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println(this.name + "---" + this.age);

        // 修改标记
        this.flag = false;
        this.notify();
    }
}
