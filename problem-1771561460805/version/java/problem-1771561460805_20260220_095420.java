// Last updated: 2/20/2026, 9:54:20 AM
1class Solution {
2    public int minimumPrefixLength(int[] nums) {
3        int i = nums.length - 1;
4        while (i > 0 && nums[i - 1] < nums[i]) {
5            --i;
6        }
7        return i;
8    }
9}