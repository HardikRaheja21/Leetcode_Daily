// Last updated: 2/10/2026, 3:15:50 PM
class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        return numberOfSubArrays(nums, goal) - numberOfSubArrays(nums, goal - 1);
    }
    public int numberOfSubArrays(int[] nums, int goal){
        if(goal < 0) return 0;
        int left = 0, right = 0, sum = 0, count = 0;
        while(right < nums.length){
            sum += nums[right];
            while(sum > goal){
                sum -= nums[left];
                left++;
            }
            count += right - left + 1;
            right++;
        }
        return count;
    }
}