package com.bkroot.corejava.basic.OOPS.Inheritance;
// single Inheritance

class Animall{
        void eat()
        {
            System.out.println("Animal is eating ");
        }
    }
    class dog extends Animall
    {
        void bark()
        {
            System.out.println("Animal is barking ");
        }
    }
 public class Animal {
     public static void main(String[] args) {
         dog d = new dog();
         d.eat();
         d.bark();
     }
 }

