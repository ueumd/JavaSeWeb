package com.daysun.javase.oopPolymorphism;

/*
	多态中的问题：
		向下转型的时候，请千万要注意了，可能会有一个异常：ClassCastException 类型转换异常。
*/
class Animal2 {
    public void show() {}
}
class Dog2 extends Animal2 {
    public void show() {
        System.out.println("Dog2 show");
    }
    public void method() {
        System.out.println("Dog2 method");
    }
}
class Cat2 extends Animal2 {
    public void show() {
        System.out.println("Cat2 show");
    }
}
class UpAndDown {
    public static void main(String[] args) {
        Animal2 a = new Dog2();
        a.show();
        //a.method(); 没有此方法

        Dog2 d = (Dog2) a; //向下转
        d.show();
        d.method();


        a = new Cat2(); //指针重新指向
        a.show();

        Cat2 c = (Cat2)a;
        c.show();

        //ClassCastException
        Dog2 d2 = (Dog2)a;  //a是Cat对象 (Dog2)Cat2 报错  Cat2 cannot be cast to Dog2
        d2.show();
        d2.method();
    }
}