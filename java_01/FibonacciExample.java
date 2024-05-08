import java.util.io;
public class FibonacciExample {
    static int fibonacciRecursion(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1 || n == 2) {
            return 1;
        } else {
            return fibonacciRecursion(n - 1) + fibonacciRecursion(n - 2);
        }
    }

    public static void main(String[] args) {
        int maxNumber = 20; // Change this to the desired number of terms
        for (int i = 0; i < maxNumber; i++) {
            System.out.print(fibonacciRecursion(i) + " ");
        }
    }
}
