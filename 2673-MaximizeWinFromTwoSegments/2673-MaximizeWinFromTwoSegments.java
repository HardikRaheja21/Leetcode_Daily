// Last updated: 2/10/2026, 3:12:31 PM
class Solution {
    public int maximizeWin(int[] prizePositions, int k) {
        int n = prizePositions.length, ans = 0, j = 0;
        int[] best = new int[n + 1];
        for(int i = 0; i < n; i++){
            if (i > 0) best[i] = Math.max(best[i], best[i - 1]);
            while(j < n && prizePositions[j] <= prizePositions[i] + k) j++;
            int win = j - i;
            ans = Math.max(ans, win + best[i]);
            best[j] = Math.max(win, best[j]);
        }
        for (int t = 1; t <= n; t++) {
            best[t] = Math.max(best[t - 1], best[t]);
        }

        return ans;
    }
}