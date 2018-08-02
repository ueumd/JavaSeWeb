package com.daysun.javase.oop2;
/*
	狗类：
		属性：姓名,年龄
		行为：吃饭,跑步
	猫类：
		属性：姓名,年龄
		行为：吃饭,捉迷藏

	通过观察，我们发现，它们有相同的成员。
	而我们学习了继承，就是为了提高代码的复用性。
	所以，我们决定通过继承来解决。

	基本思想：找到相同的成员。

	属性：姓名,年龄
	行为：吃饭
		狗：跑步
		猫：捉迷藏
*/
class Animal {
    //姓名
    private String name;
    //年龄
    private int age;

    public Animal(){}

    public Animal(String name,int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void eat() {
        System.out.println("学习累了，要吃饭补补");
    }
}

class Dog extends Animal {
    public Dog(){}

    public Dog(String name,int age) {
        //this.name = name;
        //this.age = age;
        super(name,age); //关键点。
        System.out.println(super.getName()+":::"+super.getAge());
    }

    public void run() {
        System.out.println("爱跑步");
    }
}

class Cat extends Animal {
    public Cat(){}

    public void play() {
        System.out.println("爱捉迷藏");
    }
}

class ExerciseDemo2 {
    public static void main(String[] args) {
        //如何测试呢?
        //我以Dog类举例
        Dog d = new Dog();
        System.out.println(d.getName()+"---"+d.getAge());
        d.setName("旺财");
        d.setAge(6);
        System.out.println(d.getName()+"---"+d.getAge());
        d.eat();
        d.run();

        //通过带参构造方法赋值
        Dog d2 = new Dog("旺财",6);
        System.out.println(d2.getName()+"---"+d2.getAge());
        d2.eat();
        d2.run();

        //请自己测试Cat类。
    }
}