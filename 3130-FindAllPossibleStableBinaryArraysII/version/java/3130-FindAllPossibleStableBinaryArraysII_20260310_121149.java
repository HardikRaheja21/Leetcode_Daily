// Last updated: 3/10/2026, 12:11:49 PM
1class Solution {
2    static final int MOD = 1_000_000_007;
3
4    public int numberOfStableArrays(int zero, int one, int limit) {
5        long[][] dp0 = new long[zero + 1][one + 1];
6        long[][] dp1 = new long[zero + 1][one + 1];
7
8        long[][] pref0 = new long[zero + 1][one + 1];
9        long[][] pref1 = new long[zero + 1][one + 1];
10
11        dp0[0][0] = dp1[0][0] = 1;
12
13        for (int z = 0; z <= zero; z++) {
14            for (int o = 0; o <= one; o++) {
15
16                if (z > 0) {
17                    int left = Math.max(0, z - limit);
18                    long val = pref1[z - 1][o];
19                    if (left > 0) val = (val - pref1[left - 1][o] + MOD) % MOD;
20                    dp0[z][o] = val;
21                }
22
23                if (o > 0) {
24                    int left = Math.max(0, o - limit);
25                    long val = pref0[z][o - 1];
26                    if (left > 0) val = (val - pref0[z][left - 1] + MOD) % MOD;
27                    dp1[z][o] = val;
28                }
29
30                pref0[z][o] = ((o > 0 ? pref0[z][o - 1] : 0) + dp0[z][o]) % MOD;
31                pref1[z][o] = ((z > 0 ? pref1[z - 1][o] : 0) + dp1[z][o]) % MOD;
32            }
33        }
34
35        return (int)((dp0[zero][one] + dp1[zero][one]) % MOD);
36    }
37}
38