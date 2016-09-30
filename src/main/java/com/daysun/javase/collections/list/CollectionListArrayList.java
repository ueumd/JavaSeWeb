package com.daysun.javase.collections.list;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * ArrayList默认为10的数组
 * 底层维护了一个Object数组，使用无参构造函数，Object容量默认为10
 * 当长度不够时，增动增长0.5倍
 *
 * 查询快 增删慢
 */
public class CollectionListArrayList {

    public static void main(String[] args) {
        ArrayList<Book> list=new ArrayList<Book>();

        list.add(new Book(100,"JAVA编程思想"));
        list.add(new Book(104,"JAVA web"));
        list.add(new Book(106,"JAVA sql"));
        list.add(new Book(100,"JAVA编程思想2"));

        ArrayList list2=clearRepeat(list);
        System.out.println("new element: "+list2);
    }

    public static ArrayList clearRepeat(ArrayList list){
        ArrayList<Object> newList=new ArrayList<Object>();
        Iterator it=list.iterator();
        while (it.hasNext()){
            Book book=(Book) it.next();
            //要重写Book的equals方法
            if(!newList.contains(book)){
                newList.add(book);
            }
        }

        return newList;
    }
}

class Book{
    int id;
    String name;
    public  Book(int id,String name){
        this.id=id;
        this.name=name;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;

        Book book = (Book) o;

        return this.id==book.id;
    }

}