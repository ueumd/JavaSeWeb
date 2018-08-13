package com.daysun.javase.thread.getset;

public class SetThread implements Runnable {
    private Student s;
    public SetThread(Student s){
        this.s = s;
    }

    @Override
    public void run (){
        // Student s = new Student(); //如果在这里，那么，这个线程和另外的一个线程使用的资源不是同一个
        int x = 0;
        while (true) {
            // 同一种类的锁
            synchronized (s) {
                //如果有数据，就等待。
                if(s.flag) {
                    try {
                        s.wait();//t1等待了。t2醒的，所以，t2抢到了。
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                if(x%2 == 0) {
                    s.name = "刘意";
                    s.age = 30;
                } else {
                    s.name = "林青霞";
                    s.age = 27;
                }

                //有数据就改标记
                s.flag = true;
                s.notify();
            }
            x ++;
        }
    }
}
