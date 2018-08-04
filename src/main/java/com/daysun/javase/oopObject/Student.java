package com.daysun.javase.oopObject;

import java.util.Objects;

public class Student {
    private String name;
    private int age;
    //private char sex;

    public Student() {

    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

//	@Override
//	public boolean equals(Object obj) {  //obj = s5; 向上转型。
//		//比较姓名是否相同，比较年龄是否相同。
//		//this -- s4
//		//return true;
//
//
//
//		//向下转型
//		Student s = (Student)obj;  //Demo类没法转换
//		//s == obj == s5;
//		//String类重写了equals()方法。用于比较两个字符串的内容是否相同。(明天我带你看源码)
//		if(this.name.equals(s.name) && this.age == s.age){
//			return true;
//		}else{
//			return false;
//		}
//	}

//	@Override
//	public boolean equals(Object obj) {
//		//为了提高程序效率
//		if(this==obj){
//			return true;
//		}
//
//		//为了提高程序的健壮性
//		//instanceof关键字：检查某个对象是否是某个类的对象
//		//格式：对象 instanceof 类名 返回true或者false
//		if(!(obj instanceof Student)){
//			return false;
//		}
//
//		Student s = (Student)obj;
////		if(this.name.equals(s.name) && this.age == s.age){
////			return true;
////		}else{
////			return false;
////		}
//		//return this.name.equals(s.name) && this.age == s.age?true:false;
//		return this.name.equals(s.name) && this.age == s.age;
//	}



//    //如果有问题，就不写了，自动生成。 Eclipse自动生成
//    @Override
//    public boolean equals(Object obj) {
//        if (this == obj)
//            return true;
//        if (obj == null)
//            return false;
//        if (getClass() != obj.getClass())
//            return false;
//        Student other = (Student) obj;
//        if (age != other.age)
//            return false;
//        if (name == null) {
//            if (other.name != null)
//                return false;
//        } else if (!name.equals(other.name))
//            return false;
//        return true;
//    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        if (age != student.age) return false;
        return name != null ? name.equals(student.name) : student.name == null;
    }


    @Override
    public String toString() {
        return "Student [name=" + name + ", age=" + age + "]";
    }
    // @Override
    // public String toString() {
    // return "Hello,林青霞";
    // }

    // 这个toString()方法到底该怎么重写呢?
    // @Override
    // public String toString() {
    // return name+"---"+age;
    // }
    // 不知道，就别写了，自动生成。
}
