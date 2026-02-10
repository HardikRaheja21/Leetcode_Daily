// Last updated: 2/10/2026, 3:10:23 PM
class Solution {
    public int minRemoval(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length;
        int maxLen = 0;
        int i = 0;
        for(int j = 0; j < n; j++){
            while(nums[j] > (long)nums[i] * k) i++;
            maxLen = Math.max(maxLen, j - i + 1);
        }
        return n - maxLen;
    }
}