package Week_10;

public class NestedLoopIntro {

    public static void main(String[] args) {
/*
        for (int i = 0; i < 5; i++) {

            for (int j = 0; j < 5; j++) {
                System.out.println("outer loop:" + i + "inner loop:" +j);
            }

        }

*/
/*
        int starNumberColumn=7;
        int starNumberRow=4;

        for (int i = 1; i <=starNumberRow ; i++) {
            // System.out.println();

            for (int j = 1; j <=starNumberColumn ; j++) {
                System.out.println("*");

            }
            System.out.println();

        }
*/
        /*
         *******
         *******
         *******
         *******
         */

        int starNumberColumn =7;
        int starNumberRow = 4;

        for (int i = 0; i < 4; i++) { //Row number

            for (int j = 0; j <7 ; j++) { //column number
                System.out.print("*"); // 7 times stars then go to next line
            }
            System.out.println();
        }

    }
}




