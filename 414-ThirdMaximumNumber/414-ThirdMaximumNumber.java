// Last updated: 2/10/2026, 3:17:15 PM
class Solution {
    public int thirdMax(int[] nums) {
        // Step 1: Sort the array in ascending order
        Arrays.sort(nums);

        int distinctCount = 0;
        int n = nums.length;

        // Step 2: Traverse the array from the largest element
        for (int i = n - 1; i >= 0; i--) {
            // Count only distinct elements
            if (i == n - 1 || nums[i] != nums[i + 1]) { 
                distinctCount++;
                // Return the third distinct maximum
                if (distinctCount == 3) {
                    return nums[i];
                }
            }
        }

        // Step 3: If less than 3 distinct elements, return the maximum
        return nums[n - 1];
    }
}