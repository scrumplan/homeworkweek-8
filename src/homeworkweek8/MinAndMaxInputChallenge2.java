package homeworkweek8;

/*Read the numbers from the console entered by the user and print the minimum
and maximum number the user has entered.
-Before the user enters the number, print the message Enter number:
-If the user enters an invalid number, break out of the loop and print the minimum and maximum
number.
Hint:
-Use an endless while loop.
-Create a class with the name MinAndMaxInputChallenge.*/

import java.util.Scanner;

public class MinAndMaxInputChallenge2 {

    public static void main(String[] args) {
        MinAndMaxInputChallenge2 mmi = new MinAndMaxInputChallenge2();
        mmi.minMax();
    }

    public void minMax() {
        Scanner sc = new Scanner(System.in);
        int min = 0, max = 0;
        boolean first = true;
        while (true) {

            System.out.println("Enter number:");
            boolean b = sc.hasNextInt();
            if (b) {
                int number = sc.nextInt();
                if (first) {
                    first = false;
                    min = number;
                    max = number;
                }
                if (number < min) {
                    min = number;
                }
                if (number > max) {
                    max = number;
                }

            } else {
                break;
            }


        }
    }
}


