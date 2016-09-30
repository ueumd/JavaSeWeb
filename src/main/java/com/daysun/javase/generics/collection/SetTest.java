package com.daysun.javase.generics.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by Administrator on 2016/9/23.
 */
public class SetTest {
    public static void main(String[] args) {
        Set<String> set=new HashSet<String>();
        set.add("aaa");
        set.add("bbb");
        set.add("ccc");

        for (Iterator<String> iter = set.iterator(); iter.hasNext();){
            String value=iter.next();
            System.out.println(value);
        }
        System.out.println("-----------------------------");

        Set<People> set2=new HashSet<People>();
        set2.add(new People("zs",20,"beijing"));
        set2.add(new People("ls",20,"shanghai"));
        set2.add(new People("xs",30,"hongkong"));

        for(Iterator<People> iter=set2.iterator();iter.hasNext();){
            People people=iter.next();
            String name=people.getName();
            int age=people.getAge();
            String address=people.getAddress();

            System.out.println(name+" ,"+age+" ,"+address);
        }
    }
}

class People{
    private String name;
    private int age;
    private String address;

    public People(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof People)) return false;

        People people = (People) o;

        if (age != people.age) return false;
        if (name != null ? !name.equals(people.name) : people.name != null) return false;
        return address != null ? address.equals(people.address) : people.address == null;

    }


    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + age;
        result = 31 * result + (address != null ? address.hashCode() : 0);
        return result;
    }
}
