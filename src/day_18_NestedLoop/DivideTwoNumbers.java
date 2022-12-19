package day_18_NestedLoop;

public class DivideTwoNumbers {

    public static void main(String[] args) {

        int a = 100;
        int b = 9;

        int count = 0; // count = ....

        while(a >= b){
            a -= b;
            count++;

        }

        System.out.println(count+ " with the remainder of " + a);
    }
}
