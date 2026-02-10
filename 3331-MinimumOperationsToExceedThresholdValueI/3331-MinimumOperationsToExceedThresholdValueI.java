// Last updated: 2/10/2026, 3:11:47 PM
class Solution {
    public int minOperations(int[] nums, int k) {
        //We need not to remove element from the Array, instead just need to return Array.
        int count = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] < k){
                count++;
            }
        }
        return count;
    }
}