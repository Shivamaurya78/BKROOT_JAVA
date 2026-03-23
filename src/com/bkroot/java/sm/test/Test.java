package com.bkroot.java.sm.test;
 // call the another file
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        System.out.println("Call the MathUtlity program file");
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the number ");
        int n = sc.nextInt();
        MathUtillity m = new MathUtillity();
        m.GetFibbonaci(n);
        System.out.println("Factoria is "+m.GetFactorial(n));
    }
}
