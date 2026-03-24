package com.bkroot.java.pm.Class_Objectt;
public class Circle {
        double radius;

        // Constructors
        Circle() { radius = 1.0; }
        Circle(double r) { radius = r; }

        double area() {
            return 3.1416 * radius * radius;
        }

        double circumference() {
            return 2 * 3.1416 * radius;
        }

        public static void main(String[] args) {
            Circle c1 = new Circle();       // Default radius 1.0
            Circle c2 = new Circle(5.0);    // Radius 5.0

            System.out.println("Circle 1: Area = " + c1.area() + ", Circumference = " + c1.circumference());
            System.out.println("Circle 2: Area = " + c2.area() + ", Circumference = " + c2.circumference());
        }
    }

