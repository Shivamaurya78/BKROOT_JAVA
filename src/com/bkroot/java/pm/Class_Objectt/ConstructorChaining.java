package com.bkroot.java.pm.Class_Objectt;

public class ConstructorChaining {
        String name;
        int age;

        // Constructor 1 (no parameters)
        ConstructorChaining() {
            this("Default Name");  // Calls Constructor 2
        }

        // Constructor 2 (one parameter)
        ConstructorChaining(String name) {
            this(name, 18);       // Calls Constructor 3
        }

        // Constructor 3 (two parameters)
        ConstructorChaining(String name, int age) {
            this.name = name;
            this.age = age;
        }

        void display() {
            System.out.println("Name: " + name + ", Age: " + age);
        }

        public static void main(String[] args) {
            ConstructorChaining obj1 = new ConstructorChaining();              // Uses no-arg constructor
            ConstructorChaining obj2 = new ConstructorChaining("Rahul");       // Uses 1-arg constructor
            ConstructorChaining obj3 = new ConstructorChaining("Amit", 22);   // Uses 2-arg constructor

            obj1.display();
            obj2.display();
            obj3.display();
        }
    }

