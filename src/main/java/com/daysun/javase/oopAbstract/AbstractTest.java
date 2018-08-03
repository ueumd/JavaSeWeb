package com.daysun.javase.oopAbstract;

/*
	动物园里有很多种动物：
	比如说，狗，猫等。
	狗有姓名和年龄，猫也有姓名和年龄。
	狗有跑步的方法，猫也有跑步的方法。而且都仅仅是跑步。
	狗有吃饭的方法，猫也有吃饭的方法。只不过，狗吃骨头，猫吃鱼。
    请用所学知识，对这个问题进行解决。

	分析：
		Dog:
			姓名和年龄
			跑步
			吃

		Cat:
			姓名和年龄
			跑步
			吃

		找一个父类出来。
		Animal：抽象类
			姓名和年龄
			跑步
			吃：抽象功能

	抽象类中：
		成员变量：既可以是常量，也可以是变量。
		成员方法：既可以是抽象的，也可以是具体的。
				A:强制要求子类做事情。(抽象方法)
				B:提高代码复用性。(具体方法)
		构造方法：有。
			面试题：抽象类不能实例化，但是却有构造方法，请问有什么用?
					用于子类访问父类的数据进行初始化使用。
*/
abstract class Animal {
    //姓名
    private String name;
    //年龄
    private int age;

    public Animal(){}

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

    public void run() {
        System.out.println("大学的校园,我跑了27圈。");
    }

    //抽象方法
    public abstract void eat();
}

class Dog extends Animal {
    public Dog() {}

    public void eat() {
        System.out.println("狗吃骨头");
    }
}

class Cat extends Animal {
    public Cat() {}

    public void eat() {
        System.out.println("猫吃鱼");
    }
}

class AbstractTest {
    public static void main(String[] args) {
        Animal a = new Dog();
        a.eat();
        a.run();

        //Dog d = new Dog();
        //d.eat();
        //d.run();
        //d = new Cat();

        a = new Cat();
        a.eat();
        a.run();

        //a = new Pig();
    }
}
