// Last updated: 2/10/2026, 3:09:36 PM
class Solution {
    public int absDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int sumOfSmallest = 0;
        int sumOfLargest = 0;
        for(int i = 0; i < k; i++){
            sumOfSmallest += nums[i];
            sumOfLargest += nums[nums.length - 1 - i];
        }
        
        return Math.abs(sumOfLargest - sumOfSmallest);
    }
}