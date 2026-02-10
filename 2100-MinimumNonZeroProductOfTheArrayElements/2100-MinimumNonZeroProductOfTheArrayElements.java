// Last updated: 2/10/2026, 3:13:46 PM
class Solution {
    static final long MOD = 1_000_000_007;

    public int minNonZeroProduct(int p) {
        long max = (1L << p) - 1;                 // 2^p - 1
        long power = (1L << (p - 1)) - 1;         // 2^(p-1) - 1
        
        long res = modPow(max - 1, power);
        res = (res * (max % MOD)) % MOD;
        
        return (int) res;
    }

    private long modPow(long base, long exp) {
        long result = 1;
        base %= MOD;
        
        while (exp > 0) {
            if ((exp & 1) == 1) {
                result = (result * base) % MOD;
            }
            base = (base * base) % MOD;
            exp >>= 1;
        }
        return result;
    }
}
