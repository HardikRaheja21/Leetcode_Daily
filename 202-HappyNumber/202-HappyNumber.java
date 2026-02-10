// Last updated: 2/10/2026, 3:18:20 PM
import java.util.HashSet;

public class Solution {
    // Helper function to calculate the sum of squares of digits of a number
    private int getSumOfSquares(int n) {
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum += digit * digit;
            n /= 10;
        }
        return sum;
    }

    public boolean isHappy(int n) {
        // Use a HashSet to detect if we are in a cycle
        HashSet<Integer> seenNumbers = new HashSet<>();

        // Continue the process until we either reach 1 or detect a cycle
        while (n != 1 && !seenNumbers.contains(n)) {
            // Add the current number to the set
            seenNumbers.add(n);
            // Replace n by the sum of the squares of its digits
            n = getSumOfSquares(n);
        }

        // If we reached 1, return true; otherwise, we detected a cycle
        return n == 1;
    }
}
