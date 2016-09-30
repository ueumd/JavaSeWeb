package com.daysun.javase.reflection;

/**
 * Created by Administrator on 2016/9/26.
 */
public class Car {

    private String color="red";


    public String getColor(){
        return "color: "+this.color;
    }

    private String showCar(String car){
        return "car: "+car;
    }

}
