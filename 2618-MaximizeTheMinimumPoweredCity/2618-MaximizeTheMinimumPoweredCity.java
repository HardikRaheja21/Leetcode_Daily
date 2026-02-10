// Last updated: 2/10/2026, 3:12:40 PM
class Solution {
    public long maxPower(int[] stations, int r, int k) {
        int n = stations.length;
        long[] power = new long[n];
        long[] prefix = new long[n + 1];

        // Prefix sum of stations
        for (int i = 0; i < n; i++) {
            prefix[i + 1] = prefix[i] + stations[i];
        }

        // Initial power at each city
        for (int i = 0; i < n; i++) {
            int l = Math.max(0, i - r);
            int h = Math.min(n - 1, i + r);
            power[i] = prefix[h + 1] - prefix[l];
        }

        long low = Long.MAX_VALUE, high = 0;
        for (long p : power) {
            low = Math.min(low, p);
            high = Math.max(high, p);
        }
        high += k;

        // Binary search
        while (low < high) {
            long mid = (low + high + 1) / 2;
            if (canAchieve(power, r, k, mid)) {
                low = mid;
            } else {
                high = mid - 1;
            }
        }
        return low;
    }

    private boolean canAchieve(long[] power, int r, int k, long target) {
        int n = power.length;
        long[] diff = new long[n + 1];
        long used = 0, currAdd = 0;

        for (int i = 0; i < n; i++) {
            currAdd += diff[i];
            long currPower = power[i] + currAdd;

            if (currPower < target) {
                long need = target - currPower;
                used += need;
                if (used > k) return false;

                currAdd += need;
                int end = Math.min(n, i + 2 * r + 1);
                if (end < diff.length) diff[end] -= need;
            }
        }
        return true;
    }
}
