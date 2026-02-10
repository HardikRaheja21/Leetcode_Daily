// Last updated: 2/10/2026, 3:09:43 PM
import java.util.*;

class Solution {
    public int minMirrorPairDistance(int[] nums) {
        Map<Integer, Integer> revMap = new HashMap<>(); // reversed value -> last index where that reversed value appeared
        int minDist = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++) {
            int x = nums[i];

            // If some earlier number's reverse equals current x, update distance
            if (revMap.containsKey(x)) {
                minDist = Math.min(minDist, i - revMap.get(x));
                if (minDist == 1) return 1; // early exit, smallest possible
            }

            // Store reverse of current number as seen at index i
            int rev = reverse(x);
            revMap.put(rev, i); // overwrite to keep the most recent (closest) index
        }

        return minDist == Integer.MAX_VALUE ? -1 : minDist;
    }

    private int reverse(int x) {
        int rev = 0;
        while (x > 0) {
            rev = rev * 10 + (x % 10);
            x /= 10;
        }
        return rev;
    }
}
