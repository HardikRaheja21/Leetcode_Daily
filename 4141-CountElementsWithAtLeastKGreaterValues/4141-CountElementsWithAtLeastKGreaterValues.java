// Last updated: 2/10/2026, 3:09:37 PM
import java.util.*;

class Solution {
    public int countElements(int[] nums, int k) {
        int n = nums.length;
        Arrays.sort(nums);

        if (k == 0) return n; // everyone qualifies

        int threshold = nums[n - k]; // first element among the top-k largest
        int count = 0;
        for (int x : nums) {
            if (x < threshold) count++;
        }
        return count;
    }
}
