import java.util.ArrayList;

public class target {

    // Static list to store indices where the target is found
    static ArrayList<Integer> list = new ArrayList<>();

    public static ArrayList<Integer> fun(int[] arr, int index, int target) {
        // Base case: if the index reaches the end of the array, return the list
        if (index == arr.length) {
            return list;
        }

        // If the target is found, add the index to the list
        if (arr[index] == target) {
            list.add(index);
        }

        // Recursive call to check the next index
        return fun(arr, index + 1, target);
    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 3, 4, 5, 6, 4};
        int target = 4;
        ArrayList<Integer> result = fun(arr, 0, target); // Start searching from index 0
        System.out.println("Indices of target in the list: " + result); // Prints the list of indices where the target is found
    }
}
