package day10_NestedIf;

public class TernariesIntro {

    public static void main(String[] args) {

        int n = 100;

        if(n%2 == 0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
        System.out.println("_____________________________________-");

        String result  =(n%2 == 0)? "Even" : "Odd" ;

        System.out.println(result);

        System.out.println("________________________________________");

        int age = 17;
        /*
        if(age >= 21){
            System.out.println("Eligible");
        }else{
            System.out.println("Not eligible");

        }
            */

        String result2 =(age >=21) ? "Eligible" : "Not eligible";
        System.out.println(result2);

        System.out.println("_____________________________________");

        int number = 100;

        /*
        if{(number>0)
            System.out.println("Positive");
        } else if (number < 0) {
            System.out.println("Negative");
        }else {
            System.out.println("Zero");
        }
            */

        String result3 = (number>0) ? "Positive" :(number < 0)? "Negative" : ("Zero") ;

        System.out.println(result3);

    }





}