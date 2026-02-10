// Last updated: 2/10/2026, 3:15:20 PM
class Solution {
    private int f(int n, int[] dp){
        if(n == 1 || n == 2) return 1;
        if(n == 0) return 0;
        if(dp[n] != -1) return dp[n];
        return dp[n] = f(n - 1, dp) + f(n - 2, dp) + f(n - 3, dp);
    }
    public int tribonacci(int n) {
        int[] dp = new int[38];
        Arrays.fill(dp, -1);
        dp[0] = 0;
        dp[1] = dp[2] = 2;
        return f(n, dp);
    }
}