// Last updated: 2/10/2026, 3:14:52 PM
class Solution {
    public int countNegatives(int[][] grid) {
        int rows = grid.length;
        int row = 0;
        int cols = grid[0].length;
        int col = cols - 1;
        int count = 0;
        while(row < rows && col >= 0){
            if(grid[row][col] >= 0){
                row++;
            } else {
                count += rows - row;
                col--;
            }
        }
        return count;
    }
}