package com.daysun.javase.api.string.que;

import java.util.Scanner;

/**
 *
 * 分析：
 * 		A:有哪些类
 * 			用户类,测试类
 * 		B:类有哪些行为和属性
 * 			用户类：
 * 				属性：用户名和密码
 * 				行为：登录。get()/set()方法
 * 			测试类：main(String[] args)。
 * 		C:类之间的关系
 * 			在测试类中调用用户类的登录功能。
 */
public class UserLogin {
    public static void main(String[] args) {

        // 造一个用户,已知的一个用户
        User u = new User();
        u.setUsername("admin");
        u.setPassword("admin");

        for (int x = 0; x < 3; x++) {
            // x=0,1,2
            // 要键盘录入用户名和密码。
            Scanner sc = new Scanner(System.in);

            System.out.println("请输入用户名：");
            String inputUsername = sc.nextLine();

            System.out.println("请输入密码：");
            String inputPassword = sc.nextLine();

            // 调用用户类的功能
            if (u.isLogin(inputUsername, inputPassword)) {
                System.out.println("登录成功");
                // 可以开始玩猜数字小游戏...
                break;
            } else {
                // 2,1,0
                if ((2 - x) == 0) {
                    System.out.println("账号被锁定，请和林青霞联系");
                } else {
                    System.out.println("登录失败,你还有" + (2 - x) + "次机会");
                }
            }
        }
    }
}
