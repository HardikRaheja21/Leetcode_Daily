// Last updated: 5/16/2026, 2:16:55 PM
1class Solution {
2    public int findMin(int[] nums) {
3        int low = 0;
4        int high = nums.length - 1;
5        while(low < high){
6            int mid = low + (high - low) / 2;
7            if(nums[mid] > nums[high]) low = mid + 1;
8            else if(nums[mid] < nums[high]) high = mid;
9            else high--;
10        }
11        return nums[low];
12    }
13}