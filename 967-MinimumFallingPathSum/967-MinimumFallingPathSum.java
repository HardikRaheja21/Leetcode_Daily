// Last updated: 2/10/2026, 3:15:49 PM
class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int n = matrix.length;
        int[][] dp = new int[n][n];
        for(int c = 0; c < n; c++){
            dp[n - 1][c] = matrix[n - 1][c];
        }
        for(int r = n - 2; r >= 0; r--){
            for(int c = 0; c < n; c++){
                int minBelow = dp[r + 1][c];
                if(c > 0) minBelow = Math.min(minBelow, dp[r + 1][c - 1]);
                if(c < n - 1) minBelow = Math.min(minBelow, dp[r + 1][c + 1]);
                dp[r][c] = matrix[r][c] + minBelow;
            }
        }
        int ans = Integer.MAX_VALUE;
        for(int i = 0; i < n; i++){
            ans = Math.min(ans, dp[0][i]);
        }
        return ans;
    }
}