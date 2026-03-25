package com.bkroot.java.pm.Constructor;

public class Constructor1 {
        String name;
        int age;

        // Default Constructor
        Constructor1() {
            name = "Pritam";
            age = 18;
        }

        // Parameterized Constructor
        Constructor1(String name, int age) {
            this.name = name;
            this.age = age;
        }

        void display() {
            System.out.println("Name: " + name + ", Age: " + age);
        }

        public static void main(String[] args) {
            Constructor1 c1 = new Constructor1();
            Constructor1 c2 = new Constructor1("Pritam", 18);

            c1.display();
            c2.display();
        }
    }

