// Last updated: 2/10/2026, 3:11:35 PM
class Solution {
    public int minimumOperations(int[] nums) {
        int n = nums.length;
        int count = 0;
        int sum = 0;
        for(int i = 0; i < n; i++){
            if((nums[i] + 1)% 3 == 0 || (nums[i] - 1)%3 == 0){
                count++;
            } 
        //     else if((nums[i] - 1)%3 == 0){
        //         count ++;
        //     } else{
        //         sum++;            }
        // }
        }
        return count;
    }
}