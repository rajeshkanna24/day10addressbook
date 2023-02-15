package com.bridgelab.adderssbook;
import java.util.Scanner;
public class addressbook {
    public static void main(String[] args) {
        System.out.println("Welcome to Address Book");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First and Last Name ");
        String fname = sc.next();
        String lname = sc.next();


        System.out.println("Enter Address ");
        String add = sc.next();
        System.out.println("Enter City ");
        String city = sc.next();
        System.out.println("Enter State ");
        String state = sc.next();
        System.out.println("Enter Zip ");
        String zip = sc.next();

        System.out.println("Enter Phone Number ");
        String phNumber = sc.next();
        System.out.println("Enter Email ");
        String email = sc.next();

        /*
         * object of Name Class
         */
        name obj1 = new name();
        obj1.name(fname, lname);
        /*
         * object of Address class
         */
        address obj2 = new address();
        obj2.address(add, city, state, zip);
        /*
         * object of Contact class
         */
        contact obj3 = new contact();
        obj3.econtact(phNumber, email);
    }
}
