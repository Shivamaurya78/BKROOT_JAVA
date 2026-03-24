package com.bkroot.java.pm.arrayss;

public class summ {
        int a, b, c;

        // Constructors
        summ() { a = b = c = 0; }
        summ(int a, int b) { this.a = a; this.b = b; c = 0; }
        summ(int a, int b, int c) { this.a = a; this.b = b; this.c = c; }

        void displaySum() {
            System.out.println("sum = " + (a + b + c));
        }

        public static void main(String[] args) {
            new summ().displaySum();
            new summ(5, 10).displaySum();
            new summ(3, 7, 2).displaySum();
        }
    }

