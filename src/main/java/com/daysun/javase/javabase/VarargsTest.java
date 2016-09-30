package com.daysun.javase.javabase;

//可变参数必须放在最后面,本质上是一个数组
public class VarargsTest {
    public static int sum(String str,int... nums){
        int sum=0;
        for(int num:nums){
            sum+=num;
        }
        return sum;
    }
    public static void main(String[] args) {
        int result=sum("hello",1,2,3,4);
        System.out.println(result);

        int result2=sum("hello",new int[]{2,3});
        System.out.println(result2);
    }
}
