// Last updated: 2/10/2026, 3:17:00 PM
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0; // To count the current number of consecutive 1's
        int maxCount = 0; // To store the maximum number of consecutive 1's found so far

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                count++; // Increase count if we find a 1
            } else {
                maxCount = Math.max(maxCount, count); // Update maxCount if needed
                count = 0; // Reset count when a 0 is found
            }
        }
        
        // After the loop, we should do a final check
        maxCount = Math.max(maxCount, count);

        return maxCount;
    }
}
