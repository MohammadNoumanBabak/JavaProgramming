package day20_Arrays;

import java.util.Arrays;

public class ArraysPractice {

    public static void main(String[] args) {

        // store ten elements : 10,20,50,70

        int[] numbers = {10,20,50,70}; // size :4

        System.out.println(Arrays.toString(numbers));

        System.out.println("________________________________________");

        int[]scores = new int[5];
        scores[1]=85;
        scores[scores.length-1]=95;
        scores[3]=75;
        scores[0]= 65;
        scores[2]=55;
        System.out.println(Arrays.toString(scores));

        System.out.println("_____________________________________________");

        String[] months = { "January","February","March","April","May","Jun","July","August","September","October","November","December"};

        for (int i = 0; i < months.length; i++) {//i: represents the index number of array starting from 0
            System.out.println(months[i]);

        }


        System.out.println("_______________________________________________________");

        for (int i = months.length-1; i >=0 ; i--) { //i: represents the index number of array starting from last index
            System.out.println(months[i]);

        }

    }
}
