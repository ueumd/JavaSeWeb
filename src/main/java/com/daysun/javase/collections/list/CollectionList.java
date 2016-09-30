package com.daysun.javase.collections.list;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
 *Collection
 *  List 如果实现了List接口的集合类，该集合类：有序，可重复。
 *  Set  无序，不可重复
 */
public class CollectionList {

    public static void main(String[] args) {
        List<String > list=new ArrayList<String>();

        list.add("A");
        list.add("b");
        list.add("c");
        list.add("A");

        list.add(2,"z");

        System.out.println(list.isEmpty());//false

        System.out.println(list);

        list.set(3,"C");// [A, b, z, C, A]


        System.out.println(list);
        System.out.println(list.get(2));

        /**
         * hasPrevious() 判断是否存在上一个元素
         * previous()    当前指针先向上移动一个单位,然后再取出当前指针指向的元素
         *
         * next() 先取出当前指针指向的元素，然后指针指向下一个单位
         *
         */


        ListIterator it=list.listIterator();
        //正序遍历
        while (it.hasNext()){
            System.out.println(it.next());
        }

        System.out.println("--------------------------------");
        //逆序遍历
        while (it.hasPrevious()){ //判断是否存在上一个元素
            System.out.println(it.previous());//当前指针先向上移动一个单位，然后再取出当前指针指向的元素

        }

    }
}
