package com.bkroot.java.pm.opps;
public class Inheritence {
        String name;
        int age;

        // Constructor
        Inheritence(String name, int age) {
            this.name = name;
            this.age = age;
        }

        void display() {
            System.out.println("Name: " + name + ", Age: " + age);
        }

        public static void main(String[] args) {
            Inheritence obj = new Inheritence("Rohit",14 );
            obj.display();
        }
    }

