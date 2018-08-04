package com.daysun.javase.oopInnerClass;

/*
	内部类：就是把类定义在一个类中，那么，该类就被称为内部类。

	由于位置不同，内部类分为了两种：
		成员内部类：在成员位置
		局部内部类：在局部位置

	特点：
		A:可以直接使用外部类的所有成员，包括私有。
		B:外部类要使用内部类的成员，必须创建对象使用。

	成员内部类：
*/
class Outer333 {
    private int num = 10;

    class Inner	{
        public void show() {
            System.out.println(num);
        }
    }

    class Inner2 {
        public void show () {
            System.out.println(num);
        }
    }

    public void method() {
        Inner i = new Inner();
        i.show();
/*
	内部在局部位置：
		A:可以访问外部类中的成员。
		B:可以访问局部成员吗?可以,但是局部变量必须被final修饰。

		面试题：为什么?
			因为局部变量使用完毕就消失了。
			而内部类还在内存中存在，这个时候，它还想继续使用局部变量，
			所以，为了延长局部变量的生命周期用final修饰。
			和类一样的生命周期。
*/
        final int a = 100;
        // 局部位置
        class Inner3 {
            public void show () {
                System.out.println(a);
            }
        }

        Inner3 i2 = new Inner3();
        i2.show();
    }
}

class InnerClassDemo {
    public static void main(String[] args) {
        //需求：我要调用show方法。
        //Inner i = new Inner();
        //i.show();

        //主要：如果你要想直接使用内部类的方法，那么，就得造内部类的对象。
        //而你要想造内部类的对象，就必须依赖于外部类。
        //格式：外部类名.内部类名 对象名 = 外部类对象.内部类对象;
        Outer333.Inner oi = new Outer333().new Inner(); //造的是一个inner对象
        oi.show();

        //刚才我们是直接使用了内部类的功能，而我们也可以用另外的方式来使用。
        Outer333 o = new Outer333(); //推荐的方案。
        o.method();


        Outer333.Inner2 o2 = new Outer333().new Inner2();
        o2.show();
    }
}
