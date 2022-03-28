package homeworkweek8;

/*Print the sequence 1 1 2 3 5 8 13 21 (Fibonacci number)*/

public class Program_9 {
    static void Fibonacci(int N) {
        int n1 = 0, n2 = 1;
        int c = 0;
        while (c < N) {
            System.out.print(n1 + " ");
            int n3 = n2 + n1;
            n1 = n2;
            n2 = n3;
            c = c + 1;
        }
    }
    public static void main(String[] args) {
        int N = 10;
        Fibonacci(N);
    }


}

