package com.daysun.javase.oopInterface;

/*
	接口定义的几个特点：
		A:接口是用interface进行定义的
		B:一个类实现接口用implements来实现
		C:接口不能被实例化
			以多态的方式，被子类实例化。

	接口中的成员特点：
		A:成员变量
			接口中只有常量。
			它有默认修饰符：public static final
		B:构造方法
			没有构造方法的
		C:成员方法
			接口中只有抽象方法。
			它有默认修饰符：public abstract

		推荐：
			在接口中定义变量和方法的时候，请自己加上修饰符。

		多态的表现形式：
			A:具体类多态(很少见)
			B:抽象类多态
			C:接口多态
*/
interface Inter {
    //常量
    public static final int x = 10;

    //构造方法
    //public Inter(){}

    //方法
    public abstract void show();
}

class Demo implements Inter {
    public void show() {
        //x = 20;
        System.out.println(x);
    }

    public Demo() {}
}

class InterfaceDemo {
    public static void main(String[] args) {
        Demo d = new Demo();
        d.show(); //10

        System.out.println(Inter.x); //10

        //接口用法
        Inter i = new Demo();
        i.show(); //10
    }
}
