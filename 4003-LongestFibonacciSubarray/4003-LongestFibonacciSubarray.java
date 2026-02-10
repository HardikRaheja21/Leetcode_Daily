// Last updated: 2/10/2026, 3:10:14 PM
class Solution {
    public int longestSubarray(int[] nums) {
        int count = 2;
        int maxCount = 2;
        for(int i = 2; i < nums.length; i++){
            if(nums[i] == nums[i - 1] + nums[i - 2]) count++;
            else {
                count = 2;
            }
            maxCount = Math.max(count, maxCount);
        }
        return maxCount;
    }
}