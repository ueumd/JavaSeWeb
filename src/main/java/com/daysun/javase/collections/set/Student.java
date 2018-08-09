package com.daysun.javase.collections.set;

public class Student implements Comparable<Student> {
    private String name;
    private int age;

    public Student() {
        super();
    }

    public Student(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // @Override
    // public int hashCode() {
    // // return 0;
    // A:zhangsan,20 = 50 + 20*11
    // B:lisi,50 = 20 + 50*11
    // return name.hashCode() + age;
    // }

    // 提高效率
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + age;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
         System.out.println(this+"---"+obj);
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Student other = (Student) obj;
        if (age != other.age)
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", age=" + age + "]";
    }

    /**
     * 按学生年龄排序
     * @param o
     * @return
     */
    public int compareTo(Student o) {

        //		// 按照年龄比较(主要条件)
//		// this -- 谁调用代表谁
//		// s -- 被比较的
//		int num = this.age - s.age;
//
//		// 但是，它没有考虑到年龄相同的情况下，姓名可能不同。
//		// 所以，这个代码的难点在于自己要分析出次要条件
//		int num2 = num == 0 ? this.name.compareTo(s.name) : num;
//		return num2;
//        return 0;

        return this.age-o.age;
    }
}
