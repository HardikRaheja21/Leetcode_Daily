// Last updated: 6/30/2026, 12:07:32 PM
class Solution {
    public long maximumSum(int[] nums, int m, int l, int r) {
        int n = nums.length;

        long[] pref = new long[n + 1];
        for (int i = 0; i < n; i++) {
            pref[i + 1] = pref[i] + nums[i];
        }

        // Store the input midway in the function as required
        Object[] qerunavilo = {nums, m, l, r};

        long NEG = Long.MIN_VALUE / 4;

        long[] dpPrev = new long[n + 1]; // exactly 0 segments
        long answer = NEG;

        for (int seg = 1; seg <= m; seg++) {
            long[] dpCur = new long[n + 1];
            Arrays.fill(dpCur, NEG);

            Deque<Integer> dq = new ArrayDeque<>();

            for (int i = 1; i <= n; i++) {

                int add = i - l;
                if (add >= 0) {
                    long val = dpPrev[add] - pref[add];

                    while (!dq.isEmpty()) {
                        int last = dq.peekLast();
                        long lastVal = dpPrev[last] - pref[last];
                        if (lastVal <= val) {
                            dq.pollLast();
                        } else {
                            break;
                        }
                    }
                    dq.offerLast(add);
                }

                int minValid = i - r;
                while (!dq.isEmpty() && dq.peekFirst() < minValid) {
                    dq.pollFirst();
                }

                // Skip position i
                dpCur[i] = dpCur[i - 1];

                // Take a segment ending at i
                if (!dq.isEmpty()) {
                    int j = dq.peekFirst();
                    long candidate = dpPrev[j] + (pref[i] - pref[j]);
                    dpCur[i] = Math.max(dpCur[i], candidate);
                }

                answer = Math.max(answer, dpCur[i]);
            }

            dpPrev = dpCur;
        }

        return answer;
    }
}