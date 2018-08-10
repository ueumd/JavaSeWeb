package com.daysun.javase.collection.map;

import org.junit.Test;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {

    }

    @Test
    public void test1(){
        // 创建集合对象
        TreeMap<String, String> tm = new TreeMap<String, String>();

        // 创建并添加元素
        tm.put("javase", "刘意");
        tm.put("android", "刘小曲");
        tm.put("javame", "苏老板");
        tm.put("javaee", "朴乾");

        // 遍历集合
        Set<String> set = tm.keySet();
        for (String key : set) {
            String value = tm.get(key);
            System.out.println(key + "---" + value);
        }
        /*
        根据键进行了自然排序
        android---刘小曲
        javaee---朴乾
        javame---苏老板
        javase---刘意

         */
    }

    @Test
    public void test2(){
        /**
         * 按年龄进行排序，相同的内容只存进去一个
         */
        TreeMap<Student, String> tm = new TreeMap<Student, String>(
                new Comparator<Student>() {
                    @Override
                    public int compare(Student s1, Student s2) {
                        // 主要条件
                        int num = s1.getAge() - s2.getAge();
                        // 次要条件
                        // 姓名
                        int num2 = num == 0 ? s1.getName().compareTo(
                                s2.getName()) : num;
                        // 地址
                        int num3 = num2 == 0 ? s1.getAddress().compareTo(
                                s2.getAddress()) : num2;
                        return num3;
                    }
                }
        );

        // 创建元素对象
        Student s1 = new Student("武松", 25, "山东");
        Student s2 = new Student("林冲", 30, "河南");
        Student s3 = new Student("鲁智深", 35, "山西");
        Student s4 = new Student("吴用", 40, "北京");
        Student s5 = new Student("卢俊义", 33, "湖北");
        Student s6 = new Student("卢俊义", 33, "湖北");
        Student s7 = new Student("卢俊义", 23, "湖北");

        // 添加元素
        tm.put(s1, "ls108001");
        tm.put(s2, "ls108003");
        tm.put(s3, "ls108002");
        tm.put(s4, "ls108007");
        tm.put(s5, "ls108005");
        tm.put(s6, "ls108004");
        tm.put(s7, "ls108006");

        // 遍历
        Set<Student> set = tm.keySet();
        for (Student key : set) {
            String value = tm.get(key);
            System.out.println(key.getName() + "---" + key.getAge() + "---"
                    + key.getAddress() + "---" + value);
        }
    }

    /*
     * "cbxzbvavdvgd"获取字符串中，每一个字母出现次数："a(1)b(2)c(1)d(2)g(1)v(3)x(1)z(1)"
     *
     * 思路：
     * 		A:定义字符串。
     * 		B:把字符串转换成字符数组。
     * 		C:定义TreeMap集合。
     * 		D:遍历字符数组，获取到每一个字符。
     * 		E:拿这个字符作为键去TreeMap集合中查找值
     * 			返回null，说明以前不存在，我们就存储一次，记录次数为1
     * 			不为null，说明以前存在，我们就把值加1，然后重新存储。
     * 		F:把TreeMap集合中的元素遍历并拼接成一个满足条件的字符串。
     * 		G:输出字符串。
     */
    @Test
    public void test3(){
        // 定义字符串。
        String str = "cbxzbvavdvgd";

        // 把字符串转换成字符数组。
        char[] chs = str.toCharArray();

        // 定义TreeMap集合。
        TreeMap<Character, Integer> tm = new TreeMap<Character, Integer>();

        // 遍历字符数组，获取到每一个字符。
        for (char ch : chs) {
            // 拿这个字符作为键去TreeMap集合中查找值
            Integer i = tm.get(ch);

            if (i == null) {
                // 返回null，说明以前不存在，我们就存储一次，记录次数为1
                tm.put(ch, 1);
            } else {
                // 不为null，说明以前存在，我们就把值加1，然后重新存储。
                i++;
                tm.put(ch, i);
            }
        }

        // 把TreeMap集合中的元素遍历并拼接成一个满足条件的字符串。
        StringBuilder sb = new StringBuilder();
        Set<Character> set = tm.keySet();
        for (Character key : set) {
            Integer value = tm.get(key);
            sb.append(key).append("(").append(value).append(")");
        }

        //输出字符串。
        String result = sb.toString();
        System.out.println(result);

    }
}
