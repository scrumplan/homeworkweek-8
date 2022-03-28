package homeworkweek8;

import java.util.Scanner;

/*Write a program in Java to display the pattern like a diamond.
While loop*/
public class Program_14 {
    public static void main(String args[]) {
        int row, i, j, s = 1;
        System.out.print("Enter the number of rows you want to print: ");
        Scanner sc = new Scanner(System.in);
        row = sc.nextInt();
        s = row - 1;
        for (j = 1; j <= row; j++) {
            for (i = 1; i <= s; i++) {
                System.out.print(" ");
            }
            s--;
            for (i = 1; i <= 2 * j - 1; i++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        s = 1;
        for (j = 1; j <= row - 1; j++) {
            for (i = 1; i <= s; i++) {
                System.out.print(" ");
            }
            s++;
            for (i = 1; i <= 2 * (row - j) - 1; i++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}

