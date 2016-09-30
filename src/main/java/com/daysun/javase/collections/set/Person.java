package com.daysun.javase.collections.set;

/**
 * Created by Administrator on 2016/9/25.
 */
public class Person implements Comparable<Person>{
    int id;
    String name;

    public Person(int id, String name) {
        this.id = id;
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
}
