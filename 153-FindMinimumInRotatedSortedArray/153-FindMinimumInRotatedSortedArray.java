// Last updated: 2/10/2026, 3:18:41 PM
class Solution {
    public int findMin(int[] nums) {
        int low = 0;
        int high = nums.length - 1;
        while(low < high){
            int mid = low + (high - low) / 2;
            if(nums[mid] > nums[high]){
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return nums[low];
    }
}