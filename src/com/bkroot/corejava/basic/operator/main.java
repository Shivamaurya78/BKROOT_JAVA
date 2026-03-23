package com.bkroot.corejava.basic.operator;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        System.out.println("Calculator");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int a = sc.nextInt();
        System.out.println("Enter the second number");
        int b = sc.nextInt();

        int add = a+b;
        int sub= a-b;
        int mul =  a*b;
        int div = a/b;
        System.out.println("The addition is "+ add);
        System.out.println("The substaction is "+sub);
        System.out.println("The Multiplilcaton is "+mul);
        System.out.println("The divider is "+div);


    }


}
