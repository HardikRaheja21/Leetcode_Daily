// Last updated: 3/9/2026, 7:41:21 AM
1class Solution {
2    public int[][] updateMatrix(int[][] mat) {
3
4        int n = mat.length;
5        int m = mat[0].length;
6
7        Queue<int[]> q = new LinkedList<>();
8        int[][] dist = new int[n][m];
9
10        for(int i = 0; i < n; i++){
11            for(int j = 0; j < m; j++){
12                if(mat[i][j] == 0){
13                    q.add(new int[]{i, j});
14                } else {
15                    dist[i][j] = -1; // mark unvisited
16                }
17            }
18        }
19
20        int[] delRow = {-1,0,1,0};
21        int[] delCol = {0,1,0,-1};
22
23        while(!q.isEmpty()){
24
25            int[] cell = q.poll();
26            int row = cell[0];
27            int col = cell[1];
28
29            for(int i = 0; i < 4; i++){
30
31                int nrow = row + delRow[i];
32                int ncol = col + delCol[i];
33
34                if(nrow >= 0 && nrow < n && ncol >= 0 && ncol < m && dist[nrow][ncol] == -1){
35
36                    dist[nrow][ncol] = dist[row][col] + 1;
37                    q.add(new int[]{nrow, ncol});
38                }
39            }
40        }
41
42        return dist;
43    }
44}