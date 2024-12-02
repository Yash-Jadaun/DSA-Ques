package Dsaques.InterviewQues;

import java.util.Arrays;

public class duplicate {

    public static int duplicate(int[] arr) {
        int i = 0;

        // Cyclic sort to move numbers to their correct positions
        while (i < arr.length) {
            int correct = arr[i] - 1;

            // Check if arr[i] is not at its correct position and it is not a duplicate
            if (arr[i] != arr[correct]) {
                // Swap the elements
                int temp = arr[i];
                arr[i] = arr[correct];
                arr[correct] = temp;
            } else {
                i++;
            }
        }

        // Search for the first duplicate number
        for (int index = 0; index < arr.length; index++) {
            // If the number is not in the correct position, it's a duplicate
            if (arr[index] != index + 1) {
                return arr[index];
            }
        }

        // No duplicate found (should not reach here for valid input)
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {5, 4,4, 3, 2, 2};
        int duplicate = duplicate(arr);
        System.out.println("Duplicate number: " + duplicate);  // Output the duplicate
    }
}
