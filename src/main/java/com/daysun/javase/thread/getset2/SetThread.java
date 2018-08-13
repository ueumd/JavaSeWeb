package com.daysun.javase.thread.getset2;
public class SetThread implements Runnable {

    private Student s;

    public SetThread(Student s) {
        this.s = s;
    }

    @Override
    public void run() {
        // Student s = new Student(); //如果在这里，那么，这个线程和另外的一个线程使用的资源不是同一个
        int x = 0;
        while (true) {
            if (x % 2 == 0) {
                s.set("刘意", 30);
            } else {
                s.set("林青霞", 27);
            }
            x++; // t1继续。x=1，
        }
    }

}