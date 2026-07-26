// Last updated: 7/26/2026, 12:08:11 PM
1class Solution {
2    public int maximumProduct(int[] nums) {
3        Arrays.sort(nums);
4        int n = nums.length;
5
6        int prod1 = nums[n-1] * nums[n-2] * nums[n-3];
7        int prod2 = nums[n-1] * nums[0] * nums[1];
8
9        return Math.max(prod1, prod2);
10    }
11}