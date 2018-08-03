package com.daysun.javase.oopInterface;

/*
	按照图纸进行实现。
*/
//说英语的接口
interface SpeakEnglish {
    public abstract void speak();
}

//人的抽象类
abstract class Person {
    //姓名
    private String name;
    //年龄
    private int age;

    public Person(){}

    public Person(String name,int age) {
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

    //抽象的吃方法
    public abstract void eat();
}

//抽象的运动员类
abstract class SportsMan extends Person {
    public SportsMan(){}

    public SportsMan(String name,int age) {
        super(name,age);
    }

    //抽象的训练方法
    public abstract void train();
}

//抽象的教练类
abstract class Trainer extends Person {
    public Trainer(){}

    public Trainer(String name,int age) {
        super(name,age);
    }

    //抽象的教的方法
    public abstract void teach();
}

//具体的乒乓球运动员类
class PingPangPlayer extends SportsMan implements SpeakEnglish {
    public PingPangPlayer(){}

    public PingPangPlayer(String name,int age) {
        super(name,age);
    }

    public void eat() {
        System.out.println("吃猪肉，喝肉汤");
    }

    public void train() {
        System.out.println("如何发球和接球");
    }

    public void speak() {
        System.out.println("学习英语");
    }
}

//具体的篮球运动员类
class BasketBallPlayer extends SportsMan {
    public BasketBallPlayer(){}

    public BasketBallPlayer(String name,int age) {
        super(name,age);
    }

    public void eat() {
        System.out.println("吃牛肉，喝三鹿");
    }

    public void train() {
        System.out.println("如何运球和过人");
    }
}

//具体的乒乓球教练类
class PingPangTrainer extends Trainer implements SpeakEnglish {
    public PingPangTrainer(){}

    public PingPangTrainer(String name,int age) {
        super(name,age);
    }

    public void eat() {
        System.out.println("吃白菜，喝豆腐汤");
    }

    public void teach() {
        System.out.println("教如何发球和接球");
    }

    public void speak() {
        System.out.println("学习英语");
    }
}

//具体的篮球教练类
class BasketBallTrainer extends Trainer {
    public BasketBallTrainer(){}

    public BasketBallTrainer(String name,int age) {
        super(name,age);
    }

    public void eat() {
        System.out.println("吃胡萝卜，喝白开水");
    }

    public void teach() {
        System.out.println("教如何运球和过人");
    }
}

class PersonTest {
    public static void main(String[] args) {
        //测试 设计实现的时候，我们一般是从头开始。
        //在真正的使用的时候，我们一般使用具体的类。

        PingPangPlayer ppp = new PingPangPlayer("王浩",35);
        System.out.println(ppp.getName()+"---"+ppp.getAge());
        ppp.eat();
        ppp.train();
        ppp.speak();

        //剩下的留做作业。
    }
}
