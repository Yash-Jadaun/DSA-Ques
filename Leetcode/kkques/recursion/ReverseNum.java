import java.util.*;

public class ReverseNum {
   
    public static List<Integer> fun(int n) {
        List<Integer> list = new ArrayList<>();

        // Loop to extract digits until n becomes 0
        while (n != 0) {
            int lastDigit = n % 10;  // Get the last digit
            list.add(lastDigit);      // Add it to the list
            n = n / 10;               // Remove the last digit from n
        }

        return list;  // Return the list of digits
    }
   
    public static void main(String[] args) {
        int number = 12345;
        List<Integer> reversedDigits = fun(number);

        // Print the reversed digits
        System.out.println("Reversed Digits: " + reversedDigits);
    }
}
