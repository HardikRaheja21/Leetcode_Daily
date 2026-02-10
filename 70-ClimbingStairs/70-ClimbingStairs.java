// Last updated: 2/10/2026, 3:19:39 PM
class Solution {
    public int climbStairs(int n) {
        if (n == 1) return 1;

        int[] dp = new int[n + 1];
        dp[0] = 1; //to stay on ground
        dp[1] = 1; //for first step;

        for(int i = 2; i <= n; i++){
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }
}