package com.daysun.javase.collections.set;

import java.util.TreeSet;

/**
 *  TreeSet   如果元素具备自然顺序 的特性，那么就按照元素自然顺序的特性进行排序存储。
 *
 *  treeSet添加自定义元素:

 treeSet要注意的事项：
 1. 往TreeSet添加元素的时候，如果元素本身具备了自然顺序的特性，那么就按照元素自然顺序的特性进行排序存储。
 2. 往TreeSet添加元素的时候，如果元素本身不具备自然顺序的特性，那么该元素所属的类必须要实现Comparable接口，
    把元素的比较规则定义在compareTo(T o)方法上。

 3. 如果比较元素的时候，compareTo方法返回的是0，那么该元素就被视为重复元素，
    不允许添加.(注意：TreeSet与HashCode、equals方法是没有任何关系。)

 4. 往TreeSet添加元素的时候, 如果元素本身没有具备自然顺序的特性，而元素所属的类也没有实现Comparable接口，
    那么必须要在创建TreeSet的时候传入一个比较器。

 5.  往TreeSet添加元素的时候，如果元素本身不具备自然顺序的特性，而元素所属的类已经实现了Comparable接口，
    在创建TreeSet对象的时候也传入了比较器那么是以比较器的比较规则优先使用。

 如何自定义定义比较器： 自定义一个类实现Comparator接口即可，把元素与元素之间的比较规则定义在compare方法内即可。

 自定义比较器的格式 ：

 class  类名  implements Comparator{

 }

 推荐使用：使用比较器(Comparator)。
 *
 */
public class TreeSetTest {
//    public static void main(String[] args) {
//        TreeSet<String > ts=new TreeSet<String>();
//        ts.add("z");
//        ts.add("x");
//        ts.add("a");
//        ts.add("c");
//
//        System.out.println(ts);//[a, c, x, z]
//
//        TreeSet tree = new TreeSet();
//
//     /*   tree.add(new Emp(110, "老陆", 100));
//        tree.add(new Emp(113, "老钟", 200));
//        tree.add(new Emp(220, "老汤", 300));
//        tree.add(new Emp(120, "老蔡", 500));*/
//
//        tree.add(new Person(100,"AAAa"));
//        tree.add(new Person(130,"bbb"));
//        tree.add(new Person(120,"cccc"));
//        System.out.println("集合的元素："+tree);
//    }
}
