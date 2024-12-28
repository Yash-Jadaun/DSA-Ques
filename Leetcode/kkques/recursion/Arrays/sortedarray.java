public class sortedarray {

    public static boolean fun(int[] arr) {
        if (arr.length == 0 || arr.length == 1) {
            return true; // An empty or single-element array is sorted
        }

        for (int i = 0; i < arr.length - 1; i++) { // Loop until the second last element
            if (!(arr[i] < arr[i + 1])) { // Check if the current element is greater than the next
                return false;
            }
        }
        return true; // If no violations, the array is sorted
    }

    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        boolean ans = fun(arr); // Correct return type is boolean

        System.out.println(ans); // This will print 'false' for this input
    }
}
