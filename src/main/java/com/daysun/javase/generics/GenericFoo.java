package com.daysun.javase.generics;

/**
 * Created by Administrator on 2016/9/22.
 */
//默认T是Object  可以限定extends ArrayList

public class GenericFoo<T> {
    private T foo;

    public T getFoo() {
        return foo;
    }

    public void setFoo(T foo) {
        this.foo = foo;
    }

    public static void main(String[] args){
        GenericFoo<Boolean> foo1=new GenericFoo<Boolean>();
        GenericFoo<Integer> foo2=new GenericFoo<Integer>();

        foo1.setFoo(new Boolean(false));
        foo2.setFoo(new Integer(10));

        Boolean b=foo1.getFoo();
        Integer i=foo2.getFoo();

        System.out.println(b);
        System.out.println(i);

        /**
         * 不建议下面这样用
         */
        GenericFoo a=new GenericFoo();
        a.setFoo("hello");
        String str=(String)a.getFoo();
        System.out.println(str);
    }
}
