package com.bkroot.java.sm.operator;

import java.util.Scanner;

public class Comparison {
    public static void main(String[] args) {
        System.out.println("Comparison of number ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number ");
        int a = sc.nextInt();
        System.out.println("Enter the second number");
        int b = sc.nextInt();

        if(a>b)
        {
            System.out.println(a+ "Is a greater");
        }
        else {
            System.out.println(b+ " Is a greater ");
        }
    }
}
