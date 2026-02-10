// Last updated: 2/10/2026, 3:19:59 PM
class Solution {
    public int maxSubArray(int[] nums) {
        int currSum = nums[0];
        int maxSum = nums[0];
        for(int i = 1; i < nums.length; i++){
            currSum = Math.max(nums[i], currSum + nums[i]);
            maxSum = Math.max(maxSum, currSum);
        }
        return maxSum;
    }
}