// Last updated: 2/10/2026, 3:10:27 PM
class Solution {
    public boolean isTrionic(int[] nums) {
        for(int p = 1; p < nums.length - 2; p++){
            for(int q = p + 1; q < nums.length - 1; q++){
                if (isIncreasing(nums, 0, p) &&
                    isDecreasing(nums, p, q) &&
                    isIncreasing(nums, q, nums.length - 1)) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean isIncreasing(int[] nums, int start, int end){
        for(int i = start; i < end; i++){
            if(nums[i] >= nums[i + 1]) return false;
        }
        return true;
    }

    public boolean isDecreasing(int[] nums, int start, int end){
        for(int i = start; i < end; i++){
            if(nums[i] <= nums[i + 1]) return false;
        }
        return true;
    }
}
