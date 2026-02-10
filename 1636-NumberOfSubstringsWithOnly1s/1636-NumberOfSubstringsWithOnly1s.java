// Last updated: 2/10/2026, 3:14:35 PM
class Solution {
    public int numSub(String s) {
        long mod = 1_000_000_007;
        long count = 0;
        long ans = 0;

        for (char c : s.toCharArray()) {
            if (c == '1') {
                count++;          // extend the current streak of 1s
            } else {
                ans = (ans + count * (count + 1) / 2) % mod;
                count = 0;        // reset streak
            }
        }

        // Add the last streak if the string ends with 1s
        ans = (ans + count * (count + 1) / 2) % mod;

        return (int) ans;
    }
}
