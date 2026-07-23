// Last updated: 7/23/2026, 9:03:55 AM
1class Solution {
2    public int uniqueXorTriplets(int[] nums) {
3        int n = nums.length;
4
5        if (n < 3) return n;
6
7        int ans = 1;
8        while (ans <= n) {
9            ans <<= 1;
10        }
11
12        return ans;
13    }
14}