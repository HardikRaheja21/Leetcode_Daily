// Last updated: 3/20/2026, 5:02:36 PM
1class Solution {
2    public int[][] minAbsDiff(int[][] grid, int k) {
3        int m = grid.length;
4        int n = grid[0].length;
5        int[][] result = new int[m - k + 1][n - k + 1];
6        for(int i = 0; i <= m - k; i++){
7            for(int j = 0; j <= n - k; j++){
8                TreeSet<Integer> st = new TreeSet<>();
9                for(int r = i; r < i + k; r++){
10                    for(int c = j; c < j + k; c++){
11                        st.add(grid[r][c]);
12                    }
13                }
14                int minAbsDiff = Integer.MAX_VALUE;
15                Integer prev = null;
16                for(int val : st){
17                    if(prev != null){
18                        minAbsDiff = Math.min(minAbsDiff, val - prev);
19                    }
20                    prev = val;
21                }
22                if(minAbsDiff == Integer.MAX_VALUE) minAbsDiff = 0;
23                result[i][j] = minAbsDiff;
24            }
25        }
26        return result;
27    }
28}