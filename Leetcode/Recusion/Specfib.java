import java.util.Scanner;

public class Specfib {

    public static int fib(int a, int b, int n) {
        if (n == 0) {
            return a; // F(0) = a
        }

        if (n == 1) {
            return b; // F(1) = b
        }

        // Correct recurrence relation: F(n) = F(n-1) + F(n-2)
        return fib(a, b, n - 1) + fib(a, b, n - 2); // Sum of previous two Fibonacci numbers
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input values for a, b, and n
        int a = sc.nextInt(); // F(0)
        int b = sc.nextInt(); // F(1)
        int n = sc.nextInt(); // The position in the Fibonacci sequence

        // Calculate the nth Fibonacci number starting with a and b
        int ans = fib(a, b, n);
        System.out.println(ans);
    }
}
