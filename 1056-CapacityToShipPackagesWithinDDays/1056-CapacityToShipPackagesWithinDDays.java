// Last updated: 2/10/2026, 3:15:34 PM
class Solution {
    public int noOfD(int[] nums, int capacity){
        int days = 1;
        int load = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] + load > capacity){
                days++;
                load = nums[i];
            } else load += nums[i];
        }
        return days;
    }
    public int shipWithinDays(int[] weights, int days) {
        int n = weights.length;
        int maximum = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++) maximum = Math.max(maximum, weights[i]);
        int low = maximum;
        int sum = 0;
        for(int i = 0; i < n; i++) sum += weights[i];
        int high = sum;
        int ans = 0;
        while(low <= high){
            int mid = low + (high - low) / 2;
            if(noOfD(weights, mid) <= days){
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }
}