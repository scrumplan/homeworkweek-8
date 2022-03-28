package homeworkweek8;

/*Write a program to input any number and check if it Armstrong number or not*/
public class Program_10 {

    public static void main(String[] args) {
        //change number int value, and get the result
        int number = 153, originalNumber, remainder, result = 0;
        // Scanner obj = new Scanner(System.in);
        // System.out.println("Enter the number : ");
        // obj.nextLine();
        originalNumber = number;
        while (originalNumber != 0) {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, 3);
            originalNumber /= 10;
        }
        if (result == number)
            System.out.println(number + " is an Armstrong number. ");
        else
            System.out.println(number + "  is not an Armstrong number. ");

    }
}

