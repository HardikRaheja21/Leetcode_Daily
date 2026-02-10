// Last updated: 2/10/2026, 3:17:40 PM
class Solution {
    public int lengthOfLIS(int[] nums) {
        int[] lis = new int[nums.length];
        Arrays.fill(lis, 1);
        int max = 1;
        for(int i = 0; i < nums.length; i++){
            for(int j = 0; j < i; j++){
                if(nums[i] > nums[j]){
                    lis[i] = Math.max(lis[i], lis[j] + 1);
                    max = Math.max(max, lis[i]);
                }
            }
        }
        return max;
    }
}