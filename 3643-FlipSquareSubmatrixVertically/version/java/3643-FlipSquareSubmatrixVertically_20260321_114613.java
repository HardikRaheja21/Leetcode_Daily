// Last updated: 3/21/2026, 11:46:13 AM
1class Solution {
2    public int[][] reverseSubmatrix(int[][] grid, int x, int y, int k) {
3        int top = x;
4        int bottom = x + k - 1;
5        while(top < bottom){
6            for(int col = 0; col < k; col++){
7                int temp = grid[top][y + col];
8                grid[top][y + col] = grid[bottom][y + col];
9                grid[bottom][y + col] = temp;
10            }
11            top++;
12            bottom--;
13        }
14        return grid;
15    }
16}