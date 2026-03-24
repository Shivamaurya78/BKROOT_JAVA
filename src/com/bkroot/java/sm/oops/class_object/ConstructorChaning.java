package com.bkroot.corejava.basic.OOPS.ClassObject;

public class ConstructorChaning {
    String name;
    int age;

    ConstructorChaning()
    {
        this("Shiva Maurya",20);
    }
    ConstructorChaning(String name,int age)
    {
        this.name = name;
        this.age = age;
    }
    void display()
    {
        System.out.println(name + "  "+age);
    }

    public static void main(String[] args) {
        ConstructorChaning co = new ConstructorChaning();
        co.display();
    }
}
