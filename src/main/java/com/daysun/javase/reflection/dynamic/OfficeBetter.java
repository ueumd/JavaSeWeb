package com.daysun.javase.reflection.dynamic;

/**
 * Created by Administrator on 2016/9/23.
 */
public class OfficeBetter {
    public static void main(String[] args) {
        try {
            Class c=Class.forName(args[0]);
            OfficeAble oa=(OfficeAble)c.newInstance();
            oa.start();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
