package com.daysun.javase.oop2;
/*
	子父类间的成员方法关系：
		子类调用的时候，先用的是自己的，如果没有再使用父亲的。如果父亲没有，就使用父亲的父亲的...
		最后，如果没有，就报错。

	当子类中有和父类一模一样的方法的时候，子类使用的是自己的。
	这种现象被称为方法(覆盖，复写，)重写。

	方法重写：
		建议，子类和父类的模式一模一样。
		方法声明相同。

		方法名必须相同，参数列表必须相同。
		返回值类型可以不同：引用类型的时候，子类的返回值类型要是父类或者是父类返回类型的子类。

		推荐：修饰符，返回值类型，方法名，参数列表都相同。

	注意：
		A:子类的访问权限一定要大于等于父类。
		B:子类的返回值类型要小于等于父类的返回值类型。
		C:私有方法是不能被重写的。
		D:静态只能被静态方法重写。
*/
class Person {
	/*
	public void show() {
		System.out.println("show Person");
		//function();
	}
	*/

    public float show() {
        System.out.println("show Person");
        //function();
        return  12.5f;
    }

    //不想让外界知道有这个方法，就私有修饰
    private void function() {
        System.out.println("function Person");
    }
}

class Student extends Person {
    public void method() {
        super.show();
        System.out.println("method Student");
    }

    public float show() {
        System.out.println("show Student");
        return 12.4f;
    }

    public void function() {
        System.out.println("function Student");
    }
}

class PersonTest {
    public static void main(String[] args) {
        Person p = new Person();
        p.show();
        //p.function();

        Student s = new Student();
        s.show();
        s.method();
        //s.function();
    }
}