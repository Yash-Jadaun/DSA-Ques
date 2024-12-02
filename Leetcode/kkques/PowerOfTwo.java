public class PowerOfTwo {

    public static boolean Power(int n) {
        // Check for non-positive numbers
        if (n <= 0) {
            return false;
        }

        while (n > 1) {
            if ((n & 1) != 0) {
                return false; // If n is odd, it's not a power of 2
            }
            n >>= 1; // Right shift n by 1
        }
        return true; // If we reach 1, it is a power of 2
    }

    public static void main(String[] args) {
        boolean check = Power(4); // Change this value to test other numbers
        System.out.println(check); // This will print true (1) for power of 2, false (0) otherwise
    }
}
