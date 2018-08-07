package com.daysun.javase.collections.list;

import java.util.Enumeration;
import java.util.Vector;

/*
 * Vector的特有功能：
 * 		A:添加元素
 * 			public void addElement(Object obj)		--add(Object obj)
 * 		B:获取元素
 * 			public Object elementAt(int index)		--get(int index)
 * 			public Enumeration elements()			--iterator()
 * 					hasMoreElements						--hasNext()
 * 					nextElement							--next()
 * 		C:长度功能
 * 			public int size()
 */
public class VectorDemo {
    public static void main(String[] args) {
        // 创建集合对象
        Vector v = new Vector();

        // 创建并添加元素
        v.addElement("hello");
        v.addElement("world");
        v.addElement("java");

        // 遍历
        for (int x = 0; x < v.size(); x++) {
            String s = (String) v.elementAt(x);
            System.out.println(s);
        }

        System.out.println("--------------");
        // public Enumeration elements()
        Enumeration en = v.elements();
        while (en.hasMoreElements()) {
            String s = (String) en.nextElement();
            System.out.println(s);
        }

    }
}
