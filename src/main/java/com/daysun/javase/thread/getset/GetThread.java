package com.daysun.javase.thread.getset;

public class GetThread implements Runnable  {

    private Student s;

    public GetThread(Student s) {
        this.s = s;
    }

    @Override
    public void run(){
        while (true) {
           synchronized (s) {
               if (!s.flag) {
                   try {
                       s.wait();// t2等待了,t1抢到了
                   } catch (InterruptedException e) {
                       e.printStackTrace();
                   }
               }
               System.out.println(s.name + "------" + s.age);

               // 修改标记
               s.flag = false;
               s.notify();
           }
        }
    }

}
