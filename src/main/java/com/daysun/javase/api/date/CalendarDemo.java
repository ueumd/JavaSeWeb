package com.daysun.javase.api.date;

import java.util.Calendar;
import java.util.Scanner;

/*
 * Calendar：表示一个日历抽象类。可以更精确的得到每一个日历字段。如果你想得到年月日，时分秒这样的数据，你可以把每个日历字段得到后自己做拼接。
 *
 * A:如何获取每一个日历字段对于的数据呢?
 * 		public int get(int field):返回给定日历字段的值
 * B:其他方法
 * 		public final void set(int year,int month,int date)
 * 		public abstract void add(int field,int amount):根据给定的日历字段及其对应的值改变数据。
 */
public class CalendarDemo {
    public static void main(String[] args) {
        Calendar rightNow = Calendar.getInstance(); // 右边得到的肯定是子类对象。

        // rightNow.add(Calendar.YEAR, 3);

        int year = rightNow.get(Calendar.YEAR);
        int month = rightNow.get(Calendar.MONTH);
        int date = rightNow.get(Calendar.DATE);

        int hour = rightNow.get(Calendar.HOUR);
        int minute = rightNow.get(Calendar.MINUTE);
        int second = rightNow.get(Calendar.SECOND);

        // String s = second > 9 ? second : "0" + second;

        // 2014年3月26日10:42:46

        StringBuilder sb = new StringBuilder();
        sb.append(year).append("年").append(month + 1).append("月").append(date)
                .append("日").append(hour).append(":").append(minute)
                .append(":").append(second > 9 ? second : "0" + second);

        System.out.println(sb.toString());

        // 需求：请根据我给定的年，判断这年的2月有多少天?
        Calendar c = Calendar.getInstance();

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入年份：");
        int y = sc.nextInt();

        c.set(y, 2, 1); // 这是y年的3月1日
        c.add(Calendar.DATE, -1); //三月一日的前一天

        int d = c.get(Calendar.DATE);
        System.out.println(d);
    }
}
