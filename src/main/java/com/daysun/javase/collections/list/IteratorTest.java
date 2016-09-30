package com.daysun.javase.collections.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Iterator
 * hasNext()  如果仍有元素可以迭代，则返回 true。
 * next()   返回迭代的下一个元素。
 * remove()  从迭代器指向的集合中移除迭代器返回的最后一个元素（可选操作）。
 */
public class IteratorTest {

    public static void main(String[] args) {
        List<String> list=new ArrayList<String>();
        list.add("A");
        list.add("b");
        list.add("c");


        System.out.println(list.size());//3
        System.out.println(list.contains("A"));//true


        List<String> list2=new ArrayList<String>();
        list2.add("b");
        list2.add("d");//list里没有这个

        System.out.println(list.containsAll(list2));//false
        /**
         * iterator()返回的是一个接口类型，iterator实际上返回的是iterator接口实现类的对象
         */
        Iterator<String> it=list.iterator();
     /*   while (it.hasNext()){
            //next返回当前指针的元素
            System.out.println("element: "+it.next());
        }
*/
        while (it.hasNext()){
            it.next();
            it.remove();
        }
        System.out.println(list);//[]


    }
}

