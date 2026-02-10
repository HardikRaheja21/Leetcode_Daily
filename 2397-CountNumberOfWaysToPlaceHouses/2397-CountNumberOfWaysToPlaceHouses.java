// Last updated: 2/10/2026, 3:13:11 PM
class Solution {
    public int countHousePlacements(int n) {
        final int MOD = 1_000_000_007;

        // Initially, for 1 plot:
        // 1 way ending with a house, 1 way ending with no house
        long house = 1; 
        long space = 1; 
        long total = house + space;

        for (int i = 2; i <= n; ++i) {
            // If we place a house at position i, previous must be empty
            house = space;
            // If we don't place a house, previous can be either
            space = total;
            // Total ways for this length
            total = (house + space) % MOD;
        }

        // Ways for both sides (independent) = total^2 % MOD
        return (int) ((total * total) % MOD);
    }
}
