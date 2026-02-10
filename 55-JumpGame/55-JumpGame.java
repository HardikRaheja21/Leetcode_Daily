// Last updated: 2/10/2026, 3:19:56 PM
class Solution {
    public boolean canJump(int[] nums) {
        int maxIdx = 0;
        for(int i = 0; i < nums.length; i++){
            if(i > maxIdx) return false;
            maxIdx = Math.max(maxIdx, nums[i] + i);
        }
        return true;
    }
}