package com.bkroot.java.pm.variables;

class Demo {
        void show() {
            int x = 10; // local variable
            System.out.println("Local variable: " + x);
        }

        public static void main(String[] args) {
            Demo d = new Demo();
            d.show();
        }
    }

