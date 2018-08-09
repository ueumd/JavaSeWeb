package com.daysun.javase.collections.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * 集合 的体系：
 * ------------| Collection 单例集合的根接口
 * ----------------| List  如果是实现了List接口的集合类，具备的特点： 有序，可重复。
 * -------------------| ArrayList  ArrayList 底层是维护了一个Object数组实现的。 特点： 查询速度快，增删慢。
 * -------------------| LinkedList LinkedList 底层是使用了链表数据结构实现的， 特点： 查询速度慢，增删快。
 * -------------------| Vector(了解即可)  底层也是维护了一个Object的数组实现的，实现与ArrayList是一样的，但是Vector是线程安全的，操作效率低。
 * <p>
 * ----------------| Set  如果是实现了Set接口的集合类，具备的特点： 无序，不可重复。
 * -------------------| HashSet  底层是使用了哈希表来支持的，特点： 存取速度快.
 * <p>
 * hashSet的实现原理：
 * 往Haset添加元素的时候，HashSet会先调用元素的hashCode方法得到元素的哈希值 ，
 * 然后通过元素 的哈希值经过移位等运算，就可以算出该元素在哈希表中 的存储位置。
 * <p>
 * 情况1： 如果算出元素存储的位置目前没有任何元素存储，那么该元素可以直接存储到该位置上。
 * <p>
 * 情况2： 如果算出该元素的存储位置目前已经存在有其他的元素了，那么会调用该元素的equals方法与该位置的元素再比较一次
 * 如果equals返回的是true，那么该元素与这个位置上的元素就视为重复元素，不允许添加，如果equals方法返回的是false，那么该元素运行 添加。
 */

/**
 * 需求：存储自定义对象，并去掉重复值。
 * 同一个对象的成员值都相同，我们则认为这是同一个对象。
 *
 * A：第一步按照正常做法，我们发现并没有去掉重复值。所以，我们要重写equals()方法。
 * B:第二步，我们重写equals()方法。还是没有解决问题,这个时候，我们就应该去思考程序哪里出问题了
 * C:分析哪里出问题呢?
 * 		这个时候我们找到问题原因：add方法里面有问题。
 * 		所以看add方法的源码。
 * D:通过查看源码，我们找到了最终的判断条件：
 * 		e.hash == hash && ((k = e.key) == key || key.equals(k))
 * 		注意：hash是和hashCode()方法相关的。
 *
 * 		这个判断有两个条件：
 * 			第一个条件：e.hash == hash	依赖hashCode()方法进行比较。
 * 			第二个条件：((k = e.key) == key || key.equals(k))
 *
 * HashSet集合是怎么保证元素的唯一性的?
 * 		HashSet集合底层数据结构是哈希表。
 * 		哈希表底层依赖于两个方法：hashCode()和equals()方法。
 * 			先执行hashCode()值的比较：
 * 				相同：
 * 					继续走equals()方法去比较成员的值。
 * 						返回true：对象的成员值相同，那么就是同一个对象。不存储到集合中。
 * 						返回false：对象的成员值不同相同，那么就添加到集合中。
 * 				不同：直接添加到集合中。
 *
 * 以后如果涉及到Hash这种数据结构，你要明白可能需要重写两个方法hashCode()和equals()。
 * A:重写hashCode()是为了保证能走equals()，优化它，是为了提高效率。
 * B:重写equals()是为了比较成员的内容。
 * 如果你真不知道这两个方法该怎么重写：请自动生成即可。
 */
public class HashSetDemo {
    public static void main(String[] args) {
        // 创建集合对象
        HashSet<Student> hs = new HashSet<Student>();

        // 创建学生对象
        Student s1 = new Student("吕布", 30);
        Student s2 = new Student("典韦", 35);
        Student s3 = new Student("关羽", 33);
        Student s4 = new Student("张飞", 31);
        Student s5 = new Student("赵云", 34);
        Student s6 = new Student("马超", 29);
        Student s7 = new Student("赵云", 34);
        Student s8 = new Student("赵云", 30);
        Student s9 = new Student("关羽", 33);

        // 添加元素
        hs.add(s1);
        hs.add(s2);
        hs.add(s3);
        hs.add(s4);
        hs.add(s5);
        hs.add(s6);
        hs.add(s7);
        hs.add(s8);
        hs.add(s9);

        // 遍历
        for (Student s : hs) {
            System.out.println(s.getName() + "---" + s.getAge());
        }

    }
}
