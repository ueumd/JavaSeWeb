package com.daysun.javase.collections.list;

import java.util.LinkedList;

/**
 * Created by Administrator on 2016/9/25.
 *
 * 查询慢 增册快
 */
public class CollectionListLinkedList {
    public static void main(String[] args) {
        LinkedList<String> list=new LinkedList<String>();
        list.add("A");
        list.add("b");
        list.add("c");
        list.add("A");

        list.addFirst("狗娃");
        list.addLast("狗蛋");

        System.out.println(list.getFirst());
        System.out.println(list);
        //栈（先进后出）
        /*list.push();
        list.pop();*/

        //队列(先进先出)
       /* list.offer();
        list.poll();*/


    }
}
