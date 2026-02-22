// Last updated: 2/22/2026, 10:38:02 PM
class Solution {
    public int scoreDifference(int[] nums) {
        int firstScore = 0;
        int secondScore = 0;
        boolean first = true;
        boolean second = false;
        int n = nums.length;
        int idx = 5;
        for(int i = 0; i < n; i++){
            if(nums[i] % 2 != 0){
                if(first){
                    first = false;
                    second = true;
                } else {
                    first = true;
                    second = false;
                }
            }
            if(i == idx){
                if(first){
                    first = false;
                    second = true;
                } else {
                    first = true;
                    second = false;
                }
                idx += 6;
            }
            if(first) firstScore += nums[i];
            else secondScore += nums[i];
        }
        return firstScore - secondScore;
    }
}