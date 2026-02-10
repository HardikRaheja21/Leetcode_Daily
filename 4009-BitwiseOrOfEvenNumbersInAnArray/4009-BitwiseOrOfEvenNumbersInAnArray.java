// Last updated: 2/10/2026, 3:10:10 PM
class Solution {
    public int evenNumberBitwiseORs(int[] nums) {
        int result = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] %  2 == 0) result |= nums[i];
        }
        return result;
    }
}