// Last updated: 2/10/2026, 3:09:45 PM
class Solution {
    public int minMoves(int[] nums) {
        int max = nums[0];
        for(int i = 0; i < nums.length; i++){
            max = Math.max(max, nums[i]);
        }
        int moves = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] < max) moves += (max - nums[i]);
        }
        return moves;
    }
}