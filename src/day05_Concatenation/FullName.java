package day05_Concatenation;

public class FullName {
    public static void main(String[] args) {

        String firstName = "Nouman";
        String LastName = "Babak";
        int age = 25;
        String jobTitle = "SDET";
        String companyName = "Apple Inc";
        double salary = 100000.58;

        String fullName = firstName + " " + LastName;

        // Full name of the person is _______
        System.out.println("full name of the person is " + fullName );

        //___is__years old
        System.out.println(fullName + " is " + age +" years old");

        //FullName is JonTitle, works at companyName, and FullName´ salary is salary
        System.out.println(fullName + " is " + jobTitle +", work at " + companyName +", and "+fullName+"´salary is "+salary);




    }
}
