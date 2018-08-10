package com.daysun.javase.collection.list;

import java.util.LinkedList;

/**
 * 查询慢 增册快
 * LinkedList的特有功能：
 * 		A:添加功能
 * 			void addFirst(Object e)
 *			void addLast(Object e)
 * 		B:删除功能
 * 			Object removeFirst()
 * 			Object removeLast()
 * 		C:获取功能
 * 			Object getFirst()
 * 			Object getLast()
 *
 *
 */
public class LinkedListDemo {
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
