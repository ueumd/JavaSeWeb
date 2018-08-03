package com.daysun.javase.oopAbstract;
/*
	需求：公司中程序员有姓名，工号，薪水，工作内容。
		  项目经理除了有姓名，工号，薪水，还有奖金，工作内容。

	分析：
		程序员
			姓名，工号，薪水
			工作内容
		项目经理
			姓名，工号，薪水，还有奖金
			工作内容
*/
abstract class Employee {
	//姓名
	private String name;
	//工号
	private String employeeId;
	//薪水
	private int salary;

	public Employee(){}

	public Employee(String name,String employeeId,int salary) {
		this.name = name;
		this.employeeId = employeeId;
		this.salary = salary;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeId() {
		return employeeId;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getSalary() {
		return salary;
	}

	//抽象方法
	public abstract void jobContent();
}

class Programmer extends Employee {
	public Programmer(){}

	public Programmer(String name,String employeeId,int salary) {
		super(name,employeeId,salary);
	}

	public void jobContent() {
		System.out.println("程序猿辛辛苦苦的写代码");
	}
}

class Manager extends Employee {
	//奖金
	private int bonus;

	public Manager(){}

	public Manager(String name,String employeeId,int salary,int bonus) {
		super(name,employeeId,salary);
		this.bonus = bonus;
	}

	public void setBonus(int bonus) {
		this.bonus = bonus;
	}

	public int getBonus() {
		return bonus;
	}

	public void jobContent() {
		System.out.println("经理很苦逼的去和客户谈需求");
	}
}

class EmployeeTest {
	public static void main(String[] args) {
		//测试程序猿和经理都采用构造方法。
		//Employee
		Employee employee = new Programmer("杨龙好","9527",7300);
		System.out.println(employee.getName()+"---"+employee.getEmployeeId()+"---"+employee.getSalary());
		employee.jobContent();


		employee = new Manager("土豪","12306",2000,10000);
		System.out.println(employee.getName()+"---"+employee.getEmployeeId()+"---"+employee.getSalary());
		employee.jobContent();

		Manager m = (Manager) employee;
		System.out.println(m.getBonus());

		//作业：请采用set方法赋值并使用，效果更使用构造一样即可
	}
}
