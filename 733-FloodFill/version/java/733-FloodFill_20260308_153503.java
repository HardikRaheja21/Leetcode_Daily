// Last updated: 3/8/2026, 3:35:03 PM
1class Solution {
2    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
3        int iniColor = image[sr][sc];
4        int[][] ans = image;
5        int[] delRow = {-1, 0, 1, 0};
6        int[] delCol = {0, 1, 0, -1};
7        dfs(sr, sc, ans, image, color, delRow, delCol, iniColor);
8        return ans;
9    }
10    private void dfs(int row, int col, int[][] ans, int[][] image, int newColor, int[] delRow, int[] delCol, int iniColor){
11        ans[row][col] = newColor;
12        int n = image.length;
13        int m = image[0].length;
14        for(int i = 0; i < 4; i++){
15            int newRow = row + delRow[i];
16            int newCol = col + delCol[i];
17            if(newRow >= 0 && newRow < n && newCol >= 0 && newCol < m && image[newRow][newCol] == iniColor && ans[newRow][newCol] != newColor){
18                dfs(newRow, newCol, ans, image, newColor, delRow, delCol, iniColor);
19            }
20        }
21    }
22}