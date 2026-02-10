// Last updated: 2/10/2026, 3:15:59 PM
class Solution {
    public boolean isMonotonic(int[] nums) {
        boolean isIncreasing = true;
        boolean isDecreasing = true;

        for(int i = 1; i < nums.length; i++){
            if(nums[i] > nums[i - 1]){
                isDecreasing = false; //If any element increases its not decreasing.
            }
            if(nums[i] < nums[i - 1]){
                isIncreasing = false;
            }
        }
        return isIncreasing || isDecreasing;
    }
}