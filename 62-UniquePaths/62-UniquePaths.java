// Last updated: 2/10/2026, 3:19:48 PM
class Solution {
    public int uniquePaths(int m, int n) {
        int[][] t = new int[m][n];
        for(int[] row : t){
            Arrays.fill(row, 1);
        }
        for(int i = 1; i < m; i++){
            for(int j = 1; j < n; j++){
                t[i][j] = t[i - 1][j] + t[i][j - 1];
            }
        }
        return t[m - 1][n - 1];
    }
}