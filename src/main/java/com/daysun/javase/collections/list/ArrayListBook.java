package com.daysun.javase.collections.list;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * ArrayList默认为10的数组
 * 底层维护了一个Object数组，使用无参构造函数，Object容量默认为10
 * 当长度不够时，增动增长0.5倍
 *
 * 查询快 增删慢
 */
public class ArrayListBook {

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


    /**
     * 存储自定义对象并去掉重复值。
     * 需求：如果一个对象的成员和另一个对象的成员完全相同，我们则认为它是同一个对象。
     *
     * 这是时候，我们发现居然没有满足我们的需求，请问为什么呢?
     * 通过分析，我们最终定位到了contains方法。
     * 这个时候，我们应该去学习contains方法的源码，看看它到底怎么比较的。
     * 最终我们通过查看源码,发现contains方法底层依赖于equals方法。
     * 而学生类中默认的equals是继承自Object类。默认比较的是地址值。
     * 每一个对象都是new出来的，所以地址值肯定不同。所以它们全部都是不同的。就添加到集合中了。
     * 那么，我们该怎么办?
     * 回想我们的需求，发现我们要比较的是成员的内容，而不是对象的地址值。所以我们只需要重写equals比较内容即可。
     *
     * 通过这道题目我想告诉大家：contains是依赖于equals方法。
     * 很多时候，如果我们想要完成某个动作，却发现我们调用JDK提供方法后和我们想要的效果不太一样，那么，我们就应该查看源码。看看源码到底依赖于什么。
     */
    @Test
    public void removeRepeat(){
        // 创建集合对象
        ArrayList<Student> array = new ArrayList<Student>();

        // 创建元素对象
        Student s1 = new Student("貂蝉", 18);
        Student s2 = new Student("大乔", 27);
        Student s3 = new Student("小乔", 20);
        Student s4 = new Student("蔡文姬", 22);
        Student s5 = new Student("大乔", 27);
        Student s6 = new Student("大乔", 17);
        Student s7 = new Student("貂蝉", 27);

        // 把元素添加到集合
        array.add(s1);
        array.add(s2);
        array.add(s3);
        array.add(s4);
        array.add(s5);
        array.add(s6);
        array.add(s7);

        // 新建一个集合对象
        ArrayList<Student> arr = new ArrayList<Student>();
        // 遍历旧集合
        for (Student s : array) {
            // 判断s是否在arr中存在，如果是，就不添加，如果不是，就添加。 重写了equals方法
            if (!arr.contains(s)) {
                arr.add(s);
            }
        }

        // 遍历集合
        for (Student s : arr) {
            System.out.println(s.getName() + "---" + s.getAge());
        }
    }
}

