package com.daysun.javase.oopPolymorphism;

/*
	多态的好处：提高程序的可维护性和扩展性。

	注意：
		编程：要想做到扩展性强，那么，最好使用多态机制。

	开闭原则：
		对修改关闭，对扩展开放。

	因此多态的意思就是：父类型的引用可以指向子类的对象。
*/
class Animal {
    public void eat() {}
    public void play() {}
}

class Dog extends Animal {
    public void eat() {
        System.out.println("狗吃肉");
    }

    public void play() {
        System.out.println("狗玩皮球");
    }
}

class Cat extends Animal {
    public void eat() {
        System.out.println("猫吃老鼠");
    }

    public void play() {
        System.out.println("猫玩线球");
    }
}

class Pig extends Animal {
    public void eat() {
        System.out.println("猪吃饲料");
    }

    public void play() {
        System.out.println("猪拱地");
    }
}

class AnimalTool {
	/*
	//返回值类型：void
	//参数列表：Dog d
	public static void printDog(Dog d) {  //Animal a = new Dog();
		d.eat();
		//code...
		d.play();
	}

	public static void printCat(Cat c) { //Animal a = new Cat();
		c.eat();
		//code...
		c.play();
	}

	public static void printPig(Pig p) { ////Animal a = new Pig();
		p.eat();
		//code...
		p.play();
	}
	*/

    /**
     * 多态的前提：
     * 		A:要有继承关系
     * 		B:要有方法重写
     * 		C:要有父类引用指向子类对象
     *
     * 父类型的引用可以指向子类的对象。
     * 子类重写了父类的方法
     */
    public static void printAnimal(Animal a) {
        a.eat();
        a.play();
    }
}

//测试类，而测试类一般被看做为客户端。
class AnimalDemo3 {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();
        d.play();

        Dog d2 = new Dog();
        d2.eat();
        d2.play();

        Dog d3 = new Dog();
        d3.eat();
        d3.play();
        System.out.println("---------------");

        //...
        //我们发现这些对象调用的功能是一样的，仅仅是对象不一样。
        //为了提高代码的复用性，写一个功能解决。
        //把对象作为参数传递。
        //AnimalTool.printDog(d);
        //AnimalTool.printDog(d2);
        //AnimalTool.printDog(d3);

        AnimalTool.printAnimal(d);
        AnimalTool.printAnimal(d2);
        AnimalTool.printAnimal(d3);

        System.out.println("---------------");

        //同理，猫也来了，我也要造一堆猫
        Cat c = new Cat();
        c.eat();
        c.play();

        Cat c2 = new Cat();
        c2.eat();
        c2.play();

        Cat c3 = new Cat();
        c3.eat();
        c3.play();
        System.out.println("---------------");
        //通过函数改进调用
        //AnimalTool.printCat(c);
        //AnimalTool.printCat(c2);
        //AnimalTool.printCat(c3);

        AnimalTool.printAnimal(c);
        AnimalTool.printAnimal(c2);
        AnimalTool.printAnimal(c3);

        System.out.println("---------------");

        //后来随着发展，宠物猪出现了。请把宠物猪添加到这个体系中，并进行测试。
        Pig p = new Pig();
        Pig p2 = new Pig();
        Pig p3 = new Pig();
        //AnimalTool.printPig(p);
        //AnimalTool.printPig(p2);
        //AnimalTool.printPig(p3);

        AnimalTool.printAnimal(p);
        AnimalTool.printAnimal(p2);
        AnimalTool.printAnimal(p3);

        //将来还有可能出现宠物虎
        //添加一个虎类，然后在修改动物工具类，添加针对虎操作的功能。

        //使用多态改进后
        //只需要添加一个虎类。
    }

	/*
	public static void printDog(Dog d) {
		d.eat();
		//code...
		d.play();
	}

	public static void printCat(Cat c) {
		c.eat();
		//code...
		c.play();
	}

	public static void printPig(Pig p) {
		p.eat();
		//code...
		p.play();
	}
	*/
}
