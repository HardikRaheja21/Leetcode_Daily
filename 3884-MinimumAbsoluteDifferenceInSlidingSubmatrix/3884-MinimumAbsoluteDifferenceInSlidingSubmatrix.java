// Last updated: 3/23/2026, 5:29:13 PM
class Solution {
    public int[][] minAbsDiff(int[][] grid, int k) {
        int m = grid.length;
        int n = grid[0].length;
        int[][] result = new int[m - k + 1][n - k + 1];
        for(int i = 0; i <= m - k; i++){
            for(int j = 0; j <= n - k; j++){
                TreeSet<Integer> st = new TreeSet<>();
                for(int r = i; r < i + k; r++){
                    for(int c = j; c < j + k; c++){
                        st.add(grid[r][c]);
                    }
                }
                int minAbsDiff = Integer.MAX_VALUE;
                Integer prev = null;
                for(int val : st){
                    if(prev != null){
                        minAbsDiff = Math.min(minAbsDiff, val - prev);
                    }
                    prev = val;
                }
                if(minAbsDiff == Integer.MAX_VALUE) minAbsDiff = 0;
                result[i][j] = minAbsDiff;
            }
        }
        return result;
    }
}