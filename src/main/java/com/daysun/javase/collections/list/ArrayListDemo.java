package com.daysun.javase.collections.list;


import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * |--List 元素有序（存入顺序和取出顺序一致），可重复
 * |--ArrayList  底层数据是数组，查询快，增删慢；线程不安全，效率高
 * |--Vector     底层数据是数组，查询快，增删慢；线程安全，效率低（一般不用）
 * |--LinkedList 底层数据是链表，查询慢，增删快；线程不安全，效率高
 * <p>
 * 一般使用谁呢：
 * 是否需要线程安全：
 * 是： Vector
 * 否：ArrayList 或 LinkedList
 * 增删多：LinkedList
 * 查询多：ArrayList
 * <p>
 * Collection
 * List 如果实现了List接口的集合类，该集合类：有序，可重复。
 * Set  无序，不可重复
 * 特有功能：
 * A:添加功能
 * void add(int index, Object obj):在指定位置添加给定元素。(掌握)
 * <p>
 * B:获取功能
 * Object get(int index):获取指定索引处的元素。(掌握)
 * int indexOf(Object o):获取指定元素在集合中第一次出现的索引，如果不存在，返回-1。
 * <p>
 * C:列表迭代器
 * ListIterator listIterator()
 * <p>
 * D:删除功能
 * Object remove(int index):删除指定索引处的元素，并返回该元素。(掌握)
 * <p>
 * E:修改功能
 * Object set(int index, Object obj):把指定索引位置的元素用给定的元素替换，并返回替换前的元素。(掌握)
 * <p>
 * F:截取功能
 * List subList(int fromIndex, int toIndex):从指定位置开始到指定位置结束截取List集合。
 */

/**
 * Collection
 * List 如果实现了List接口的集合类，该集合类：有序，可重复。
 * Set  无序，不可重复
 * 特有功能：
 * 		A:添加功能
 * 			void add(int index, Object obj):在指定位置添加给定元素。(掌握)
 *
 *   	B:获取功能
 *   		Object get(int index):获取指定索引处的元素。(掌握)
 *   		int indexOf(Object o):获取指定元素在集合中第一次出现的索引，如果不存在，返回-1。
 *
 *     	C:列表迭代器
 *     		ListIterator listIterator()
 *
 *     	D:删除功能
 *     		Object remove(int index):删除指定索引处的元素，并返回该元素。(掌握)
 *
 *      E:修改功能
 *      	Object set(int index, Object obj):把指定索引位置的元素用给定的元素替换，并返回替换前的元素。(掌握)
 *
 *      F:截取功能
 *      	List subList(int fromIndex, int toIndex):从指定位置开始到指定位置结束截取List集合。
 */


/**
 * 存储自定义对象，并遍历。泛型版。遍历用增强for。
 *
 * 遍历：
 * 		A:迭代器
 * 		B:增强for
 * 		C:普通for
 *
 * 		到底使用谁?
 * 			如果仅仅是为了遍历，请使用迭代器或者增强for。如果是自己开发，优先选择增强for。
 * 			如果在遍历的过程中，需要对索引有操作，那么，只能使用普通for。
 * 		注意：
 *  			A:JDK5以后出现增强for其实是为了替代迭代器。底层封装了迭代器。
 *   		B:用增强for一定要保证目标对象不为null。最好先判断不为null，然后在增强for。
 */

public class ArrayListDemo {

    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();

        list.add("A");
        list.add("b");
        list.add("D");
        list.add("e");
        list.add("A");
        list.add(new String("Hello"));
        //list.add(new Object());  // java.lang.Object@6ff3c5b5HelloAEDCbA 存的是内存地址 一般不这样用

        list.add(2, "C");

        System.out.println(list.isEmpty());//false

        System.out.println(list);   // [A, b, C, D, e, A]

        list.set(4, "E");
        System.out.println(list);   // [A, b, C, D, E, A]


        System.out.println(list.get(2)); //C

        // List subList(int fromIndex, int toIndex):从指定位置开始到指定位置结束截取List集合。
        List subList = list.subList(0, 2);
        System.out.println(subList); //[A, b]


        /**
         * hasPrevious() 判断是否存在上一个元素
         * previous()    当前指针先向上移动一个单位,然后再取出当前指针指向的元素
         * next() 先取出当前指针指向的元素，然后指针指向下一个单位
         */
        ListIterator it = list.listIterator();
        //正序遍历
        while (it.hasNext()) {
            System.out.print(it.next());
        }

