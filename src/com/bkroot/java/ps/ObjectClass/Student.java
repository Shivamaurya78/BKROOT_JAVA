package com.bkroot.java.ps.ObjectClass;

class Student2{
    String name;

    void display(){
        System.out.println("Name is " + name);
    }
}

 class Main {
    public static void main (String args[]){
        Student2 s1 = new Student2();

        s1.name = "Pavan";   // value assign ki

        s1.display();
    }
}