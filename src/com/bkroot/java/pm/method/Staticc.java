package com.bkroot.java.pm.method;


class Student{

    // static method
    static void greet() {
        System.out.println("Welcome to Student class");
    }
}

public class Staticc {
    public static void main(String[] args) {
        Student.greet(); // calling without object
    }
}

