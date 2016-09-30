package com.daysun.javase.generics.base;

import java.util.*;

/**
 * Created by Administrator on 2016/9/27.
 */
public class Wildcard {

    /**
     * 问题：定义一个方法，该方法可以打印出任意参数化类型的集合中的所有数据，该方法如何定义呢？
     * 总结：使用?通配符可以引用其他各种参数化的类型，?通配符定义的变量主要用作引用，可以调用与参数无关的方法，不能调用与参数有关的方法
     */
    public static void printCollect(Collection<?> collection) {
        for (Object obj : collection) {
            System.out.println(obj);
        }
    }

    /**
     * 1.限定通配符?的上边界
     *  正确的写法：Vector<? extends Number> x = new Vector<Integer>();
     *  这里指的是?所代表的参数化类型必须是继承Number类的，如这里的?所代表的Integer类型就是继承Number类的
     *
     * 2限定通配符?的下边界
        正确的写法：Vector<? super Integer> y = new Vector<Number>();
     　  这里指的是?所代表的参数化类型必须是Integer类的父类，如这里的?所代表的Number类型就是Integer类的父类
     */
    public static  void printCollect2(Collection<? extends Integer> collection){
        for (Object obj : collection) {
            System.out.println(obj);
        }
    }

    public static void main(String[] args) {
        Collection<String>collection=new ArrayList();
        collection.add("Abc");
        printCollect(collection);

        Collection<Integer> collection1=new ArrayList<Integer>();
        collection1.add(100);
        printCollect(collection1);


        Collection list=new ArrayList();

        list.add(12360000);
        list.add(123);
        printCollect2(list);


        /**
         * 泛型的综合应用
         */
        HashMap<String,String> maps=new HashMap<String, String>();

        maps.put("上海","021");
        maps.put("北京","010");

        Set<Map.Entry<String,String>> entrySet=maps.entrySet();
        // 使用增强的for循环迭代Map容器中的key和value
        // 这里的Entry是Map类的一个内部类，map类中存储的key和value都是封装在这个Entry内部类中的
        //这个Entry内部类提供了getKey方法取出键，getValue方法取出值

        for(Map.Entry<String,String> entry:entrySet){
            System.out.println(entry.getKey()+" ----- "+entry.getValue());
        }

    }
}
