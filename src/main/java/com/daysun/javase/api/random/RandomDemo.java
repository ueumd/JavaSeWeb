package com.daysun.javase.api.random;
import java.util.Random;

/*
 * Random:是产生随机数的类。跟种子相关。
 *
 * 构造方法：
 * 		Random():没有给种子产生随机数,默认种子是当前时间的毫秒值。
 *		Random(long seed)：给定种子产生随机数。如果种子相同，那么， 将产生相同的随机数。
 *
 * 要掌握的功能：
 * 		public int nextInt()：int范围内的随机数。
 * 		public int nextInt(int n)：获取的是[0,n)之间的随机数。
 */
public class RandomDemo {
    public static void main(String[] args) {
        // 不给种子
        // Random r = new Random();
        // 给种子
        Random r = new Random(250);

        // 表示我要生成10个[0,100)之间的随机数
        for (int x = 0; x < 10; x++) {
            System.out.println(r.nextInt(100));
        }
    }
}
