// Last updated: 2/10/2026, 3:11:59 PM
class Solution {
    public long maximumTripletValue(int[] nums) {
        long res = 0;
        int max = 0, diff = 0;
        for(int num : nums){
            res = Math.max(res, (long) diff * num);
            diff = Math.max(diff, max - num);
            max = Math.max(max, num);
        }
        return res;
    }
}