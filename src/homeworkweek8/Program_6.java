package homeworkweek8;


/*Write a program in Java to display the pattern like a triangle with a number.
For eg.
Input number of rows: 10*/
public class Program_6 {
    public static void main(String[] args) {

        int i, j, number, n = 10;
        //loop for rows
        for (i = 0; i < n; i++) {
            number = 1;
            //loop for columns
            for (j = 0; j <= i; j++) {

                System.out.print(number + " ");
                //incrementing the value of number
                number++;
            }

            System.out.println();
        }


    }
}




