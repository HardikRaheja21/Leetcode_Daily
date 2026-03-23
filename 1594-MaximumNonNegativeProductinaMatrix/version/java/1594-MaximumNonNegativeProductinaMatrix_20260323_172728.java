// Last updated: 3/23/2026, 5:27:28 PM
1class Solution {
2    public int maxProductPath(int[][] grid) {
3        int m = grid.length, n = grid[0].length;
4        long MOD = 1000000007;
5        long[][] maxProd = new long[m][n];
6        long[][] minProd = new long[m][n];
7        maxProd[0][0] = minProd[0][0] = grid[0][0];
8        for(int i = 1; i < m; i++){
9            maxProd[i][0] = minProd[i][0] = maxProd[i - 1][0]  * grid[i][0];
10        }
11        for(int j = 1; j < n; j++){
12            maxProd[0][j] = minProd[0][j] = maxProd[0][j - 1] * grid[0][j];
13        }
14        for(int i = 1; i < m; i++){
15            for(int j = 1; j < n; j++){
16                long val = grid[i][j];
17                long a = maxProd[i - 1][j] * val;
18                long b = minProd[i - 1][j] * val;
19                long c = maxProd[i][j - 1] * val;
20                long d = minProd[i][j - 1] * val;
21                maxProd[i][j] = Math.max(Math.max(a, b), Math.max(c, d));
22                minProd[i][j] = Math.min(Math.min(a, b), Math.min(c, d));
23            }
24        }
25        long ans = maxProd[m - 1][n - 1];
26        if(ans < 0) return -1;
27        return (int)(ans % MOD);
28    }
29}