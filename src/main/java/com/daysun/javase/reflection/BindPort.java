package com.daysun.javase.reflection;

import java.lang.annotation.*;


/**
 * @Rentention Rentention用来标记自定义注解的有效范围，他的取值有以下三种：
    RetentionPolicy.SOURCE: 只在源代码中保留 一般都是用来增加代码的理解性或者帮助代码检查之类的，比如我们的Override;
    RetentionPolicy.CLASS: 默认的选择，能把注解保留到编译后的字节码class文件中，仅仅到字节码文件中，运行时是无法得到的；
    RetentionPolicy.RUNTIME: ，注解不仅 能保留到class字节码文件中，还能在运行通过反射获取到，这也是我们最常用的。

 @Target
 @Target指定Annotation用于修饰哪些程序元素。
 @Target也包含一个名为”value“的成员变量，该value成员变量类型为ElementType[ ]，ElementType为枚举类型，值有如下几个：

 ElementType.TYPE：能修饰类、接口或枚举类型
 ElementType.FIELD：能修饰成员变量
 ElementType.METHOD：能修饰方法
 ElementType.PARAMETER：能修饰参数
 ElementType.CONSTRUCTOR：能修饰构造器
 ElementType.LOCAL_VARIABLE：能修饰局部变量
 ElementType.ANNOTATION_TYPE：能修饰注解
 ElementType.PACKAGE：能修饰包

 使用了@Documented的可以在javadoc中找到
 使用了@Interited表示注解里的内容可以被子类继承，比如父类中某个成员使用了上述@From(value)，From中的value能给子类使用到。


 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@Documented
@Inherited
public @interface BindPort {
    String value() default "8080";
}
