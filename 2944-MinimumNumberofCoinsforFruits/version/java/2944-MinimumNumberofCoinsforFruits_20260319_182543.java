// Last updated: 3/19/2026, 6:25:43 PM
1class Solution {
2        public int minimumCoins(int[] A) {
3        int n = A.length, dp[] = new int[n + 1];
4        Deque<Integer> q = new ArrayDeque<>();
5        for (int i = 0; i < n; i++) {
6            while (!q.isEmpty() && (q.getFirst() + 1) * 2 < i + 1)
7                q.removeFirst();
8            while (!q.isEmpty() && dp[q.getLast()] + A[q.getLast()] >= dp[i] + A[i])
9                q.removeLast();
10            q.addLast(i);
11            dp[i + 1] = dp[q.getFirst()] + A[q.getFirst()];
12        }
13        return dp[n];
14    }
15}