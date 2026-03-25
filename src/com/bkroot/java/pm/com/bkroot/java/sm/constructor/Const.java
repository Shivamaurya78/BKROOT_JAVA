package com.bkroot.java.sm.constructor;

public class Const {
    String name;
    int age;

    // Default Construtor
    Const()
    {
        System.out.println("I am Default Constractor");

    }
    Const (String name, int age)
    {
        System.out.println("I am Default parametrised Constractor taking name and age ");
        this.name = name;
        this.age = age;
    }
    void display()
    {
        String name="anv";

        System.out.println("Dispaly method My name is "+this.name+ " and agae is "+age);
    }
    public static void main(String[] args) {
        Const c = new Const("Shiva Maurya", 21);
        Const c1 = new Const();

        c.display();
    }
}
