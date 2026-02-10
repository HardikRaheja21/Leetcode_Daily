// Last updated: 2/10/2026, 3:18:18 PM
class Solution {
    public int countPrimes(int n) {
//         Approach:
// Sieve of Eratosthenes:
// Create a boolean array isPrime where each element represents whether the corresponding index is a prime number.
// Start by assuming all numbers greater than 1 are prime.
// For each number p starting from 2, if p is prime, mark all multiples of p as non-prime.
// Continue this process for each number up to 
// \U0001d45b
// n
// ​
//  .
// Count the numbers that remain marked as prime.
        if(n <= 2){
            return 0;
        }

        // Initialize a boolean array for marking primes
        boolean[] isPrime = new boolean[n];
        for(int i = 2; i < n; i++){
            isPrime[i] = true; // Initially assume all numbers >= 2 are prime
        }

        // Apply the Sieve of Eratosthenes algorithm
        for(int i = 2; i * i < n; i++){
            if(isPrime[i]){
                // Mark all multiples of i as non-prime
                for(int j = i * i; j < n; j += i){
                    isPrime[j] = false;
                }
            }
        }

        //Count Primes
        int count = 0;
        for(int i = 2; i < n; i++){
            if(isPrime[i]){
                count++;
            }
        }
        return count;
    }
}