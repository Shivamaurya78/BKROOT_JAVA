package com.bkroot.java.pm.Constructor;
public class Overloading2 {
        int num1, num2;

        // Constructor 1 (no parameters)
        Overloading2() {
            num1 = 0;
            num2 = 0;
        }

        // Constructor 2 (one parameter)
        Overloading2(int num1) {
            this.num1 = num1;
            num2 = 10;
        }

        // Constructor 3 (two parameters)
        Overloading2(int num1, int num2) {
            this.num1 = num1;
            this.num2 = num2;
        }

        void display() {
            System.out.println("Num1: " + num1 + ", Num2: " + num2);
        }

        public static void main(String[] args) {
            Overloading2 o1 = new Overloading2();
            Overloading2 o2 = new Overloading2(5);
            Overloading2 o3 = new Overloading2(5, 15);

            o1.display();
            o2.display();
            o3.display();
        }
    }

