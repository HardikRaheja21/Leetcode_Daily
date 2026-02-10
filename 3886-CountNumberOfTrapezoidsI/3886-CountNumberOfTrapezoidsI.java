// Last updated: 2/10/2026, 3:10:50 PM
import java.util.*;

class Solution {
    public int countTrapezoids(int[][] points) {
        final int MOD = 1_000_000_007;

        Map<Integer, Integer> yMap = new HashMap<>();
        for (int[] point : points) {
            int y = point[1];
            yMap.put(y, yMap.getOrDefault(y, 0) + 1);
        }

        long sum = 0;
        long squareSum = 0;

        for (int count : yMap.values()) {
            if (count >= 2) {
                long c = (long) count * (count - 1) / 2;
                sum = (sum + c) % MOD;
                squareSum = (squareSum + (c * c) % MOD) % MOD;
            }
        }

        long result = ((sum * sum) % MOD - squareSum + MOD) % MOD;
        result = (result * modInverse(2, MOD)) % MOD;  // divide by 2 under modulo

        return (int) result;
    }

    // Modular inverse using Fermat's Little Theorem
    private long modInverse(long a, int mod) {
        return power(a, mod - 2, mod);
    }

    private long power(long x, long y, int mod) {
        long result = 1;
        x = x % mod;
        while (y > 0) {
            if ((y & 1) == 1)
                result = (result * x) % mod;
            y >>= 1;
            x = (x * x) % mod;
        }
        return result;
    }
}
