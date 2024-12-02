import java.util.*;
public class St {
    public static void main(String[] args) {
        String a = "aba";
        StringBuilder builder = new StringBuilder(a);
        String reversed = builder.reverse().toString();
        if (a.equals(reversed)) {
            System.out.println(" Palindrome ");
        } else {
            System.out.println("Not Palindrome");
        }
    


    }
}
