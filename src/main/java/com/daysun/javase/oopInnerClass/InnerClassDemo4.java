package com.daysun.javase.oopInnerClass;

/*
	匿名内部类：属于局部内部类。

	前提：
		存在着一个类或者接口。

	格式：
		new 类名或者接口名() {
			重写父类/接口方法。
			或者自己定义方法。(一般不会这样做)
		}

	解释：
		创建了一个匿名的子类对象。

	问题来了，这个里面的方法怎么用呢?
		因为它本身就是一个对象，所以，在后面直接.调用方法即可。
		如果接口中有多个方法，那么，我们就可以考虑使用多态的形式。


*/
interface Inter {
    public abstract void show();
    public abstract void show2();
}

class Outer {
    public void method() {
        //带名字的内部类。
		/*
		class Inner {
			public void show() {

			}
		}
		*/

		/*
		new Inter() {
			public void show() {
				System.out.println("哈哈，真笨");
			}
		};
		*/

		/*
		//怎么用
		new Inter() {
			public void show() {
				System.out.println("哈哈，真笨");
			}
		}.show();

		//再，它不断可以重写父亲或者接口的方法，还可以自定义方法。
		new Inter() {
			public void show() {
				System.out.println("哈哈，真笨");
			}

			public void haha() {
				System.out.println("这种用法真奇怪");
			}
		}.show();

		new Inter() {
			public void show() {
				System.out.println("哈哈，真笨");
			}

			public void haha() {
				System.out.println("这种用法真奇怪");
			}
		}.haha();
		*/

		/*
		new Inter() {
			public void show() {
				System.out.println("show");
			}

			public void show2() {
				System.out.println("show2");
			}
		}.show();

		new Inter() {
			public void show() {
				System.out.println("show");
			}

			public void show2() {
				System.out.println("show2");
			}
		}.show2();
		*/

        //假设接口中的方法比较多，这个时候，就麻烦了。怎么办呢?
        //这种格式代表的是匿名子类对象。
        Inter i = new Inter() {
            public void show() {
                System.out.println("show");
            }

            public void show2() {
                System.out.println("show2");
            }
        };

        i.show();
        i.show2();
    }
}


class InnerClassDemo4 {
    public static void main(String[] args) {
        Outer o = new Outer();
        o.method();
    }
}
