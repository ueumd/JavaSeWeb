package com.daysun.javase.api.date;

import java.util.Date;

/*
 * Date：表示日期类，可以精确到毫秒。
 *
 * A:构造方法
 * B:通过日期得到毫秒值
 * C:把一个毫秒值转换成日期
 */
public class DateDemo {
    public static void main(String[] args) {
        //构造方法
        //Date()
        //Date(long date)
        Date d = new Date();
        System.out.println(d);

        //Date d2 = new Date(1000000000000L);
        //System.out.println(d2);

        //通过日期得到毫秒值
        //public long getTime()
        //long time = d.getTime();
        //1395797615168
        //System.out.println(time);

        //把毫秒值转换成日期
        Date d2 = new Date(1395797615168L);
        System.out.println(d2);

    }
}
