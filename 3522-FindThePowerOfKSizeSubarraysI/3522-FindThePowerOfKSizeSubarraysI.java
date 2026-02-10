// Last updated: 2/10/2026, 3:11:30 PM
class Solution {
    public int[] resultsArray(int[] nums, int k) {
        int n = nums.length;
        int[] results = new int[n - k + 1];

        for (int i = 0; i <= n - k; i++) {
            // Check if the current subarray [i..i+k-1] is sorted and consecutive
            if (isConsecutiveSorted(nums, i, i + k - 1)) {
                results[i] = nums[i + k - 1]; // The last element of the valid subarray
            } else {
                results[i] = -1;
            }
        }

        return results;
    }

    private boolean isConsecutiveSorted(int[] nums, int start, int end) {
        for (int i = start + 1; i <= end; i++) {
            if (nums[i] != nums[i - 1] + 1) {
                return false;
            }
        }
        return true;
    }
}