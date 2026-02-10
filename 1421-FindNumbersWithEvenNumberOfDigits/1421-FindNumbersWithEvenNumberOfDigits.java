// Last updated: 2/10/2026, 3:14:58 PM
class Solution {
    public int findNumbers(int[] nums) {
        int evencount = 0;

        for(int i = 0; i < nums.length; i++){
            int count = 0;
            int num = nums[i];
            do {
                num /= 10;
                count++;
            }while(num > 0);

            if(count % 2 == 0){
                evencount++;
            }
        }

        return evencount;
    }
}