// Last updated: 2/10/2026, 3:12:35 PM
class Solution {
    public int maxCount(int[] banned, int n, int maxSum) {
        HashSet<Integer> bannedSet = new HashSet<>();
        for (int num : banned) {
            bannedSet.add(num);
        }

        int sum = 0;  // Tracks the current sum of chosen numbers
        int count = 0; // Tracks the count of chosen numbers

        // Iterate through the range [1, n]
        for (int i = 1; i <= n; i++) {
            // Skip numbers that are in the banned set
            if (bannedSet.contains(i)) continue;

            // If adding the current number exceeds maxSum, stop
            if (sum + i > maxSum) break;

            // Otherwise, include the number
            sum += i;
            count++;
        }

        return count; // Return the total count of numbers chosen
    }
}