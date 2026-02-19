// Last updated: 2/19/2026, 3:11:05 PM
class Solution {
    public int almostPalindromic(String s) {
        int n = s.length();
        if (n <= 2)
            return n;

        int result = 1;
        for (int i = 0; i < n; ++i) {
            // Check two centers: odd (i,i) and even (i,i+1)
            for (int t = 0; t < 2; ++t) {
                int l0 = i, r0 = i + t;

                // Expand the palindrome first
                int[] p = expand(s, n, l0, r0);
                int l = p[0], r = p[1];
                result = Math.max(result, r - l);

                // Skip one left
                int[] p1 = expand(s, n, l - 1, r);
                int l1 = p1[0], r1 = p1[1];
                result = Math.max(result, r1 - l1 - 1);

                // Skip one right
                int[] p2 = expand(s, n, l, r + 1);
                int l2 = p2[0], r2 = p2[1];
                result = Math.max(result, r2 - l2 - 1);

                // Early stop: substring can't be bigger than n
                if (result >= n)
                    return n;
            }
        }
        return result;
    }

    private int[] expand(String s, int n, int l, int r) {
        while (l >= 0 && r < n && s.charAt(l) == s.charAt(r)) { --l; ++r; }
        return new int[] { l, r }; // palindrome is s[l+1 .. r-1]
    }
}