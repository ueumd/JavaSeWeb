package com.daysun.javase.javaenum;

/**
 * Created by Administrator on 2016/9/26.
 */
public class EnumColor {
    public static void main(String[] args) {
        Color color=Color.Red;
        System.out.println(color);

        for(Color color1:Color.values()){
            System.out.println(color1);
        }
    }
}

