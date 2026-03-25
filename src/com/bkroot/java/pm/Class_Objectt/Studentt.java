package com.bkroot.java.pm.Class_Objectt;

public class Studentt {
        String name;
        int rollNo;

        // Constructors
        Studentt() { name = "Rohit"; rollNo = 108; }                     // Default
        Studentt(String name, int rollNo) { this.name = name; this.rollNo = rollNo; } // Parameterized

        void display() { System.out.println("Name: " + name + ", Roll No: " + rollNo); }

        public static void main(String[] args) {
            new Studentt().display();                  // Default constructor
            new Studentt("Rahul", 101).display();      // Parameterized constructor
        }
    }

