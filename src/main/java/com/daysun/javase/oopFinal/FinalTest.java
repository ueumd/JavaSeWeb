package com.daysun.javase.oopFinal;

/*
final(掌握)
	(1)是最终的意思。可以修饰类，修饰成员方法，修饰变量。
	(2)特点：
		A:它修饰的类不能被继承
		B:它修饰的成员方法不能被重写
		C:它修饰的变量是常量
	(3)面试题：
		A:final修饰的变量一般在定义的时候就给赋值了，那么，请问有没有可能在其他情况下赋值?
			有。在构造方法完毕前都行。
			class OuterInnerDemo
			{
				final int x;	//此处就没有在定义时直接赋值，在构造函中给赋值
				OuterInnerDemo()
				{
					x=5;
				}
				public static void main(String[] args)
				{
					int x=new OuterInnerDemo().x;
					System.out.println(x);

				}
			}

		B:final修饰基本类型和引用类型
			final修饰基本类型：值不能改变
			final修饰引用类型：地址值不能改变，对象的内容是可以发生改变的。
 */
public class FinalTest {
}


/*
	问题：final定义的变量必须给值，那么在什么时候给值?
		A:在定义的时候就给值。一般都是这样用的。
		B:还有没有再其他的时候给赋值的情况
			有，在构造方法执行完毕之前赋值都可以。(面试)

*/

class OuterInnerDemo
{
    final int x;	//此处就没有在定义时直接赋值，在构造函中给赋值
    OuterInnerDemo()
    {
        //在构造方法执行完毕之前赋值都可以
        x=5;
    }
    public static void main(String[] args)
    {
        int x=new OuterInnerDemo().x;
        System.out.println(x);

    }
}

