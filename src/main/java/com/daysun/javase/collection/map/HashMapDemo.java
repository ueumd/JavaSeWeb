package com.daysun.javase.collection.map;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args) {

    }

    /**
     * HashMap的遍历功能：
     * 		Map集合是夫妻对形式。
     *
     * 		丈夫找妻子。
     * 		方式1步骤：
     * 			A:把丈夫给集中起来，其实就是获取键的集合。keySet()
     * 			B:让丈夫一个一个的过来，其实就是遍历丈夫集合。增强for
     * 			C:让丈夫找妻子。get()
     */

    @Test
    public void test1(){
        HashMap<String, String> hm = new HashMap<String, String>();

        // 创建并存储元素
        hm.put("邓超", "孙俪");
        hm.put("梁朝伟", "刘嘉玲");
        hm.put("刘恺威", "杨幂");
        hm.put("吴奇隆", "刘诗诗");

        Set<String> set = hm.keySet();

        for(String key : set) {
            String value = hm.get(key);
            System.out.println(key + "----------"+ value);
        }
    }


    /**
     * 需求：请用HashMap集合存储如下元素：
     * 键：学号（String）
     * 值：学生对象（Student name,age,address）
     * 存储3个即可，然后遍历输出。我要的结果格式：
     * 		学号 -- 姓名 -- 年龄 -- 地址
     */
    @Test
    public void test2(){
        // 创建集合对象
        HashMap<String, Student> hm = new HashMap<String, Student>();

        // 创建元素对象
        Student s1 = new Student("林青霞", 27, "北京");
        Student s2 = new Student("奥特曼", 20, "武汉");
        Student s3 = new Student("刘意", 30, "十堰");

        // 添加元素
        hm.put("it001", s1);
        hm.put("it003", s2);
        hm.put("it002", s3);

        // 遍历集合
        // 获取所有键的集合
        Set<String> set = hm.keySet();
        // 遍历键的集合
        for (String key : set) {
            // 根据键获取值
            Student value = hm.get(key);
            System.out.println(key + "---" + value.getName() + "---"
                    + value.getAge() + "---" + value.getAddress());
        }
    }

    /**
     * 重写了has equals
     */
    @Test
    public void test3(){
        // 创建集合对象
        HashMap<Student, String> hm = new HashMap<Student, String>();

        // 创建元素对象
        Student s1 = new Student("武松", 25, "山东");
        Student s2 = new Student("林冲", 30, "河南");
        Student s3 = new Student("鲁智深", 35, "山西");
        Student s4 = new Student("吴用", 40, "北京");
        Student s5 = new Student("卢俊义", 33, "湖北");
        Student s6 = new Student("卢俊义", 33, "湖北"); //只会输出一个
        Student s7 = new Student("卢俊义", 23, "湖北");

        // 添加元素
        hm.put(s1, "ls108001");
        hm.put(s2, "ls108003");
        hm.put(s3, "ls108002");
        hm.put(s4, "ls108007");
        hm.put(s5, "ls108005");
        hm.put(s6, "ls108004");
        hm.put(s7, "ls108006");

        // 遍历
        Set<Student> set = hm.keySet();
        for (Student key : set) {
            String value = hm.get(key);
            System.out.println(key.getName() + "---" + key.getAge() + "---"
                    + key.getAddress() + "---" + value);
        }
    }

    /**
     * 另一种遍历方式
     * 方式2：通过结婚证找丈夫和妻子。
     * 		A:获取所有结婚证的集合。Set<结婚证<K,V>> ---- Set<Map.Entry<K,V>> entrySet()
     * 			class 结婚证<K,V>
     * 			{
     * 				private K key;
     * 				private V value;
     *
     * 				public 结婚证(K key,V value)
     * 				{
     * 					this.key = key;
     * 					this.vlaue = value;
     * 				}
     *
     * 				public K getKey() {
     * 					return key;
     * 				}
     *
     * 				public V getValue() {
     * 					reutrn value;
     * 				}
     * 			}
     *		B:遍历结婚证的集合，得到每一个结婚证。增强for。
     *		C:通过结婚证对象获取丈夫和妻子。getKey(),getValue()
     */

    @Test
    public void bl(){
        // 创建集合对象
        HashMap<String, String> hm = new HashMap<String, String>();

        // 创建并添加元素
        hm.put("猪八戒", "嫦娥");
        hm.put("乔峰", "阿朱");
        hm.put("杨过", "小龙女");
        hm.put("郭靖", "黄蓉");

        // 遍历
        // 获取所有键值对对象的集合
        // Set<Map.Entry<K,V>> entrySet()
        Set<Map.Entry<String, String>> set = hm.entrySet();
        // 获取每一个键值对对象
        for (Map.Entry<String, String> me : set) {
            // 根据键值对对象获取键和值
            String key = me.getKey();
            String value = me.getValue();
            System.out.println(key + "---" + value);
        }
    }
}
