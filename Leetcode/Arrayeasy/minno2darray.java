import java.util.Arrays;

public class minno2darray {

    // static int[] search(int[][] arr, int target) {
    //     for (int i = 0; i < arr.length; i++) {
    //         for (int j = 0; j < arr[i].length; j++) {
    //             if (arr[i][j] == target) {
    //                 return new int[]{i, j};
    //             }
    //         }
    //     }
    //     return new int[]{-1, -1}; // Return {-1, -1} if the target is not found
    // }

    public static void main(String[] args) {
        int[][] arr = {
            {2, 3, 4},
            {5, 6, 7},
            {8, 9, 10}
        };

        int target = 3;
        int[] ans = search(arr, target);
        System.out.println(Arrays.toString(ans)); // Print the result array
    }
}