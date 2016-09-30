package com.daysun.javase.reflection;

/**
 * Created by Administrator on 2016/9/25.
 */
public class Person implements Comparable<Person>{
    int id;
    String name;


    public Person(){
        System.out.println("Person无参构造函数");
    }

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString(){
        return "{"+"id="+id+", name="+name+"}";
    }

    @Override
    public int hashCode(){
        System.out.println("========hashCode===========");
        return this.id;
    }

    @Override
    public boolean equals(Object o){
        System.out.println("========equalse===========");
        if(this==o) return true;
        if(!(o instanceof Person)) return false;
        Person person=(Person)o;

        return this.id==person.id;
    }

    public int compareTo(Person o) {
        return this.id-o.id;
    }

    public void showSelf(){
        System.out.println("{"+"id="+id+", name="+name+"}");
    }

    public void showSelf(int a){
        System.out.println("a: "+a);
    }
}
