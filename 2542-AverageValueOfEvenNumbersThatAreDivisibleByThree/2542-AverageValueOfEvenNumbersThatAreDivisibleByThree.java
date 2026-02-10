// Last updated: 2/10/2026, 3:12:53 PM
class Solution {
    public int averageValue(int[] nums) {
        // int avg = 0;
        int sum = 0;
        int count = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] % 6 == 0){
                count++;
                sum += nums[i];
            }
        }
        // avg = sum / count;
        
        if(count == 0){
            return 0;
        } else {
            return sum/count;
        }
    }
}