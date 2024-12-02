public class UniqueNumber {
    public static int findUnique(int[] arr) {
        int result = 0;

        // Iterate over every bit position (32-bit integer)
        for (int i = 0; i < 32; i++) {
            int sum = 0;
            
            // Count the number of elements with the i-th bit set
            for (int num : arr) {
                if ((num & (1 << i)) != 0) {
                    sum++;
                }
            }
            
            // If the sum is not a multiple of 3, then the unique element has this bit set
            if (sum % 3 != 0) {
                result |= (1 << i);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {6, 2, 5, 2, 6, 2, 6};
        System.out.println("The unique number is: " + findUnique(arr));
    }
}
