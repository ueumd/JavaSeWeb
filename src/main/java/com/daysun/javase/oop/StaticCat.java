package com.daysun.javase.oop;

/**
 * static关键字
 * http://www.cnblogs.com/xdp-gacl/p/3637407.html
 */
public class StaticCat {

    //静态成员变量 （存放在数据区）
    private static int sid=0;

    //存放在堆中
    private String name;
    int id;

    StaticCat(String name){
        this.name=name;
        this.id=sid++;
    }

    public void info(){
        System.out.println("My Name is " + name + ",NO." + id);
    }

    //静态方法      StaticCat.say();
    private static void say(){
        System.out.println("miao miao");
    }

    public static void main(String[] args) {
        StaticCat.sid=100;
        StaticCat.say();

        StaticCat mimi=new StaticCat("mimi");
        StaticCat pipi=new StaticCat("pipi");
        mimi.info();
        pipi.info();

    }

}
