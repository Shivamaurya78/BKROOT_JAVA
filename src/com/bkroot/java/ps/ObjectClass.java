package com.bkroot.java.ps;

class Car{
    String color;
    int speed;
    void drive(){
        System.out.println("car is driving");
    }
}
public class ObjectClass {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.color = "fortuner";
        c1.speed = 20;
        System.out.println(c1.color);
        System.out.println(c1.speed);
        c1.drive();
    }
}

