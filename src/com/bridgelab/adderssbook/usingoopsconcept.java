package com.bridgelab.adderssbook;
import java.util.Scanner;
public class usingoopsconcept {
    public class oopsaddressBook extends oopsname {
        static String []fName = new String [100] ;
        static String []lName = new String [100] ;
        static String []add = new String [100] ;
        static String []city = new String [100];
        static String []state = new String [100];
        static String []zip = new String [100];
        static String []phNumber = new String [100];
        static String []email = new String [100];
        public static void Store(int n) {

            System.out.println("Welcome to Address Book");
            System.out.println();
            Scanner sc= new Scanner(System.in);
            for(int i=1;i<=n;i++)
            {  System.out.println("Enter "+i+" number Contact");
                System.out.println("Enter First and Last Name ");
                fName [i]= sc.next();
                lName [i]=sc.next();
                System.out.println("Enter Address ");
                add [i]=sc.next();
                System.out.println("Enter City ");
                city [i]=sc.next();
                System.out.println("Enter State ");
                state [i]=sc.next();
                System.out.println("Enter Zip ");
                zip [i]=sc.next();

                System.out.println("Enter Phone Number ");
                phNumber [i]=sc.next();
                System.out.println("Enter Email ");
                email [i]=sc.next();
                System.out.println();

            }


        }
        public static void Print(int n) {

            for(int i=1;i<=n;i++){
                System.out.println(i+" number Contact Information");
                /*
                 * obj of Name Class
                 */
                name obj1=new oopsName();
                obj1.oopsName(fName[i],lName[i]);;
                /*
                 * obj of Address class
                 */
                oopsaddress obj2=new oopsaddress();
                obj2.address(add[i], city[i], state[i], zip[i]);
                /*
                 * obj of EContact class
                 */
                oopscontact obj3=new oopscontact();
                obj3.contact(phNumber[i], email[i]);
                System.out.println();
            }

        }
}
