package com.daysun.javase.api.date;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


/*
 * DateFormat:在String和Date间进行转换的抽象类。
 *
 * String -- Date
 * 		public Date parse(String source)
 * 		注意：你要解析成的模式字符串一定要和字符串本身匹配。
 *
 * Date -- String
 * 		public final String format(Date date)
 * 		注意：你需要什么格式，就应该给出什么格式化的模式字符串。
 */
public class DateFormatDemo {
    public static void main(String[] args) throws ParseException {
        // 创建日期
        Date d = new Date();
        String str = dateToString(d, "yyyy年MM月dd日 HH:mm:ss");
        System.out.println(str);

        //创建一个字符串
        String s = "2014-03-06 10:04:22";
        Date dd =  stringToDate(s,"yyyy-MM-dd HH:mm:ss");
        System.out.println(dd);
    }

    public static Date stringToDate(String str,String format) throws ParseException {
        // String s = "2014-03-06 10:04:22";
        // //System.out.println(s);
        // //public Date parse(String source)
        // SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        // Date dd = sdf.parse(s);
        // System.out.println(dd);
        return new SimpleDateFormat(format).parse(str);
    }

    public static String dateToString(Date date, String format) {
        // // Date -- String
        // // 创建一个日期对象
        // Date d = new Date();
        // // 格式化
        // // public final String format(Date date)
        // // SimpleDateFormat()
        // // DateFormat df = new SimpleDateFormat(); //多态
        // // SimpleDateFormat sdf = new SimpleDateFormat(); // 用默认的模式 //
        // 14-3-26
        // // 上午9:52
        // // 用给定模式
        // // SimpleDateFormat(String pattern)
        // SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        // // 模式我不会给
        // String str = sdf.format(d);
        // System.out.println(str);

        // SimpleDateFormat sdf = new SimpleDateFormat(format);
        // return sdf.format(date);
        return new SimpleDateFormat(format).format(date);
    }
}