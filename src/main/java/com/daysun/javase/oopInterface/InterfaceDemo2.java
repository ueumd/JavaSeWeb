package com.daysun.javase.oopInterface;

/*
	接口的思想特点：
		A:接口是对外暴露的规则。
		B:接口是程序的功能扩展。
		C:接口的出现降低耦合性。
			耦合性：类与类的关联关系。
			高内聚：自己完成功能的能力。
			程序：低耦合，高内聚。
			效率和安全。
		D:接口可以用来多实现。

	单一原则：接口在定义规范的时候，尽量单一。(少)。

	接口的实现特点：
		A：要么类本身是抽象类。
		B：要么类实现接口的所有功能。

	类与接口的关系：
		实现关系，可以单实现，也可以多实现。
		它还可以在继承一个类的同时实现多个接口。
	类与类的关系：
		继承关系，可以单继承，也可以多层继承。
	接口与接口的关系：
		继承关系，可以单继承，也可以多继承。


	面试题：
		类与接口的关系? 实现。并且可以多实现。
		java中有多继承吗? java中类没有多继承，但是接口有多继承。
*/
interface AddOperator {
    public abstract void add();
}

interface DeleteOperator {
    public abstract void delete();
}

interface InterTest extends AddOperator,DeleteOperator {

}


/**
 * 接口的实现特点：
 * 		A：要么类本身是抽象类。
 * 		B：要么类实现接口的所有功能。
 */
abstract class TestTeacher extends Object implements AddOperator,DeleteOperator {

}

class StudentTest extends Object implements AddOperator,DeleteOperator {
    public void add() {
        System.out.println("添加学生");
    }

    public void delete() {
        System.out.println("删除学生");
    }
}

class InterfaceDemo2 {
    public static void main(String[] args) {

    }
}