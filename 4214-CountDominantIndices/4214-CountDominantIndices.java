// Last updated: 2/12/2026, 5:33:46 PM
class Solution {
    public int dominantIndices(int[] nums) {
        int n = nums.length;

        // prefix sum
        long[] prefix = new long[n];
        prefix[0] = nums[0];
        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + nums[i];
        }

        int count = 0;
        long totalSum = prefix[n - 1];

        for (int i = 0; i < n - 1; i++) {
            long rightSum = totalSum - prefix[i];   // sum of elements to the right
            int rightCount = n - i - 1;

            double avg = (double) rightSum / rightCount;
            if (nums[i] > avg) count++;
        }

        return count;
    }
}