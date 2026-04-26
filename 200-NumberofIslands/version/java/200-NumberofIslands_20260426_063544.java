// Last updated: 4/26/2026, 6:35:44 AM
1class Solution {
2    public int numIslands(char[][] grid) {
3        int row = grid.length;
4        int col = grid[0].length;
5        int islands = 0;
6        for(int i = 0; i < row; i++){
7            for(int j = 0; j < col; j++){
8                if(grid[i][j] == '1'){
9                    islands++;
10                    dfs(i, j, grid);
11                }
12            }
13        }
14        return islands;
15    }
16    private static void dfs(int row, int col, char[][] grid){
17        int newRow = grid.length;
18        int newCol = grid[0].length;
19        int[][] directions = new int[][]{{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
20        if(row < 0 || col < 0 || row >= newRow || col >= newCol || grid[row][col] == '0') return;
21        grid[row][col] = '0';
22        for(int[] dir : directions){
23            dfs(row + dir[0], col + dir[1], grid);
24        }
25    }
26}