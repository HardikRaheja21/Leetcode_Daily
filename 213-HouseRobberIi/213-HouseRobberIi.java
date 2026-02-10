// Last updated: 2/10/2026, 3:18:12 PM
class Solution {
    private int maximumAmount(int[] nums, int start, int end){
        int maxi = nums[0];
        int rob1 = 0, rob2 = 0;
        for(int i = start; i < end; i++){
            maxi = Math.max(rob1 + nums[i], rob2);
            rob1 = rob2;
            rob2 = maxi;
        }
        return maxi;
    }
    public int rob(int[] nums) {
        return Math.max(maximumAmount(nums, 0, nums.length - 1), maximumAmount(nums, 1, nums.length));
    }
}