package com.daysun.javase.ioandfile.file;

public class DiguiDemo {
    int x = 0;
    public void show(){
        x ++;
        System.out.print(x);
        System.out.print(" hello ");
        if(x == 3){
            System.exit(0);
        }
        show();
    }

    public static void main(String[] args) {
        DiguiDemo diguiDemo = new DiguiDemo();
        diguiDemo.show();
    }
}
