// Last updated: 2/28/2026, 11:16:32 AM
1class Solution {
2    public int concatenatedBinary(int n) {
3        int MOD = 1000000007;
4        long result = 0;
5        int bitLength = 0;
6
7        for (int i = 1; i <= n; i++) {
8
9            // if i is power of 2 → new bit length
10            if ((i & (i - 1)) == 0) {
11                bitLength++;
12            }
13
14            result = ((result << bitLength) + i) % MOD;
15        }
16
17        return (int) result;
18    }
19}