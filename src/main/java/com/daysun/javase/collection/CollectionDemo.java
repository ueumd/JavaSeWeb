package com.daysun.javase.collection;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionDemo {
    class Student {
        public String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public int age;

        public Student(String name, int age) {
            this.name = name;
            this.age = age;
        }
    }

    public static void main(String[] args) {

    }

    @Test
    public void c1() {

        Collection c = new ArrayList();

        String s1 = "hello";
        String s2 = "world";
        String s3 = "java";

        int a = 10;

        c.add(s1);
        c.add(s2);
        c.add(s3);
        // c.add(a);

        Iterator it = c.iterator();
        while (it.hasNext()) {
            String s = (String) it.next();
            System.out.println(s);
        }
    }

    @Test
    public void c2() {
        // TODO Auto-generated method stub
        Collection c = new ArrayList();

        c.add(new Student("zhangdan", 23));
        c.add(new Student("lisi", 43));
        c.add(new Student("wangwu", 27));
        c.add(new Student("hongqi", 83));

        Iterator it = c.iterator();
        while (it.hasNext()) {
            Student s = (Student) it.next();
            System.out.println(s.getName() + "------" + s.getAge());
        }

        System.out.println("-------------");
        for (Iterator iter = c.iterator(); iter.hasNext(); ) {
            Student s = (Student) iter.next();
            System.out.println(s.getName() + "******" + s.getAge());
        }
    }
}

