// Last updated: 2/10/2026, 3:12:11 PM
class Solution {
    public int maximumBeauty(int[] nums, int k) {
        Arrays.sort(nums);
        
        int n = nums.length;
        int left = 0, maxBeauty = 0;
        
        // Sliding window
        for (int right = 0; right < n; right++) {
            // Ensure the range is valid within the constraints
            while (nums[right] - nums[left] > 2 * k) {
                left++;
            }
            // Update the maximum length of the valid window
            maxBeauty = Math.max(maxBeauty, right - left + 1);
        }
        
        return maxBeauty;
    }
}