package com.daysun.javase.oopPolymorphism;

/*
	多态：同一个对象在不同时刻表现出来的不同状态。

	举例：对于一只狗，我们既可以说它是狗，也可以说它是动物。
		  水(水蒸气,水,冰)

	多态的前提：
		A:要有继承关系
		B:要有方法重写
		C:要有父类引用指向子类对象
*/

/*
	多态的前提：继承关系，方法重写，父类引用指向子类对象
				注意：没有方法重写的多态是没有意义的。

	多态中的成员关系：
		成员变量：编译看左边,左边没有就报错。
				  运行看左边。
		成员方法：编译看左边,左边没有就报错。
				  运行看右边。

		注意：
			注意原因在于方法有重写，而变量没有。

	多态的弊端：
		父类不能使用子类特有功能。

	举例：
		孔子装爹案例。

		孔子爹：教书("JavaSE"),age=40
		孔子：教书("论语"),玩游戏("英雄联盟"),age=20

		//多态
		孔子爹 k爹 = new 孔子(); //穿上爹的衣服，带上爹的眼镜，看起来就像爹。(向上转型)
		System.out.println(k爹.age); //40
		k爹.教书(); //"论语";
		//k爹.玩游戏(); //错误。

		//下课了，回家
		//孔子 k = new 孔子();

		孔子 k = (孔子)k爹; //向下转型，回家脱掉爹的衣服，去掉眼镜，穿上自己的，然后玩游戏
		k.玩游戏();
		k.教书();
		System.out.println(k.age);
*/
class AnimalTest {
    public int num = 10;
    final int count = 100;
    public void show() {
        System.out.println("Animal show");
    }

    //私有方法不能被继承 不能重写
    private void showName(){
            System.out.println("AnimalTest showName");
    }
}

class DogTest extends AnimalTest {
    public int num = 20;
    public int num2 = 30;


    public void show() {
        System.out.println("Dog show");
    }

    public void wangwang(){
        System.out.println("Dog wang wang");
    }

    public void showName(){
        System.out.println("DogTest showName");
    }
}

class AnimalDemo {
    public static void main(String[] args) {
        AnimalTest a1 = new AnimalTest();    //创建了一只动物赋值给了动物 动物是动物
        a1.show();

        DogTest d = new DogTest();          //创建了一只狗赋值给了狗 狗是狗
        d.show();

        // Error:(35, 18) java: 不兼容的类型: Animal无法转换为DogTest
        //DogTest d2 = new AnimalTest();    // 创建了一只动物赋值给了狗 动物是狗

        /*
        多态中的成员关系：
		成员变量：编译看左边,左边没有就报错。
				  运行看左边。
		成员方法：编译看左边,左边没有就报错。
				  运行看右边。
         */

        AnimalTest a = new DogTest();      //创建了一只狗赋值给了动物 狗是动物
        System.out.println(a.num);  // 10

       // System.out.println(a.num2);   //不存在此属性

        // 编译看左边, 左边有， 运行看右边
        a.show(); //DogTest show  该方法重写了，覆盖了父类

        // 编译看左边, 左边没有， 报错
       // a.wangwang();

        //私有方法
       // a.showName();

        System.out.println(a.count);  // 10
    }
}