// Last updated: 2/10/2026, 3:13:52 PM
class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] ans = new int[2*n];
        for(int i = 0; i < n; i++){
            ans[i] = nums[i];
        }
        for(int i = 0; i < n; i++){
            ans[i+n] = nums[i];
        }
        return ans;
    }
}