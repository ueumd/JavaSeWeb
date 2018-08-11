package com.daysun.javase.exception;

/*
 * 面试题：
 * 1:final,finally,finalize的特点及区别?
 * 		A:final是一个修饰符，可以修饰类，修饰方法，修饰变量
 * 			它修饰的类不能被继承。
 * 			它修饰的方法不能被重写。
 * 			它修饰的变量是一个常量。
 * 		B:finally是异常处理的一部分。
 * 			特点是：永远会执行。
 * 			特殊情况：在执行到finally之前jvm退出了。
 * 		C:finalize是Object类的方法。用于垃圾回收的。
 *
 * 2:在catch里面有一个return语句，请问finally里面的内容还会被执行吗?如果会，请问是在return前，还是后。
 * 		答：在return前。
 *
 * 		其实应该是在return之间执行的。
 *
 * 3:请自己写一个代码表达这样的一种意思：
 * 		finally里面仅仅是为了释放资源，而不改变以前的结果。
 */
public class FinallyDemo {
    public static void main(String[] args) {
        show();

        System.out.println(demo());
    }

    public static int demo() {
        int x = 0;
        try {
            x = 0;
            System.out.println(x / 0);
            x = 30;
        } catch (ArithmeticException a) {
            x = 40;
            return x; // 在这里就形成了一条返回路径，return
            // 40。但是，它发现还有finally，所以去把finally里面执行了。最后，在回到以前的return继续。
        } finally {
            x = 50;
            return x; // 如果这里还有一个返回路径，那么，将替代以前的返回路径，结果是50。
        }
        // return x;
    }

    private static void show() {
        try {
            System.out.println(0 / 0);
        } catch (ArithmeticException a) {
            a.printStackTrace();
            return;
        } finally {
            System.out.println("over");
        }
    }
}