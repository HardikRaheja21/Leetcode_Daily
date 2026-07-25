// Last updated: 7/25/2026, 2:39:06 PM
1class Solution {
2    public int islandPerimeter(int[][] grid) {
3        int perimeter = 0;
4        int rows = grid.length;
5        int cols = grid[0].length;
6        for(int r = 0; r < rows; r++){
7            for(int c = 0; c < cols; c++){
8                if(grid[r][c] == 1){
9                    perimeter += 4;
10                    if(r > 0 && grid[r - 1][c] == 1) perimeter -= 2;
11                    if(c > 0 && grid[r][c - 1] == 1) perimeter -= 2;
12                }
13            }
14        }
15        return perimeter;
16    }
17}