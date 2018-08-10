package com.daysun.javase.collection.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class HashMapArrayListDemo {
    public static void main(String[] args) {


        class Student {
            private String sid;
            private String sname;

            public Student() {
            }

            public Student(String sid, String sname) {
                super();
                this.sid = sid;
                this.sname = sname;
            }

            public String getSid() {
                return sid;
            }

            public void setSid(String sid) {
                this.sid = sid;
            }

            public String getSname() {
                return sname;
            }

            public void setSname(String sname) {
                this.sname = sname;
            }

        }


        // 创建集合对象
        HashMap<String, ArrayList<Student>> czbk = new HashMap<String, ArrayList<Student>>();

        // 创建元素对象
        ArrayList<Student> yr = new ArrayList<Student>();
        Student s1 = new Student("01", "zhangsan");
        Student s2 = new Student("02", "lisi");
        yr.add(s1);
        yr.add(s2);

        ArrayList<Student> jy = new ArrayList<Student>();
        Student s3 = new Student("01", "wangwu");
        Student s4 = new Student("02", "zhaoliu");
        jy.add(s3);
        jy.add(s4);

        czbk.put("yr", yr);
        czbk.put("jy", jy);

        // 遍历
        Set<String> set = czbk.keySet();
        for (String key : set) {
            System.out.println(key);
            ArrayList<Student> array = czbk.get(key);
            for (Student s : array) {
                System.out.println("\t" + s.getSid() + "---" + s.getSname());
            }
        }
    }
}
