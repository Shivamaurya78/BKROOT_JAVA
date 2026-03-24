package com.bkroot.java.sm.constructor;

public class Const {
    String name;
    int age;

    Const()
    {
        // Default Construtor
    }
    Const (String name, int age)
    {
        this.name = name;
        this.age = age;
    }
    void display()
    {
        System.out.println("My name is "+name+ " and agae is "+age);
    }
    public static void main(String[] args) {
        Const c = new Const("Shiva Maurya", 21);
        c.display();
    }
}
