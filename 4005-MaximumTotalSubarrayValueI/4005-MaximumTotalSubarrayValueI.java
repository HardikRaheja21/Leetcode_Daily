// Last updated: 2/10/2026, 3:10:13 PM
class Solution {
    public long maxTotalValue(int[] nums, int k) {
        int[] copy = nums;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int num : copy){
            max = Math.max(max, num);
            min = Math.min(min, num);
        }
        long diff = (long)(max - min);
        return diff * k;        
    }
}