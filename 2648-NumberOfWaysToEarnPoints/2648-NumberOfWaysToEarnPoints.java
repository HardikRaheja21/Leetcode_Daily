// Last updated: 2/10/2026, 3:12:33 PM
class Solution {
    private static final int MOD = 1000000007;
    public int waysToReachTarget(int target, int[][] types) {// DP array to store number of ways to achieve each score from 0 to target
        int[] dp = new int[target + 1];
        dp[0] = 1; // There is one way to get 0 points

        // Process each type of question
        for (int[] type : types) {
            int count = type[0]; // Number of questions of this type
            int marks = type[1]; // Marks for each question of this type

            // For each type, update dp in reverse order to prevent using the same type multiple times
            for (int i = target; i >= 0; i--) {
                // Try taking from 1 to count questions
                for (int k = 1; k <= count; k++) {
                    int score = k * marks; // Total score if we take k questions
                    if (i >= score) {
                        dp[i] = (dp[i] + dp[i - score]) % MOD; // Update the ways
                    } else {
                        break; // No need to check further if score exceeds current target
                    }
                }
            }
        }

        return dp[target];
        
    }
}