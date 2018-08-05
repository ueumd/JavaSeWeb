package com.daysun.javase.adv.reflection;

public class Person {
    // 成员变量
    private String name;
    int age;
    public String address;

    // 构造方法
    public Person() {

    }

    private Person(String name) {
        this.name = name;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void show() {
        System.out.println("show");
    }

    public void print(String s) {
        System.out.println("print " + s);
    }

    public String method(String s, int a) {
        return s + " 在一起 " + a;
    }

    private void function() {
        System.out.println("function");
    }

    @Override
    public String toString() {
        return name + "---" + age + "---" + address;
    }

}
