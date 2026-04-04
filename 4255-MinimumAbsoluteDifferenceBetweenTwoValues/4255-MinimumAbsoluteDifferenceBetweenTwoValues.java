// Last updated: 4/4/2026, 12:46:53 PM
class Solution {
    public int minAbsoluteDifference(int[] nums) {
        int minDiff = Integer.MAX_VALUE;
        int n = nums.length;
        for(int i = 0;i < n; i++){
            for(int j = 0; j < n; j++){
                if(nums[i] == 1 && nums[j] == 2) minDiff = Math.min(minDiff, Math.abs(i - j));
            }
        }
        if(minDiff == Integer.MAX_VALUE) return -1;
        return minDiff;
    }
}