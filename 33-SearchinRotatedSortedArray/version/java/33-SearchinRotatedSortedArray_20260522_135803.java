// Last updated: 5/22/2026, 1:58:03 PM
1class Solution {
2    public int search(int[] nums, int target) {
3        int low = 0;
4        int high = nums.length - 1;
5        while(low <= high){
6            int mid = low + (high - low) / 2;
7            if(nums[mid] == target) return mid;
8            if(nums[low] <= nums[mid]){
9                if(target >= nums[low] && target < nums[mid]){
10                    high = mid - 1;
11                } else{
12                    low = mid + 1;
13                }
14            } else {
15                if(target > nums[mid] && target <= nums[high]){
16                    low = mid + 1;
17                } else {
18                    high = mid - 1;
19                }
20            }
21        }
22        return -1;
23    }
24}