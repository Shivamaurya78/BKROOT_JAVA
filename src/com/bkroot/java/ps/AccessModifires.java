package com.bkroot.java.ps;


class Studentt{
    public String name= "pavan";               //public
    private int age=20;                       //private
    protected String collage = "ABC";         //ptotected
    String branch = "B.TECH"; //default
    void show(){
        System.out.println("Age " + age);    //private yahi access hoga.
    }

}
public class AccessModifires {
    public static void main(String[] args) {
        Studentt s1 = new Studentt();
        System.out.println(s1.name);         //public
        System.out.println(s1.collage);
        System.out.println(s1.branch);
        s1.show();
    }

}
