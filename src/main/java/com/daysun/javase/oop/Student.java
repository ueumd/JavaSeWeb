package com.daysun.javase.oop;

public class Student {

    public int age;
    public String name;

    public Student(){

    }

    public Student(int age, String name){
        this.age=age;
        this.name = name;
    }

    public static void main(String[] args){

        Student s1 = new Student(10, "小王");
        Student s2 = s1;

        System.out.println(s1.age + s1.name);
        System.out.println(s2.age + s2.name);

        s1.age = 20;

        System.out.println(s1.age + s1.name);
        System.out.println(s2.age + s2.name);

    }
}


