// Last updated: 2/10/2026, 3:10:07 PM
class Solution {
    public long splitArray(int[] nums) {
        int[] copy = nums;
        boolean[] inc = new boolean[nums.length];
        boolean[] dec = new boolean[nums.length];
        long[] prefix = new long[nums.length];
        prefix[0] = nums[0];
        for(int i = 1; i < nums.length; i++){
            prefix[i] += nums[i] + prefix[i - 1];
        }
        inc[0] = true;
        for(int i = 1; i < nums.length; i++){
            if(nums[i] > nums[i - 1] && inc[i - 1]){
                inc[i] = true;
            } else {
                inc[i] = false;
            }
        }
        dec[nums.length - 1] = true;
        for(int i = nums.length - 2; i >= 0; i--){
            if(nums[i] > nums[i + 1] && dec[i + 1]){
                dec[i] = true;
            } else {
                dec[i] = false;
            }
        }
        long minDiff = Long.MAX_VALUE;
        for(int i = 0; i < nums.length - 1; i++){
            if(inc[i] && dec[i + 1]){
                long leftSum = prefix[i];
                long rightSum = prefix[nums.length - 1] - prefix[i];
                long diff = Math.abs(leftSum - rightSum);
                minDiff = Math.min(diff, minDiff);
            }
        }
        return (minDiff == Long.MAX_VALUE) ? -1 : minDiff;
    }
}