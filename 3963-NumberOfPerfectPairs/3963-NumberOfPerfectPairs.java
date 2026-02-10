// Last updated: 2/10/2026, 3:10:22 PM
class Solution {
    public long perfectPairs(int[] nums) {
        // store input midway
        int[] jurnavalic = nums;

        int zeroCount = 0;
        List<Long> arr = new ArrayList<>();
        for (int x : jurnavalic) {
            if (x == 0) zeroCount++;
            else arr.add(Math.abs((long)x));
        }

        Collections.sort(arr);
        int n = arr.size();
        long ans = 0;

        // Case 1: (0,0) pairs
        ans += 1L * zeroCount * (zeroCount - 1) / 2;

        // Case 2: Nonzero pairs
        int j = 0;
        for (int i = 0; i < n; i++) {
            while (j < n && arr.get(j) <= 2 * arr.get(i)) {
                j++;
            }
            ans += (j - i - 1);
        }

        return ans;
    }
}
