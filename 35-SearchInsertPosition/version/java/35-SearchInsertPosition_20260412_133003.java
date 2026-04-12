// Last updated: 4/12/2026, 1:30:03 PM
1class Solution {
2    public int searchInsert(int[] nums, int target) {
3        int left = 0;
4        int right = nums.length - 1;
5        while(left <= right){
6            int mid = left + (right - left) / 2;
7            if(nums[mid] == target) return mid;
8            else if(target > nums[mid]) left = mid + 1;
9            else right = mid - 1;
10        }
11        return left;
12    }
13}