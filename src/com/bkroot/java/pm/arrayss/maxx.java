package com.bkroot.java.pm.arrayss;

public class maxx {
        int a, b;

        // Constructor 1 (no parameters)
        maxx() {
            a = 0;
            b = 0;
        }

        // Constructor 2 (one parameter)
        maxx(int a) {
            this.a = a;
            b = 10;
        }

        // Constructor 3 (two parameters)
        maxx(int a, int b) {
            this.a = a;
            this.b = b;
        }

        void display() {
            System.out.println("Value of a: " + a + ", Value of b: " + b);
        }

        public static void main(String[] args) {
            maxx m1 = new maxx();
            maxx m2 = new maxx(5);
            maxx m3 = new maxx(7, 12);

            m1.display();
            m2.display();
            m3.display();
        }
    }

