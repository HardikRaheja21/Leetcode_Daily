// Last updated: 4/8/2026, 1:46:13 PM
class Solution {
    int m, n;
    Integer[][][] dp;

    public int solve(int[][] coins, int i, int j, int neu) {
        if (i >= m || j >= n) return Integer.MIN_VALUE;

        // Base case
        if (i == m - 1 && j == n - 1) {
            if (coins[i][j] < 0 && neu > 0) return 0;
            return coins[i][j];
        }

        if (dp[i][j][neu] != null) return dp[i][j][neu];

        // Take current cell
        int down = solve(coins, i + 1, j, neu);
        int right = solve(coins, i, j + 1, neu);

        int take = coins[i][j];
        if (down != Integer.MIN_VALUE || right != Integer.MIN_VALUE) {
            take += Math.max(down, right);
        } else {
            take = Integer.MIN_VALUE;
        }

        // Skip negative
        int skip = Integer.MIN_VALUE;
        if (coins[i][j] < 0 && neu > 0) {
            skip = Math.max(
                solve(coins, i + 1, j, neu - 1),
                solve(coins, i, j + 1, neu - 1)
            );
        }

        return dp[i][j][neu] = Math.max(take, skip);
    }

    public int maximumAmount(int[][] coins) {
        m = coins.length;
        n = coins[0].length;
        dp = new Integer[m][n][3]; // neu = 0,1,2

        return solve(coins, 0, 0, 2);
    }
}