package week04;

public class CodilityTask {
    /*
    Task 1:
  Write a function:
            that, given a positive integer N  However, any number divisible by 2, 3 or 5 shouldbe replaced by the word

                                Codility -- 2
                                Test     -- 3
                                Coders   -- 5

            - If a number is divisible by more than one of the numbers:2,3 or 5, it should be replaced by a concatenation of the respective words Codility, Test and Coders in this given order.

                                EXPECTED

                        numbers divisible by both 2 and 3 should be replacée by CodilityTest
                        INPUT : 6    OUTPUT :  CodilityTest

                        numbers divisible by allthree numbers: 2,3 and 5, should be replaced by CodilityTestCoders.
                        INPUT : 30    OUTPUT :  CodilityTestCoders


     */
    public static void main(String[] args) {

        int number= 30;
        String result="";
        if (number>0) {
        if (number % 2 == 0) {
            result="codility";


        }
        if (number % 3 == 0) {
            result+="Test";

        }

        if (number%5==0) {

            result += "coders";
        }else result = ("Number is not divisible by 2 or 3 or 5 ");



        } else {
            System.err.println("your number is smaller than 0");
            System.out.println("result = " + result);





        }


    }


}
