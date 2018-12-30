//addressBookDriver
package com.company;
import java.util.Scanner;

public class addressBookDriver {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        addressBooks addressBook = new addressBooks(1);
        int ask;
        String first, last, phone, email, dateOfBirth;
        do {
            System.out.println("Welcome to Address Book");
            System.out.println("[1] to add, [2] to search, [3] to view Address Book (-1 to quit):");
            ask = addressBook.validationInput();
            switch (ask) {
                case 1:
                    System.out.println("First Name: ");
                    first = sc.next();
                    System.out.println("Last Name: ");
                    last = sc.next();
                    System.out.println("Phone number: (720.444.5651)");
                    phone = sc.next();
                    System.out.println("Email (longsen@gmail.com)");
                    email = sc.next();
                    System.out.println("Date of Birth (01/23/1996)");
                    dateOfBirth = sc.next();
                    addressBook.addInfo(first, last, phone, email, dateOfBirth);
                    break;

                case 2:
                    System.out.println("Enter last name: ");
                    last = sc.next();
                    addressBook.searchLast(last);
                    break;

                case 3:
                    addressBook.view();
                    break;

            }
        } while (ask != -1);
        System.out.println("GoodBye");
    }

}
