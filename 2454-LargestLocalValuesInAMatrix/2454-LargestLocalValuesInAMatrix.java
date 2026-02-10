// Last updated: 2/10/2026, 3:13:04 PM
class Solution {
    public int[][] largestLocal(int[][] grid) {
        int n = grid.length;  // Size of the grid
        int[][] maxLocal = new int[n - 2][n - 2];  // Initialize the result array
        
        // Loop through each possible top-left corner of a 3x3 sub-matrix
        for (int i = 0; i < n - 2; i++) {
            for (int j = 0; j < n - 2; j++) {
                int maxVal = Integer.MIN_VALUE;  // Initialize the max value for the sub-matrix
                
                // Traverse the 3x3 sub-matrix starting at (i, j)
                for (int x = i; x < i + 3; x++) {
                    for (int y = j; y < j + 3; y++) {
                        maxVal = Math.max(maxVal, grid[x][y]);
                    }
                }
                
                // Store the maximum value in maxLocal
                maxLocal[i][j] = maxVal;
            }
        }
        
        return maxLocal;
    }
}
