package homeworkweek8;

/*Display right angle triangle of @ using nested for loops*/

public class Program_8 {
    public static void main(String[] args) {

        int i, j, n = 5;
        //for loop method
        for (i = 0; i < n; i++) {
            for (j = 0; j <= i; j++) {
                System.out.print("@");
            }
            System.out.println();
        }
    }
}

