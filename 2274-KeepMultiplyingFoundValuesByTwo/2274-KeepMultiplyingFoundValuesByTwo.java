// Last updated: 2/10/2026, 3:13:28 PM
class Solution {
    public int findFinalValue(int[] nums, int original) {
        int right = 0;
        while(right < nums.length){
            if(nums[right] == original){
                right = 0;
                original = 2 * original;
            } else {
                right++;
            }
        }
        return original;
    }
}