public class Solution {
    public static void main(String[] args) {
        int n = 100;
        int bitCount = 0;

        while (n > 0) {
            bitCount++;
            n = n >> 1;  // Right shift the number by 1 (equivalent to dividing by 2)
        }

        System.out.println("Number of bits in binary representation: " + bitCount);
    }
}
