// Last updated: 2/10/2026, 3:13:26 PM
class Solution {
    public long minimalKSum(int[] nums, int k) {
        Arrays.sort(nums);
        long sum = 0;
        long curr = 1;

        for (int num : nums) {
            if (num < curr) continue;

            long gap = num - curr;
            if (gap > 0) {
                long take = Math.min(gap, k);
                sum += take * (2 * curr + take - 1) / 2;
                k -= take;
                if (k == 0) return sum;
            }
            curr = num + 1;
        }

        // still need k numbers
        sum += (long) k * (2 * curr + k - 1) / 2;
        return sum;
    }
}