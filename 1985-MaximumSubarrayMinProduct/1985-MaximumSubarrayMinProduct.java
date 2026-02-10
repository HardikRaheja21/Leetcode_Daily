// Last updated: 2/10/2026, 3:13:57 PM
import java.util.*;

class Solution {
    public int maxSumMinProduct(int[] n) {
        Stack<Integer> st = new Stack<>();
        long[] dp = new long[n.length + 1];
        long res = 0;
        long MOD = 1000000007;

        for (int i = 0; i < n.length; i++) {
            dp[i + 1] = dp[i] + n[i];
        }

        for (int i = 0; i <= n.length; i++) {
            while (!st.empty() && (i == n.length || n[st.peek()] > n[i])) {
                int j = st.pop();
                long sum = dp[i] - dp[st.empty() ? 0 : st.peek() + 1];
                res = Math.max(res, sum * n[j]);
            }
            st.push(i);
        }

        return (int)(res % MOD);
    }
}
