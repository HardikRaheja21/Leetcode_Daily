// Last updated: 2/10/2026, 3:16:48 PM
class Solution {
    public int singleNonDuplicate(int[] nums) {
        int low = 0, high = nums.length - 1;

        while (low < high) {
            int mid = low + (high - low) / 2;

            // make mid even
            if (mid % 2 == 1) mid--;

            // mid and mid+1 should be a pair if single is on right
            if (nums[mid] == nums[mid + 1]) {
                low = mid + 2;
            } else {
                high = mid;
            }
        }

        return nums[low];
    }
}
