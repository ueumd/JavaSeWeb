package com.daysun.javase.adv.reflection.demo2;

public class Car {

    private String color = "red";


    public String getColor() {
        return "color: " + this.color;
    }

    private String showCar(String car) {
        return "car: " + car;
    }

}
