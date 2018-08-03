package com.daysun.javase.oopInterface;

/*
编程题：
传智播客的老师有基础班的，也有就业班的。
  共性：
	属性：姓名，年龄
	功能：讲课。
  现在又要针对日语这种小语种单独开班，需要部分基础班老师和部分就业班老师会说日语。
  请用所学知识把上面的内容用代码体现。

	老师：
		基础班老师
			部分会日语的基础班老师
		就业班老师
			部分会日语的就业班老师
*/

interface SpeakJapanese {
    public abstract void speakJapanese();
}

abstract class Teacher {
    //姓名
    private String name;
    //年龄
    private int age;

    public Teacher(){}

    public Teacher(String name,int age) {
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

    //抽象的教的功能
    public abstract void teach();
}

class BasicTeacher extends Teacher {
    public BasicTeacher(){}

    public BasicTeacher(String name,int age) {
        super(name,age);
    }

    public void teach() {
        System.out.println("讲解JavaSE");
    }
}

class WorkTeacher extends Teacher {
    public WorkTeacher(){}

    public WorkTeacher(String name,int age) {
        super(name,age);
    }

    public void teach() {
        System.out.println("讲解Android");
    }
}

class PartOfBasicTeacher extends BasicTeacher implements SpeakJapanese {
    public PartOfBasicTeacher(){}

    public PartOfBasicTeacher(String name,int age) {
        super(name,age);
    }

    public void speakJapanese() {
        System.out.println("说日语");
    }
}

class PartOfWorkTeacher extends WorkTeacher implements SpeakJapanese {
    public PartOfWorkTeacher(){}

    public PartOfWorkTeacher(String name,int age) {
        super(name,age);
    }

    public void speakJapanese() {
        System.out.println("说日语");
    }
}

class TeacherTest {
    public static void main(String[] args) {
        PartOfBasicTeacher pbt = new PartOfBasicTeacher("貂蝉",18);
        System.out.println(pbt.getName()+"---"+pbt.getAge());
        pbt.teach();
        pbt.speakJapanese();
    }
}
