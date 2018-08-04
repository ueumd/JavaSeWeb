package com.daysun.javase.oopInnerClass;

interface Inter2
{
    void show();
}

class Outer2
{
    //补齐代码，完成主方法中定义的功能
    public static Inter2 method() {
		/*
		Inter2 i = new Inter22(){
			public void show() {
				System.out.println("HelloWorld");
			}
		};
		return i;
		*/

        return new Inter2(){
            public void show() {
                System.out.println("HelloWorld");
            }
        };
    }
}

class InnerClassTest
{
    public static void main(String[] args)
    {
        Outer2.method().show();
		/*
			分析：
				A: Outer.method()我们要知道在Outer中有一个静态方法method。
				B：Outer.method().show() 这个返回值居然还可以继续调用show方法。
										 那么，说明这个返回值应该是一个包含有show方法的对象。
		*/
    }
}