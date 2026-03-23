package com.bkroot.corejava.basic.OOPS.ClassObject;

public class Circle {
    int radius;
    double dis()
    {
        return 3.14*radius*radius;
    }
    public static void main(String[] args) {
        System.out.println("Area of circle ");
        Circle c = new Circle();
        c.radius = 5;
        c.dis();
        System.out.println(c.dis());

    }
}
