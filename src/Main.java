import java.util.Scanner;
public class Main {

        public static void main(String[] args) {
            int n;
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter the number of elements you want to store: ");
            n=sc.nextInt();
            addressBook  addressbook=new AddressBook();
            addressbook.store(n);;
            addressbook.print(n);

        }

    }
