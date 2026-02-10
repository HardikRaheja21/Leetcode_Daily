// Last updated: 2/10/2026, 3:11:09 PM
class Solution {
    public long maximumMedianSum(int[] nums) {
        long sum = 0;
        Arrays.sort(nums);
        int n = nums.length;
        for (int i = n - 2; i >= n / 3; i -= 2) {
            sum += nums[i];
        }
        return sum;
    }
}