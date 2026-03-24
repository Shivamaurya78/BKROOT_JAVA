package com.bkroot.java.pm.variables;

class Company {
        static String companyName = "TCS"; // static variable

        void show() {
            System.out.println("Company: " + companyName);
        }

        public static void main(String[] args) {
            Company c1 = new Company();
            Company c2 = new Company();

            c1.show();
            c2.show();
        }
    }

