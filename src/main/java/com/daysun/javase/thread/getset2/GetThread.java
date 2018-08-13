package com.daysun.javase.thread.getset2;
public class GetThread implements Runnable {

    private Student s;

    public GetThread(Student s) {
        this.s = s;
    }

    @Override
    public void run() {
        // Student s = new Student();
        while (true) {
            s.get();
        }
    }

}
