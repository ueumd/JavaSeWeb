package com.daysun.javase.thread.ticket;

public class Ticket implements Runnable {
    class Demo {
    }

    private static int tickets = 100;
    private Object ojb = new Object();
    private Demo d = new Demo();
    private int x = 0;

    @Override
    public void run() {
        while (true) {
            if (x % 2 == 0) {
                synchronized (Ticket.class) {
                    send();
                }
            } else {
                sendTicket();
            }
            x ++;
        }
    }

    private static synchronized void sendTicket() {
      send();
    }

    private static void send() {
        if (tickets > 0) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "正在出售第"
                    + (tickets--));
        }
    }
}


