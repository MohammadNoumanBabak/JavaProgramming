package day20_Arrays;

import java.util.Arrays;

public class ArraysIntro {

    public static void main(String[] args) {

        //create a variable that is capable enough to contain 5 names

       String myGroup[]= new String[5];
        myGroup[0]="Gunay";
        myGroup[1]="Neira";
        myGroup[2]="Suat";
        myGroup[3]="Hulya";
        myGroup[4]="Mikel";

        // System.out.println(myGroup); // hashcode
        System.out.println(Arrays.toString(myGroup));

        System.out.println("__________________________________________________________-");

        String[] days = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};

        System.out.println(Arrays.toString(days) );

        int number= 6;

        if(number <1 || number >7){
            System.err.println("Invalid Number");
            System.exit(0);
        }

        System.out.println(days[number-1]);

        System.out.println("______________________________________");

        String[] months = { "January","February","March","April","May","Jun","July","August","September","October","November","December"};

        System.out.println(Arrays.toString(months));

        int number1 = 12;

        if (number1 <1 || number1 > 12){
            System.err.println("Invalid Number");
            System.exit(0);

        }
        System.out.println(months[number1-1]);







    }
}
