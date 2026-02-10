// Last updated: 2/10/2026, 3:11:16 PM
class Solution {
    private Integer[] memo;
    private int n;
    private int K;
    private List<Integer> strength;

    public int findMinimumTime(List<Integer> strength, int K) {
        this.n = strength.size();
        this.memo = new Integer[1 << n];
        this.K = K;
        this.strength = strength;
        return dfs(0);
    }

    private int dfs(int mask) {
        if (mask == (1 << n) - 1) return 0;
        if (memo[mask] != null) return memo[mask];

        int cnt = Integer.bitCount(mask);
        int x = 1 + cnt * K;
        int ans = Integer.MAX_VALUE;

        for (int j = 0; j < n; j++) {
            if ((mask >> j & 1) == 0) {
                int time = (strength.get(j) + x - 1) / x;
                ans = Math.min(ans, dfs(mask | (1 << j)) + time);
            }
        }

        memo[mask] = ans;
        return ans;
    }
}
