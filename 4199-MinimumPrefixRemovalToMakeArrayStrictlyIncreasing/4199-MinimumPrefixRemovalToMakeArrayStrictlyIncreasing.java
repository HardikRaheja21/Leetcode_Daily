// Last updated: 2/21/2026, 9:40:22 AM
class Solution {
    public int minimumPrefixLength(int[] nums) {
        int i = nums.length - 1;
        while (i > 0 && nums[i - 1] < nums[i]) {
            --i;
        }
        return i;
    }
}