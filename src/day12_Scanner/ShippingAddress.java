package day12_Scanner;

import java.util.Scanner;

public class ShippingAddress {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your full name:");//EnterEnter
        String fullName = scan.nextLine(); // Java ProgrammingEnter

        System.out.println("Enter your Building number");
        String building = scan.next(); //9725A


        scan.nextLine(); // Enter

        System.out.println("Enter your street name");
        String street = scan.nextLine();

        System.out.println("Enter city name:");
        String city = scan.nextLine(); //Salamanca

        System.out.println("Enter your state name:");
        String state = scan.next();// Castia y lionEnter

        System.out.println("Enter your zip code:");
        String zipCode = scan.next();//37007

        scan.nextLine(); // EnterEnter

        System.out.println("Enter your country name:");
        String country = scan.nextLine();

        scan.close();




    }
}

/*
1. enter your full name ( nextLine() )
2.enter your building name ( next() )
3.enter your street name ( nextLine() )
4.enter your city name ( nextLine () )
5.enter your state ( next() )
6.enter your zip code (next() )

Display the shipping address

 */