// Last updated: 2/10/2026, 3:11:00 PM
class Solution {
    public int countIslands(int[][] grid, int k) {
        int rows = grid.length, cols = grid[0].length;
        boolean[][] visited = new boolean[rows][cols];
        int count = 0;
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                if(grid[i][j] != 0 && !visited[i][j]){
                    int sum = sumAfterCheck(grid, visited, i, j);
                    if(sum % k == 0) count++;
                }
            }
        }
        return count;
    }
    public int sumAfterCheck(int[][] grid, boolean[][] visited, int i, int j){
        int rows = grid.length, cols = grid[0].length;
        if(i >= rows || i < 0 || j >= cols || j < 0 || visited[i][j] || grid[i][j] == 0) return 0;
        visited[i][j] = true;
        int sum = grid[i][j];
        sum += sumAfterCheck(grid, visited, i + 1, j);
        sum += sumAfterCheck(grid, visited, i - 1, j);
        sum += sumAfterCheck(grid, visited, i, j + 1);
        sum += sumAfterCheck(grid, visited, i, j - 1);
        return sum;
    }
}