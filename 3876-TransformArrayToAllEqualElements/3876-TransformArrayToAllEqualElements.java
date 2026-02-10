// Last updated: 2/10/2026, 3:10:57 PM
class Solution {
    public boolean canMakeEqual(int[] nums, int k) {
        return canMakeAll(nums, k, 1) || canMakeAll(nums, k, -1);
    }

    private boolean canMakeAll(int[] nums, int k, int target) {
        int n = nums.length;
        int[] flipped = new int[n]; // flip marker array
        int flip = 0;
        int operations = 0;

        for (int i = 0; i < n - 1; i++) {
            int current = nums[i];
            if (flip % 2 == 1) current *= -1; // if flipped odd times, it's negated

            if (current != target) {
                if (i >= n - 1) return false; // can't flip last element
                operations++;
                if (operations > k) return false;

                flip++; // we apply a flip at i
                flipped[i] = 1;
            }

            if (i - 1 >= 0) flip -= flipped[i - 1]; // remove expired flip
        }

        // Check last element manually
        int last = nums[n - 1];
        int totalFlips = 0;
        for (int i = Math.max(0, n - 2); i < n - 1; i++) {
            totalFlips += flipped[i];
        }
        if (totalFlips % 2 == 1) last *= -1;

        return last == target;
    }
}
