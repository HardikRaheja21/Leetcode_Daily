// Last updated: 2/10/2026, 3:16:13 PM
class Solution {
    public int racecar(int target) {
        int[] dp = new int[target+1];
        
        for(int i = 1;i <= target;i++){
            dp[i] = Integer.MAX_VALUE;
            
            //j is the position of the car before the first reverse
            //m is the number of As done before the first reverse
            int m = 1, j = 1;
            
            //Case#1: if j < i, the car reverses before reaching target i
            //try every 2^m - 1 as the value of j, increment m every time
            //In this case, the car needs to reverse for the second time to drive towards the target i
            for(;j < i; j = (1 << ++m) - 1){
                //p is the position of the car before the second reverse
                //q is the number of As done after the first reverse, and before the second reverse
                for(int p = 0, q = 0; p < j; p = (1 << ++q) - 1){
                    dp[i] = Math.min(dp[i], m + 1 + q + 1 + dp[i - (j - p)]);
                }
            }
            
            //Case#2: if j == i, the car keep accelerates and reaches target i
            //if j == i after m steps of As without any reversion, then m is the required minimum steps 
            if(j == i)
                dp[i] = Math.min(dp[i], m);
            
            //Case#3: if j > i, the car reverses after going beyond target i 
            //the car is facing target i with speed 1 after the first reversion
            //In this case, the subproblem is dp(j-i), the total steps is m + 1 + dp[j-i]
            if(j > i){
                dp[i] = Math.min(dp[i], m + 1 + dp[j-i]);
            }
        }
        return dp[target];
    }
}