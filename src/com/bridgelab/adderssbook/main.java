package com.bridgelab.adderssbook;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements you want to store: ");
        n = sc.nextInt();
        oopsaddress addressbook = new oopsaddress();
        oopsaddress.Store(n);
        oopsaddress.print(n);

    }
}
