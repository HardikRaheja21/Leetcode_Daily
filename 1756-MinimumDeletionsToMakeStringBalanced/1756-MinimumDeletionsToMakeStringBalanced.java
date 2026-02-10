// Last updated: 2/10/2026, 3:14:24 PM
class Solution {
    public int minimumDeletions(String s) {
        int dp = 0, bCount = 0;
        for (char c : s.toCharArray()) {
            if (c == 'b') {
                // No deletion needed for 'b'
                bCount++;
            } else {
                // For 'a': either delete this 'a' (dp+1),
                // or keep 'a' and delete all previous 'b's (bCount)
                dp = Math.min(dp + 1, bCount);
            }
        }
        return dp;
    }
}