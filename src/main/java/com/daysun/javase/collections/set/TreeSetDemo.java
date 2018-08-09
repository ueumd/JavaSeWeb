package com.daysun.javase.collections.set;

import org.junit.Test;

import java.util.Comparator;
import java.util.TreeSet;

/*
TreeSet 底层是二叉树 如果元素具备自然顺序的特性，那么就按照元素自然顺序的特性进行排序存储。

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

 class  类名  implements Comparator{}

 推荐使用：使用比较器(Comparator)。
 *
 */

/*
 * 需求：我要存储多个学生对象，并按照学生的年龄从小到大排序。
 * 如果两个对象的内容都相同，我们就认为对象是重复的。
 *
 * 按照正常做法，我们发现出问题了：
 * java.lang.ClassCastException: cn.itcast_06.Student cannot be cast to java.lang.Comparable
 * 那么这个问题是什么意思呢?意思是类型转换问题。
 * 怎么产生的呢?由于你使用的是自然排序规则，而你并没有实现自然排序接口。这个接口是那个对象要排序，就被该对象所属的类实现。
 *
 * 重写完自然排序接口后，我们发现一个规律：
 * 如果返回值是0，说明元素重复。只存储第一个。
 * 如果返回值大于0，正向存储。
 * 如果返回值小于0，逆向存储。
 */
public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<>();
        ts.add("z");
        ts.add("x");
        ts.add("a");
        ts.add("c");

        System.out.println(ts);//[a, c, x, z]

        TreeSet tree = new TreeSet();

        tree.add(new Student("AAA", 10));
        tree.add(new Student("CCC", 30));
        tree.add(new Student("DDD", 40));
        tree.add(new Student("BBB", 20));


        System.out.println("集合的元素：" + tree);
        //[Student [name=AAA, age=10], Student [name=BBB, age=20], Student [name=CCC, age=30], Student [name=DDD, age=40]]
    }

    /**
     * TreeSet存储Integer类型元素的案例。
     */
    @Test
    public void test1() {
        TreeSet<Integer> ts = new TreeSet<Integer>();
        ts.add(20);
        ts.add(18);
        ts.add(23);
        ts.add(22);
        ts.add(17);
        ts.add(24);
        ts.add(19);
        ts.add(18);
        ts.add(24);

        for (Integer i: ts) {
            System.out.print(i);  // 17	18	19	20	22	23	24
            System.out.print('\t');
        }

    }

    /**
     * 存储学生对象，要求保证唯一和排序(按照学生的姓名长度从长到短)。
     */
    @Test public void test2(){

        TreeSet<Student> ts = new TreeSet<Student>(new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                // 主要条件
                int num = s2.getName().length() - s1.getName().length();
                // 次要条件
                int num2 = num == 0 ? s1.getName().compareTo(s2.getName()) : num;
                int num3 = num2 == 0 ? s1.getAge() - s2.getAge() : num2;
                return num3;
                // return 0;
            }
        });

        // 创建学生对象
        Student s1 = new Student("baigujing", 20);
        Student s2 = new Student("zixixianzi", 22);
        Student s3 = new Student("guanyinjiejie", 18);
        Student s4 = new Student("tangseng", 20);
        Student s5 = new Student("bailongma", 20);
        Student s6 = new Student("niumowang", 24);
        Student s7 = new Student("taibaijinxing", 55);
        Student s8 = new Student("change", 18);
        Student s9 = new Student("change", 18);
        Student s10 = new Student("zixixianzi", 22);

        // 添加元素
        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);
        ts.add(s5);
        ts.add(s6);
        ts.add(s7);
        ts.add(s8);
        ts.add(s9);
        ts.add(s10);

        // 遍历
        for (Student s : ts) {
            System.out.println(s.getName() + "---" + s.getAge());
        }

    }
}
