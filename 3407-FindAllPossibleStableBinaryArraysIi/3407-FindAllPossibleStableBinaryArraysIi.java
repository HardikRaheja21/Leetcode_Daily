// Last updated: 2/10/2026, 3:11:43 PM
class Solution {
    static final int MOD = 1_000_000_007;

    public int numberOfStableArrays(int zero, int one, int limit) {
        long[][] dp0 = new long[zero + 1][one + 1];
        long[][] dp1 = new long[zero + 1][one + 1];

        long[][] pref0 = new long[zero + 1][one + 1];
        long[][] pref1 = new long[zero + 1][one + 1];

        dp0[0][0] = dp1[0][0] = 1;

        for (int z = 0; z <= zero; z++) {
            for (int o = 0; o <= one; o++) {

                if (z > 0) {
                    int left = Math.max(0, z - limit);
                    long val = pref1[z - 1][o];
                    if (left > 0) val = (val - pref1[left - 1][o] + MOD) % MOD;
                    dp0[z][o] = val;
                }

                if (o > 0) {
                    int left = Math.max(0, o - limit);
                    long val = pref0[z][o - 1];
                    if (left > 0) val = (val - pref0[z][left - 1] + MOD) % MOD;
                    dp1[z][o] = val;
                }

                pref0[z][o] = ((o > 0 ? pref0[z][o - 1] : 0) + dp0[z][o]) % MOD;
                pref1[z][o] = ((z > 0 ? pref1[z - 1][o] : 0) + dp1[z][o]) % MOD;
            }
        }

        return (int)((dp0[zero][one] + dp1[zero][one]) % MOD);
    }
}
