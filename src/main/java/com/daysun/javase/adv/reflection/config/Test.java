package com.daysun.javase.adv.reflection.config;


/*
 * 反射运行配置文件内容：
 * 举例：属性文件来说
 * name=wangwu
 *
 * 配置文件中，应该有一部分是我们知道的，这样的内容是固定。
 * 有一部分是我们不知道，这样的内容是变化的。
 *
 * 假设我有一个配置文件，里面配置了类名和方法名。
 * className=???
 * methodName=???
 */

import java.io.FileReader;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Properties;

public class Test {
    public static void main(String[] args) {
        try {
            // Student s = new Student();
            // s.love();

            // Teacher t = new Teacher();
            // t.love();

            // Programmer p = new Programmer();
            // p.love();

            //上面方法不断的变来变去，不方便

            // 通过反射来做一次
            Properties prop = new Properties();

            // 把配置文件中的内容加载到集合中 prop.properties要放在最外面！！！
            FileReader fr = new FileReader("prop.properties");
            prop.load(fr);
            fr.close();



            // 通过集合获取数据
            String className = prop.getProperty("className");
            String methodName = prop.getProperty("methodName");

            Class c = Class.forName(className);

            Constructor con = c.getConstructor();
            Object obj = con.newInstance();

            Method m = c.getMethod(methodName);
            m.invoke(obj);


        } catch (Exception e) {

        }
    }
}
