// Last updated: 2/10/2026, 3:18:25 PM
class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        int[] ans = new int[n];
        int index = 0;
        for(int i = n - k; i < n; i++){
            ans[index++] = nums[i];
        }
        for(int i = 0; i < n - k; i++){
            ans[index++] = nums[i];
        }
        for(int i = 0; i < n; i++){
            nums[i] = ans[i];
        }
        // return nums;
    }
}