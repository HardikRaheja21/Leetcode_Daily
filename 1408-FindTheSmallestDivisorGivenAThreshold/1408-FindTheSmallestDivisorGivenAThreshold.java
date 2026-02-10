// Last updated: 2/10/2026, 3:15:01 PM
class Solution {
    public int sumOfD(int[] nums, int divisor){
        int sum = 0;
        for(int i = 0; i < nums.length; i++){
            sum += (nums[i] + divisor - 1) / divisor;
        }
        return sum;
    }
    public int smallestDivisor(int[] nums, int threshold) {
        int n = nums.length;
        if(n > threshold) return -1;
        int maximum = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++) maximum = Math.max(maximum, nums[i]);
        int low = 1, high = maximum;
        while(low <= high){
            int mid = low + (high - low) / 2;
            if(sumOfD(nums, mid) <= threshold) high = mid - 1;
            else low = mid + 1;
        }
        return low;
    }
}