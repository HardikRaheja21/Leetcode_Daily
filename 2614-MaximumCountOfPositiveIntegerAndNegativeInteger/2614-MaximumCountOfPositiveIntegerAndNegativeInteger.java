// Last updated: 2/10/2026, 3:12:43 PM
class Solution {
    public int maximumCount(int[] nums) {
        // int neg = 0;
        // int pos = 0;
        // for(int i = 0; i < nums.length; i++){
        //     if(nums[i] > 0) pos++;
        //     if(nums[i] < 0) neg++;
        // }
        // return Math.max(pos, neg);

        int pos = 0; 
        int neg = 0;
        int n = nums.length;
        int idx = 0;
        while(n > 0){ 
            if(nums[idx] > 0) pos++;
            if(nums[idx] < 0) neg++;
            idx++;
            n--;
        }
        return Math.max(neg, pos);
    }
}