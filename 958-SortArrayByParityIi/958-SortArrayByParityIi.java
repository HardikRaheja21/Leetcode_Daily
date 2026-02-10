// Last updated: 2/10/2026, 3:15:51 PM
class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int odd = 1;
        int even = 0;
        int n = nums.length;
        int[] result = new int[n];


        for(int i = 0; i < nums.length; i++){
            int num = nums[i];                //get the current element
            if (num % 2 == 0){
                result[even] = num;
                even += 2;;
            }
            else {
                result[odd] = num;
                odd += 2;
            }
        } return result;
    }
}