// Last updated: 2/10/2026, 3:20:20 PM
class Solution {
    public int firstOcurrence(int[] nums, int target, int n){
        int low = 0, high = n - 1;
        int first = -1;
        while(low <= high){
            int mid = (low + high) / 2;
            if(nums[mid] == target){
                first = mid;
                high = mid - 1;
            } else if(nums[mid] < target){
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return first;
    }
    public int lastOcurrence(int[] nums, int target, int n){
        int low = 0, high = n - 1;
        int last = -1;
        while(low <= high){
            int mid = (low + high) / 2;
            if(nums[mid] == target){
                last = mid;
                low = mid + 1;
            } else if(nums[mid] > target){
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return last;
    }
    public int[] searchRange(int[] nums, int target) {
        int first = firstOcurrence(nums, target, nums.length);
        if(first == -1) return new int[]{-1, -1};
        int last = lastOcurrence(nums, target, nums.length);
        return new int[]{first, last};
    }
}