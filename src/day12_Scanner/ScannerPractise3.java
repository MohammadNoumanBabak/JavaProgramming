package day12_Scanner;

import java.util.Scanner;

public class ScannerPractise3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your full name: ");//Enter
        String fullName =input.nextLine(); //wooden SpoonEnter

        System.out.println("Enter your Programming Language:");
        String programming = input.nextLine();//Java Programming LanguageEnter

        System.out.println("Enter your age:");
        int age = input.nextInt(); //24Enter

        input.nextLine(); // capture the Enter key that user pressed for nextInt()

        System.out.println("Enter your school Name:");
        String schoolName = input.nextLine(); //Enter


        System.out.println("fullName = " + fullName);
        System.out.println("programming = " + programming);
        System.out.println("age =" + age);
        System.out.println("schoolName = " + schoolName);

        input.close();


    }
}
