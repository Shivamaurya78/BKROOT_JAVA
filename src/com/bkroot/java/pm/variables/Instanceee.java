package com.bkroot.java.pm.variables;

    class Car {
        String brand; // instance variable

        void setBrand(String b) {
            brand = b;
        }

        void showBrand() {
            System.out.println("Brand: " + brand);
        }

        public static void main(String[] args) {
            Car c1 = new Car();
            c1.setBrand("Honda");
            c1.showBrand();
        }
    }

