package com.daysun.javase.oopAbstract;

/**
 * 抽象类的特点：
 * 		A:抽象类和抽象方法必须用abstract修饰。
 * 		B:抽象方法所在的类肯定是抽象类。抽象类中不一定有抽象方法。
 * 		C:抽象类是不能被实例化的。 如：动物叫动物
 * 		D:子类继承一个抽象类，要么子类也是抽象类，要么子类把父类的所有抽象方法重写。
 */
abstract class AnimalDemo {
    public abstract void show();
}

// 子类也是抽象类
abstract class MaokeiAnimal extends Animal {

}

class PigDemo extends AnimalDemo {
    //重写父类方法
    public void show(){

    }
}

public class AbstractDemo {
    public static  void main(String[] args) {
       // 抽象类是不能被实例化的
       // AnimalDemo animalDemo = new AnimalDemo(); //动物叫动物

        PigDemo pig = new PigDemo();
        pig.show();
    }
}
