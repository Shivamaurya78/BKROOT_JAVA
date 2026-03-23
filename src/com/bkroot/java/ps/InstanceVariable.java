package com.bkroot.java.ps;

class Student {
    String name;  // instance variable
    int age;      // instance variable

    void show() {
        System.out.println(name + " " + age);
    }
}

public class InstanceVariable {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Pavan";
        s1.age = 20;

        Student s2 = new Student();
        s2.name = "Rahul";
        s2.age = 22;

        s1.show();
        s2.show();
    }
}
