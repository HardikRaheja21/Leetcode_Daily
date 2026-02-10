// Last updated: 2/10/2026, 3:14:45 PM
class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] ans = new int[2*n];
        for(int i = 0; i < n; i++){
            ans[2 * i] = nums[i];              //places at index even.
            ans[2 * i + 1] = nums[i + n];          //places at index odd.
        }
        return ans;
    }
}