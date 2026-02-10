// Last updated: 2/10/2026, 3:14:42 PM
class Solution {
    public boolean isPossible(int[] nums, int day, int m, int k){
        int n = nums.length;
        int cnt = 0;
        int noOfB = 0;
        for(int i = 0; i < n; i++){
            if(nums[i] <= day) cnt++;
            else{
                noOfB += cnt / k;
                cnt = 0;
            }
        }
        noOfB += cnt / k;
        return noOfB >= m;
    }
    public int minDays(int[] bloomDay, int m, int k) {
        int n = bloomDay.length;
        long val = (long) m * k;
        if(val > n) return -1;
        int mini = Integer.MAX_VALUE;
        int maxi = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++){
            mini = Math.min(mini, bloomDay[i]);
            maxi = Math.max(maxi, bloomDay[i]);
        }
        int low = mini, high = maxi;
        int ans = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (isPossible(bloomDay, mid, m, k)) {
                ans = mid;
                high = mid - 1;   // try smaller day
            } else {
                low = mid + 1;    // need bigger day
            }
        }
        return ans;
    }
}