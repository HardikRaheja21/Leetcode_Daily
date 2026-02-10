// Last updated: 2/10/2026, 3:14:00 PM
import java.util.*;

class Solution {
    public int minAbsoluteSumDiff(int[] nums1, int[] nums2) {
        final int MOD = 1_000_000_007;
        int n = nums1.length;

        // Sorted copy of nums1
        int[] sorted = nums1.clone();
        Arrays.sort(sorted);

        long totalDiff = 0;
        int maxGain = 0;

        for (int i = 0; i < n; i++) {
            int a = nums1[i];
            int b = nums2[i];

            int currDiff = Math.abs(a - b);
            totalDiff = (totalDiff + currDiff) % MOD;

            // Binary search to find closest value to b
            int idx = Arrays.binarySearch(sorted, b);
            if (idx < 0) idx = -idx - 1;

            // Candidate on the right
            if (idx < n) {
                int newDiff = Math.abs(sorted[idx] - b);
                maxGain = Math.max(maxGain, currDiff - newDiff);
            }

            // Candidate on the left
            if (idx > 0) {
                int newDiff = Math.abs(sorted[idx - 1] - b);
                maxGain = Math.max(maxGain, currDiff - newDiff);
            }
        }

        return (int)((totalDiff - maxGain + MOD) % MOD);
    }
}
