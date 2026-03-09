// Last updated: 3/9/2026, 4:31:16 PM
1class Pair{
2    int first;
3    int second;
4    public Pair(int first, int second){
5        this.first = first;
6        this.second = second;
7    }
8}
9class Solution {
10    public int numEnclaves(int[][] grid) {
11        Queue<Pair> q = new LinkedList<>();
12        int n = grid.length;
13        int m = grid[0].length;
14        int[][] vis = new int[n][m];
15        for(int i = 0; i < n; i++){
16            for(int j = 0; j < m; j++){
17                if(i == 0 || i == n - 1 || j == 0 || j == m - 1){
18                    if(grid[i][j] == 1){
19                        q.add(new Pair(i, j));
20                        vis[i][j] = 1;
21                    }
22                }
23            }
24        }
25        int[] delRow = {-1, 0, 1, 0};
26        int[] delCol = {0, -1, 0, 1};
27        while(!q.isEmpty()){
28            int row = q.peek().first;
29            int col = q.peek().second;
30            q.poll();
31            for(int i = 0; i < 4; i++){
32                int nRow = row + delRow[i];
33                int nCol = col + delCol[i];
34                if(nRow >= 0 && nRow < n && nCol >= 0 && nCol < m && vis[nRow][nCol] == 0 && grid[nRow][nCol] == 1){
35                    q.add(new Pair(nRow, nCol));
36                    vis[nRow][nCol] = 1;
37                }
38            }
39        }
40        int cnt = 0;
41        for(int i = 0; i < n; i++){
42            for(int j = 0; j < m; j++){
43                if(vis[i][j] == 0 && grid[i][j] == 1) cnt++;
44            }
45        }
46        return cnt;
47    }
48}