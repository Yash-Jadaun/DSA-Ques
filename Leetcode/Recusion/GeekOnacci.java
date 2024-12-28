import java.util.Scanner;

public class GeekOnacci {
    // Function to compute the nth Geek-onacci number
    public static int geekOnacci(int A, int B, int C, int N) {
        // Handle cases for small N directly
        if (N == 1) return A;
        if (N == 2) return B;
        if (N == 3) return C;
        
        // Create an array to store values of the Geek-onacci series
        int[] series = new int[N];
        
        // Initialize the first three values
        series[0] = A;
        series[1] = B;
        series[2] = C;
        
        // Calculate the series values for n >= 3
        for (int i = 3; i < N; i++) {
            series[i] = series[i-1] + series[i-2] + series[i-3];  // Sum of previous three numbers
        }
        
        // Return the Nth Geek-onacci number
        return series[N-1];
    }

    public static void main(String[] args) {
        // Scanner to read the input
        Scanner sc = new Scanner(System.in);
        
        // Read the number of test cases
        int T = sc.nextInt(); 
        
        // Process each test case
        for (int t = 0; t < T; t++) {
            // Read the values A, B, C, N
            int A = sc.nextInt();
            int B = sc.nextInt();
            int C = sc.nextInt();
            int N = sc.nextInt();
            
            // Output the Nth Geek-onacci number for this test case
            int result = geekOnacci(A, B, C, N);
            System.out.println(result);
        }
        
        // Close the scanner
        sc.close();
    }
}
