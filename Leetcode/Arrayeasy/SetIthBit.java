import java.util.Scanner;

public class SetIthBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input the number and the bit position to set
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        
        System.out.print("Enter the bit position (0-based index): ");
        int i = sc.nextInt();
        
        // Create a mask by shifting 1 to the left by 'i' positions
        int mask = 1 << i;
        
        // Use OR operator to set the ith bit
        number = number | mask;
        
        System.out.println("The new number after setting the " + i + "th bit is: " + number);
    }
}
