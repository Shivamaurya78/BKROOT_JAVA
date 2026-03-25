package com.bkroot.java.pm.Class_Objectt;

public class ConstructorUsee {
        String name;
        int age;

        // Constructors
        ConstructorUsee() { name = "Unknown"; age = 0; }                  // Default
        ConstructorUsee(String name, int age) { this.name = name; this.age = age; }  // Parameterized

        void display() { System.out.println("Name: " + name + ", Age: " + age); }

        public static void main(String[] args) {
            new ConstructorUsee().display();                 // Default constructor
            new ConstructorUsee("Rahul", 21).display();      // Parameterized constructor
        }
    }

