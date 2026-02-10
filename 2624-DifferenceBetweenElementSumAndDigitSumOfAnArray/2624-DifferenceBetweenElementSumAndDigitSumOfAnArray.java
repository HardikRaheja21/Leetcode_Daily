// Last updated: 2/10/2026, 3:12:37 PM
class Solution {
    public int differenceOfSum(int[] nums) {
        int elesum = 0;
        int digsum = 0;
        int count = 0;

        for(int i = 0; i < nums.length; i++){
            elesum += nums[i];

            int num = nums[i];
            do {
                digsum += num%10;
                num /= 10;
            } while (num > 0);
        }

        return Math.abs(elesum - digsum);
    }
}