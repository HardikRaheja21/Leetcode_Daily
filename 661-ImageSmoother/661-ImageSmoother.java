// Last updated: 2/10/2026, 3:16:37 PM
class Solution {
    public int[][] imageSmoother(int[][] img) {
        int m = img.length;
        int n = img[0].length;
        int[][] result = new int[m][n];
        
        // Directions for a 3x3 grid (row, column offsets)
        int[] directions = {-1, 0, 1};
        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int sum = 0;
                int count = 0;
                
                // Iterate over the 3x3 grid
                for (int dr : directions) {
                    for (int dc : directions) {
                        int r = i + dr;
                        int c = j + dc;
                        
                        // Check if the neighboring cell is within bounds
                        if (r >= 0 && r < m && c >= 0 && c < n) {
                            sum += img[r][c];
                            count++;
                        }
                    }
                }
                
                // Calculate the average and floor it
                result[i][j] = sum / count;
            }
        }
        
        return result;
    }
}