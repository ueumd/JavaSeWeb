package com.daysun.javase.generics;

/**
 *   Math.random(); 结果为0-1间的一个随机数(包括0,不包括1)
 Math.round(num); 参数num为一个数值，函数结果为num四舍五入后的整数。
 Math.floor(num); 参数num为一个数值，函数结果为num的整数部分。 向下取整
 Math.ceil(n); 返回大于等于n的最小整数。向上取整
 */
public class GenericArray<T> {
    private T[] fooArray;

    public T[] getFooArray() {
        return fooArray;
    }

    public void setFooArray(T[] fooArray) {
        this.fooArray = fooArray;
    }

    public static void main(String[] args) {
        GenericArray<String> foo = new GenericArray<String>();

        String[] str1 = {"apple", "orange", "banana"};
        String[] str2 = null;

        foo.setFooArray(str1);
        str2 = foo.getFooArray();

        for (int i = 0; i < str2.length; i++) {
            System.out.println(str2[i]);
        }


    }
}
