package homeworkweek8;

/*Display left angle triangle of * using nested for loops*/
public class Program_15LeftTriangle {
    public static void main(String[] args) {
        printLeftTriangle(5);

    }

    public static void printLeftTriangle(int a) {
        for (int i = 0; i < a + 1; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
