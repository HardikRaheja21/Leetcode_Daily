// Last updated: 2/10/2026, 3:14:43 PM
class Solution {
    public int[] runningSum(int[] nums) {
        int[] result = new int[nums.length];
        result[0] = nums[0];
        for(int i = 1; i < nums.length; i++){
            result[i] = result[i - 1] + nums[i];
        }
        return result;
    }
}