package com.bkroot.java.pm.method;

class Car {
        String brand;

        // constructor
        Car(String b) {
            brand = b;
        }

        // instance method
        void showBrand() {
            System.out.println("Car brand is: " + brand);
        }
    }

    public class Instancee {
        public static void main(String[] args) {

            // object create
            Car c1 = new Car("Toyota");

            // calling instance method
            c1.showBrand();
        }
    }

