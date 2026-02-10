// Last updated: 2/10/2026, 3:16:20 PM
class Solution {
    public int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        while(low <= high){
            int mid = low + (high - low) / 2;
            if(target == nums[mid]) return mid;
            else if(target > nums[mid]) low++;
            else high--;
        }
        return -1;
    }
}