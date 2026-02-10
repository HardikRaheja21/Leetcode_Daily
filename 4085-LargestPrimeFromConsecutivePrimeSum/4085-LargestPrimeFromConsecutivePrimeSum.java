// Last updated: 2/10/2026, 3:09:48 PM
class Solution {
    public int largestPrime(int n) {
        if (n < 2) return 0;

        // Step 1: Sieve of Eratosthenes
        boolean[] isPrime = new boolean[n + 1];
        for (int i = 2; i <= n; i++) isPrime[i] = true;

        for (int i = 2; i * i <= n; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= n; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        // Step 2: Collect primes
        int[] primes = new int[n]; // safe upper bound
        int count = 0;
        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) {
                primes[count++] = i;
            }
        }

        // Step 3: Prefix sums from 2
        int sum = 0;
        int answer = 0;

        for (int i = 0; i < count; i++) {
            sum += primes[i];
            if (sum > n) break;
            if (isPrime[sum]) {
                answer = sum;
            }
        }

        return answer;
    }
}
