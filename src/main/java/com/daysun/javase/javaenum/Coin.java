package com.daysun.javase.javaenum;

/**
 * 定义的枚举都继承java.lang.Enum
 */
public enum  Coin {

    //枚举成员默认都是public static final
    //定义的每个枚举成员都是枚举的实例
    /**
     * 在编译时刻就能确定该枚举有几个实例，分别是什么，在运行时我们无法再使用该枚举创建新的实例
     */
    penny("hello"),
    nickel("world"),
    dime("welcome"),
    quarter("hello world");

   // penny2; //这样会报错的 必须penny2("hello2")


    //上面定义的传给下面,需要什么参数，构造方法接收什么参数
    private String value22;
    public String getValue22(){
        return  value22;
    }

    Coin(String value){ // penny("hello"),
        this.value22=value;
    }

    public static void main(String[] args) {
        Coin coin=Coin.penny;
        System.out.println(coin.getValue22());
    }
}