        System.out.println("\n--------------------------------");
        //逆序遍历
        while (it.hasPrevious()) { //判断是否存在上一个元素
            System.out.print(it.previous());//当前指针先向上移动一个单位，然后再取出当前指针指向的元素
        }

        System.out.println("\n--------------------------------");
        for (int i = 0; i < list.size(); i++) {
            String s = (String) list.get(i);
            System.out.print(s);
        }


        //增强for
        System.out.println("\n------------for :--------------------");
        for (String s : list) {
            System.out.print(s);
        }

    }

    /**
     * 需求：遍历集合，如果集合中有world这个元素，我就在添加一个元素：android
     *
     * java.util.ConcurrentModificationException:当方法检测到对象的并发修改，但不允许这种修改时，抛出此异常。 并发修改异常。
     *
     * 这个时候，为什么会报错呢?
     * 回想一下，迭代器是怎么存在的。
     * 先有集合，才有迭代器，迭代器是依赖于集合而存在。
     * 而我们现在，是在使用迭代器的同时，通过集合去修改了集合元素。这个时候，集合的内部就发生了改变，
     * 而迭代器并不知道这些，所以，再次迭代的时候就报错了，错误的原因：你在用迭代器迭代的时候，用集合修改了集合中的元素。
     *
     * 解决问题方案：
     * A:用迭代器迭代，用迭代器修改集合元素
     * 		这个时候，元素是直接添加到查找的元素后面，不是在末尾处添加。
     * B:用集合遍历，用集合修改集合元素
     * 		这个时候，元素是在集合的末尾添加。
     *
     * 面试题：
     * 		你有没有听说过并发修改异常?如果有，请问在哪里见过?怎么产生的?怎么解决的?
     */
    @Test
    public void list1() {

        // 创建集合添加元素
        List list = new ArrayList();
        list.add("hello");
        list.add("world");
        list.add("java");

        //java.util.ConcurrentModificationException:当方法检测到对象的并发修改，但不允许这种修改时，抛出此异常。 并发修改异常。
        // java.util.ConcurrentModificationException

//        Iterator it = list.iterator();

//        while (it.hasNext()) { //这个循环走完后，并没有走上一句
//            String s = (String) it.next();
//            if ("world".equals(s)) {
//                list.add("android");
//            }
//        }


        // 方案1：用迭代器迭代，用迭代器修改集合元素 不是末尾添加
//        ListIterator lit = list.listIterator();
//        while (lit.hasNext()) {
//            String s = (String) lit.next();
//            if ("world".equals(s)) {
//                lit.add("android");  //[hello, world, android, java]
//            }
//        }


        // 方案2
        for (int x = 0; x < list.size(); x++) {
            String s = (String) list.get(x);
            if ("world".equals(s)) {     //末尾添加
                list.add("android");  //[hello, world, java, android]
            }
        }

        System.out.println(list);
    }


    /**
     * ArrayList是List的子类，所以：数据有序，可重复。
     * 需求：请在ArrayList里面存储多个字符串，并想办法去掉重复元素。
     */
    @Test
    public void removeRepeatEle() {
        ArrayList<String> array = new ArrayList<String>();
        array.add("hello");
        array.add("world");
        array.add("java");
        array.add("java");
        array.add("java");
        array.add("hello");
        array.add("world");
        array.add("java");
        array.add("hello");

        // 在遍历的时候，只看到三个元素：hello,world,java
        // 创建新集合
        ArrayList<String> array2 = new ArrayList<String>();

        for (String s : array) {
            if (!array2.contains(s)) {
                array2.add(s);
            }
        }

        for (String s : array2) {
            System.out.println(s);
        }
    }

    @Test
    public void removeRepeatEle2() {

        //在同一个集合上，按照选择排序的原理类似即可实现。
        ArrayList<String> array = new ArrayList<String>();
        array.add("hello");
        array.add("world");
        array.add("java");
        array.add("java");
        array.add("java");
        array.add("hello");
        array.add("world");
        array.add("java");
        array.add("hello");

        for (int i = 0; i < array.size() - 1; i++) {
            for (int j = i + 1; j < array.size(); j++) {
                if (array.get(j).equals(array.get(i))) {
                    array.remove(j);
                    j--;
                }
            }
        }

        for (String s : array) {
            System.out.println(s);
        }
    }
}
