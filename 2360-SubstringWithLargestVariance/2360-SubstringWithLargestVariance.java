// Last updated: 2/10/2026, 3:13:16 PM
class Solution {
    public int largestVariance(String s) {
        int ans = 0;
        int n = s.length();
        int[] freq = new int[26];

        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }

        for (int x = 0; x < 26; x++) {
            for (int y = 0; y < 26; y++) {
                if (x == y || freq[x] == 0 || freq[y] == 0) continue;

                int countX = 0, countY = 0;
                int remainingY = freq[y];

                for (char c : s.toCharArray()) {
                    if (c - 'a' == x) countX++;
                    if (c - 'a' == y) {
                        countY++;
                        remainingY--;
                    }

                    if (countY > 0) {
                        ans = Math.max(ans, countX - countY);
                    }

                    // reset ONLY if future y exists
                    if (countX < countY && remainingY > 0) {
                        countX = 0;
                        countY = 0;
                    }
                }
            }
        }
        return ans;
    }
}
