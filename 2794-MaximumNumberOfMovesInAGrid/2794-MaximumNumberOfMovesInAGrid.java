// Last updated: 2/10/2026, 3:12:19 PM
class Solution {
    private int[][] dp;
    private int[][] grid;
    private int rows, cols;
    private final int[] dRow = {-1, 0, 1}; // Move directions in rows
    private final int[] dCol = {1, 1, 1};  // Move directions in columns (always to the right)

    public int maxMoves(int[][] grid) {
        this.grid = grid;
        this.rows = grid.length;
        this.cols = grid[0].length;
        this.dp = new int[rows][cols];

        // Initialize DP array with -1 (uncomputed state)
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                dp[i][j] = -1;
            }
        }

        int maxMoves = 0;
        // Start from any cell in the first column
        for (int i = 0; i < rows; i++) {
            maxMoves = Math.max(maxMoves, dfs(i, 0));
        }

        return maxMoves;
    }

    private int dfs(int row, int col) {
        // If we reached the last column, we can't move further
        if (col == cols - 1) return 0;

        // If already computed, return the cached value
        if (dp[row][col] != -1) return dp[row][col];

        int maxPath = 0;
        // Explore the three possible moves
        for (int i = 0; i < 3; i++) {
            int newRow = row + dRow[i];
            int newCol = col + dCol[i];

            // Check if the new cell is within bounds and has a larger value
            if (newRow >= 0 && newRow < rows && newCol < cols && grid[newRow][newCol] > grid[row][col]) {
                maxPath = Math.max(maxPath, 1 + dfs(newRow, newCol));
            }
        }

        // Cache the result
        dp[row][col] = maxPath;
        return maxPath;
    }
}