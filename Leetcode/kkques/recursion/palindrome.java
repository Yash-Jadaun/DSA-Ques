import java.util.*;

public class palindrome {

    public static boolean fun(int n) {
        // Convert number to string
        String numStr = String.valueOf(n);
        
        // List to store digits of the number as characters
        List<Character> list = new ArrayList<>();

        // Add all digits to the list
        for (int i = 0; i < numStr.length(); i++) {
            list.add(numStr.charAt(i));  // Add each digit (character) to the list
        }

        // Check if the list forms a palindrome
        int i = 0;
        int j = list.size() - 1;

        while (i < j) {
            if (list.get(i) != list.get(j)) {
                return false;  // Not a palindrome
            }
            i++;
            j--;
        }

        return true;  // Palindrome
    }

    public static void main(String[] args) {
      
        boolean ans = fun(12322);  // Test case: it should return true
        System.out.println(ans);   // Output: true
    }
}
