package com.daysun.javase.api.system;

/*
 * System:系统类，提高了静态的成员供我们使用。
 *
 * public static void gc():运行垃圾回收器。
 * public static void exit(int status):终止当前正在运行的 Java 虚拟机。参数用作状态码；根据惯例，非 0 的状态码表示异常终止。
 * public static long currentTimeMillis():返回以毫秒为单位的当前时间。
 *
 * 自学：
 * 		public static void arraycopy(Object src,int srcPos,Object dest,int destPos,int length)
 * 		并写一个测试类。
 */
public class SystemDemo {
    public static void main(String[] args) {
        // 请问我想知道我的一段代码的执行时间，怎么办?
        long start = System.currentTimeMillis();

        for (int x = 0; x < 100000; x++) {
            System.out.println(x);
        }

        long end = System.currentTimeMillis();
        System.out.println((end - start) + "毫秒");
    }
}
