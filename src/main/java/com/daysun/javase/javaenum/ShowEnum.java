package com.daysun.javase.javaenum;

/**
 * Created by Administrator on 2016/9/26.
 */
public class ShowEnum {
    public static void main(String[] args) {
        enumCompareTo(OpConstant.valueOf(args[0]));


        for (OpConstant c : OpConstant.values()) {
            System.out.printf("%d,%s,%n", c.ordinal(), c);
        }

    }

    public static void enumCompareTo(OpConstant opConstant) {
        System.out.println(opConstant);

        for (OpConstant c : OpConstant.values()) {
            System.out.println(opConstant.compareTo(c));
        }
    }
}
