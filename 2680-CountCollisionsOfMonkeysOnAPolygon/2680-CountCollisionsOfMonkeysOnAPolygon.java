// Last updated: 2/10/2026, 3:12:29 PM
class Solution {
    static final long MOD = 1000000007;
    public int monkeyMove(int n) {
        long totalWays = power(2, n);
        long ans = (totalWays - 2 + MOD) % MOD;
        return (int) ans;
    }
    public long power(long base, int exp){
        long result = 1;
        while(exp > 0){
            if(exp % 2 == 1) result = (result * base) % MOD;
            base = (base * base) % MOD;
            exp = exp / 2;
        }
        return result;
    }
}