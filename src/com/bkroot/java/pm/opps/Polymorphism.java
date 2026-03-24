package com.bkroot.java.pm.opps;
public class Polymorphism {

        // Method 1: No parameters
        void show() {
            System.out.println("No parameters");
        }

        // Method 2: One parameter
        void show(int a) {
            System.out.println("One parameter: " + a);
        }

        // Method 3: Two parameters
        void show(int a, int b) {
            System.out.println("Two parameters: " + a + ", " + b);
        }

        public static void main(String[] args) {
            Polymorphism obj = new Polymorphism();

            obj.show();          // Calls method with no parameters
            obj.show(10);        // Calls method with one parameter
            obj.show(5, 15);     // Calls method with two parameters
        }
    }

