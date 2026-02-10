// Last updated: 2/10/2026, 3:11:32 PM
class Solution {
    public boolean canAliceWin(int[] nums) {
        int sum = 0;
        int sum1 = 0;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] < 10){
                sum += nums[i];
            }
            else{
                sum1 += nums[i];
            }
        }

        if(sum != sum1){
            return true;
        }
        else {
            return false;
        }
    }
}