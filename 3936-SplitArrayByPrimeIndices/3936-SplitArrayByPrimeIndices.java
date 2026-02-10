// Last updated: 2/10/2026, 3:10:44 PM
class Solution {
    public long splitArray(int[] nums) {
        if(nums.length == 0) return 0;
        long sum1 = 0;
        long sum2 = 0;
        for(int i = 0; i < nums.length; i++){
            if(isPrime(i)){
                sum1 += nums[i];
            } else {
                sum2 += nums[i];
            }
        }
        return Math.abs(sum1 - sum2);
    }
    public boolean isPrime(int num){
        if(num <= 1) return false;
        if(num == 2 || num == 3) return true;
        if(num % 2 == 0 || num % 3 == 0) return false;
        for(int i = 5; i * i <= num; i+= 6){
            if(num % i == 0 || num % (i + 2) == 0) return false;
        }
        return true;
    }
}