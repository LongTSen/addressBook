//addressBooks class
package com.company;
import java.util.Arrays;
import java.util.Scanner;

public class addressBooks
{
    private info[] users;
    private int filledElements = 0;

    public addressBooks(int initialSize)
    {
        users = new info[initialSize];
    }

    //add information method
    public void addInfo(String first,String last, String phone, String email, String dateOfBirth)
    {
        if (filledElements == users.length)
        {
            doubleLength();
        }
        users[filledElements] = new info(first,last,phone,email,dateOfBirth);
        filledElements++;
    }

    //view all sorted by last name elements in addressBooks
    public void view()
    {
        String [] sortedName = new String[filledElements];  //Create an array of all last name
        for(int i=0; i<filledElements;i++)
        {
            sortedName[i]=users[i].getLast();
        }
        Arrays.sort(sortedName);
        for (int i=0; i<filledElements;i++) {
            for (int j = 0; j < filledElements; j++) {
                if (users[j].getLast().equalsIgnoreCase(sortedName[i]))
                {
                    System.out.println("\n");
                    System.out.printf("%-25s%13s\n", "First name: ", users[j].getFirst());
                    System.out.printf("%-25s%13s\n", "Last name: ", users[j].getLast());
                    System.out.printf("%-25s%13s\n", "Phone name: ", users[j].getPhone());
                    System.out.printf("%-25s%13s\n", "Email:  ", users[j].getEmail());
                    System.out.printf("%-25s%13s\n", "Date of Birth: ", users[j].getDateOfBirth());
                }
            }
        }
    }

    //search objects by last name
    public void searchLast(String last)
    {
        for(int i=0;i<filledElements;i++)
        {
            if (users[i].getLast().equalsIgnoreCase(last))
            {
                System.out.printf("\n%-25s%13s\n","First name: " ,users[i].getFirst());
                System.out.printf("%-25s%13s\n","Last name: " , users[i].getLast());
                System.out.printf("%-25s%13s\n","Phone name: " , users[i].getPhone());
                System.out.printf("%-25s%13s\n","Email:  " , users[i].getEmail());
                System.out.printf("%-25s%13s\n","Date of Birth: " ,users[i].getDateOfBirth());
            }
            else
            {
                System.out.println(last + " is not in Address Book");
            }
        }
    }

    //double length array when it full
    private void doubleLength()
    {
        info[] users2 = new info[2*users.length];
        System.arraycopy(users,0,users2,0,users.length);
        users = users2;
    }

    public int validationInput()
    {
            Scanner sc = new Scanner(System.in);
            while (!sc.hasNextInt()) {
                System.out.println("That's not a number!");
                System.out.println("Enter an integer number again");
                sc.next();
            }
            int number = sc.nextInt();
            return number;
    }

}

