// Last updated: 7/20/2026, 9:03:50 AM
1class Solution {
2    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
3        int m = grid.length;
4        int n = grid[0].length;
5        Deque<Integer> dq = new ArrayDeque<>();
6        for(int i = 0; i < m; i++){
7            for(int j = 0; j < n; j++){
8                dq.offerLast(grid[i][j]);
9            }
10        }
11        k %= (m * n);
12        while(k-- > 0){
13            dq.offerFirst(dq.pollLast());
14        }
15        List<List<Integer>> ans = new ArrayList<>();
16        for(int i = 0; i < m; i++){
17            List<Integer> row = new ArrayList<>();
18            for(int j = 0; j < n; j++){
19                row.add(dq.pollFirst());
20            }
21            ans.add(row);
22        }
23        return ans;
24    }
25}