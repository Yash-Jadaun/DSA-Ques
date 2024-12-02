package Dsaques.InterviewQues;

import java.util.*;

public class SetMismatch {
    public int[] mismatch(int[] arr) {
        int i = 0;
        
        // Cyclic sort to place elements in their correct positions
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) {
                // Swap arr[i] and arr[correct]
                swap(arr, i, correct);
            } else {
                i++;
            }
        }

        // After sorting, find the duplicate and missing number
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index + 1) {
                // Returning [duplicate, missing] as int array
                return new int[] {arr[index], index + 1};
            }
        }

        return new int[] {-1, -1}; // If no mismatch found (unlikely in this problem)
    }

    // Swap function
    public void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    public static void main(String[] args) {
        SetMismatch sm = new SetMismatch();
        int[] arr = {1, 2, 2, 4};
        int[] result = sm.mismatch(arr);
        
        System.out.println(Arrays.toString(result));  // Expected output: [2, 3]
    }
}
