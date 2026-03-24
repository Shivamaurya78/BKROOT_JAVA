package com.bkroot.java.ps;

import java.sql.SQLOutput;

class Studentz {
    String name;

    //constuctore
    Studentz() {
        name = "pavan";
    }
//method
    void display() {
        System.out.println(name);
    }
}
public class Constructor {
    public static void main(String args[]){
        Studentz s = new Studentz(); //constructor autocall
        s.display(); // manually call


    }
}
