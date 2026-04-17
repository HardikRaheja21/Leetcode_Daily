// Last updated: 4/17/2026, 9:41:13 PM
1import java.util.*;
2
3class Solution {
4    public int minMirrorPairDistance(int[] nums) {
5        Map<Integer, Integer> revMap = new HashMap<>(); // reversed value -> last index where that reversed value appeared
6        int minDist = Integer.MAX_VALUE;
7
8        for (int i = 0; i < nums.length; i++) {
9            int x = nums[i];
10
11            // If some earlier number's reverse equals current x, update distance
12            if (revMap.containsKey(x)) {
13                minDist = Math.min(minDist, i - revMap.get(x));
14                if (minDist == 1) return 1; // early exit, smallest possible
15            }
16
17            // Store reverse of current number as seen at index i
18            int rev = reverse(x);
19            revMap.put(rev, i); // overwrite to keep the most recent (closest) index
20        }
21
22        return minDist == Integer.MAX_VALUE ? -1 : minDist;
23    }
24
25    private int reverse(int x) {
26        int rev = 0;
27        while (x > 0) {
28            rev = rev * 10 + (x % 10);
29            x /= 10;
30        }
31        return rev;
32    }
33}
34