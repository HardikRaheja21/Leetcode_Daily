// Last updated: 2/10/2026, 3:16:57 PM
class Solution {
    public String kthSmallestPath(int[] destination, int k) {
        int v = destination[0];
        int h = destination[1];
        StringBuilder ans = new StringBuilder();
        
        // Precompute combinations up to (h + v)
        int n = h + v;
        long[][] comb = new long[n + 1][n + 1];
        for (int i = 0; i <= n; i++) {
            comb[i][0] = 1;
            for (int j = 1; j <= i; j++)
                comb[i][j] = comb[i - 1][j - 1] + comb[i - 1][j];
        }
        
        while (h > 0 || v > 0) {
            if (h == 0) {
                ans.append('V');
                v--;
            } else if (v == 0) {
                ans.append('H');
                h--;
            } else {
                long countH = comb[h + v - 1][v]; 
                if (k <= countH) {
                    ans.append('H');
                    h--;
                } else {
                    ans.append('V');
                    k -= countH;
                    v--;
                }
            }
        }
        
        return ans.toString();
    }
}
