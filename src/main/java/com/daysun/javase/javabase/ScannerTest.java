package com.daysun.javase.javabase;

import java.util.Scanner;

/**
 * Created by Administrator on 2016/9/25.
 */
public class ScannerTest {
    public static void main(String[] args) {
       while (true){
           Scanner scanner=new Scanner(System.in);
           System.out.println("please input your name:");
           String name=scanner.next();
           System.out.println("output name: "+name);
       }
    }
}
