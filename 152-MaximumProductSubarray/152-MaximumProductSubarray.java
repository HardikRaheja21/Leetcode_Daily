// Last updated: 2/10/2026, 3:18:43 PM
class Solution {
    public int maxProduct(int[] nums) {
        if(nums.length == 0) return 0;
        int min = nums[0];
        int max = nums[0];
        int ans = max;
        for(int i = 1; i < nums.length; i++){
            int curr = nums[i];
            int temp = Math.max(curr, Math.max(max * curr, min * curr));
            min = Math.min(curr, Math.min(max * curr, min * curr));
            max = temp;
            ans = Math.max(ans, max);
        }
        return ans;
    }
}