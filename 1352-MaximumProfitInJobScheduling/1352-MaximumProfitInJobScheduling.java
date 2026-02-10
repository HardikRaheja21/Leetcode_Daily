// Last updated: 2/10/2026, 3:15:06 PM
class Solution {
    public int jobScheduling(int[] startTime, int[] endTime, int[] profit) {
        int n = startTime.length;

        int[][] jobs = new int[n][3];
        for (int i = 0; i < n; i++) {
            jobs[i][0] = startTime[i];
            jobs[i][1] = endTime[i];
            jobs[i][2] = profit[i];
        }

        // Sort by end time
        Arrays.sort(jobs, (a, b) -> a[1] - b[1]);

        int[] dp = new int[n];
        dp[0] = jobs[0][2];

        for (int i = 1; i < n; i++) {
            int include = jobs[i][2];
            int last = findLastNonConflict(jobs, i);
            if (last != -1) {
                include += dp[last];
            }

            dp[i] = Math.max(dp[i - 1], include);
        }

        return dp[n - 1];
    }

    private int findLastNonConflict(int[][] jobs, int index) {
        int low = 0, high = index - 1;
        int start = jobs[index][0];

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (jobs[mid][1] <= start) {
                if (mid == high || jobs[mid + 1][1] > start)
                    return mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }
}
